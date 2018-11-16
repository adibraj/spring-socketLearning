//package com.adib.socket.socketDemo.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.messaging.simp.SimpMessagingTemplate;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//
//@Component
//public class MessageScheduler {
//
//  @Autowired
//  SimpMessagingTemplate simpMessagingTemplate;
//
//  @Scheduled(fixedDelay = 5000)
//  public void sendMessage() {
//    simpMessagingTemplate.convertAndSendToUser("MC","/topic/message", "asd + asd");
//  }
//}
