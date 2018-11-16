//package com.adib.socket.socketDemo.config;
//
//import java.util.Map;
//import javax.servlet.http.HttpSession;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.server.ServerHttpRequest;
//import org.springframework.http.server.ServerHttpResponse;
//import org.springframework.http.server.ServletServerHttpRequest;
//import org.springframework.security.config.annotation.web.messaging.MessageSecurityMetadataSourceRegistry;
//import org.springframework.security.config.annotation.web.socket.AbstractSecurityWebSocketMessageBrokerConfigurer;
//import org.springframework.web.socket.WebSocketHandler;
//import org.springframework.web.socket.server.HandshakeInterceptor;
//
////@Configuration
////public class SocketHandler extends AbstractSecurityWebSocketMessageBrokerConfigurer {
////
////  @Override
////  protected boolean sameOriginDisabled() {
////    return true;
////  }
////
////  @Override
////  protected void configureInbound(MessageSecurityMetadataSourceRegistry messages) {
////    messages
////        .simpDestMatchers("/secured/**", "/secured/**/**").authenticated()
////        .anyMessage().authenticated();
////  }
////}
//@Configuration
//public class SocketHandler implements HandshakeInterceptor {
//
//  @Override
//  public boolean beforeHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler,
//      Map attributes) throws Exception {
//    if (request instanceof ServletServerHttpRequest) {
//      ServletServerHttpRequest servletRequest = (ServletServerHttpRequest) request;
//      HttpSession session = servletRequest.getServletRequest().getSession();
//      attributes.put("sessionId", session.getId());
//    }
//    return true;
//  }
//
//  public void afterHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler,
//      Exception ex) {
//  }
//}