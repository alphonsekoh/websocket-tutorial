package com.example.websocketdemo;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

/**
 * Enabling WebSocket message handling, backed by a message broker.
 * From the WebsocketMessageBrokerConfigurer interface, we override two methods:
 * 1. configureMessageBroker() configures a message broker to route messages from one client to another.
 * 2. registerStompEndpoints() registers the "/chat" endpoint, enabling SockJS fallback options so that alternate transports can be used if WebSocket is not available.
 */
@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer{
    @Override
    public void configureMessageBroker(MessageBrokerRegistry config) {
        config.enableSimpleBroker("/topic");
        config.setApplicationDestinationPrefixes("/app");
    }

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/chat");
        registry.addEndpoint("/chat").withSockJS();
    }
}