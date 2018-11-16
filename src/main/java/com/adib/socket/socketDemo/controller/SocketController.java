package com.adib.socket.socketDemo.controller;

import java.security.Principal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageExceptionHandler;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.messaging.simp.annotation.SendToUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

@Controller
@CrossOrigin("*")
public class SocketController {

  @Autowired
  private SimpMessagingTemplate simpMessagingTemplate;

  //  @MessageMapping("/secured/user/ads")
//  public void getMessage(Principal principal, String message) {
//    System.out.println(principal.getName());
//    simpMessagingTemplate.convertAndSendToUser(
//        message, "/secured/user/queue/specific-user", "hi adib");
//  }
  @MessageMapping("/message")
  @SendToUser("/queue/reply")
  public String processMessageFromClient(@Payload String message, Principal principal)
      throws Exception {
//  String name = new Gson().fromJson(message, Map.class).get("name").toString();
    //messagingTemplate.convertAndSendToUser(principal.getName(), "/queue/reply", name);
    System.out.println(principal.getName());
    return message;
  }

  @MessageMapping("/messageTo")
  public void processMessageFromClien1t(@Payload String message, Principal principal)
      throws Exception {
//  String name = new Gson().fromJson(message, Map.class).get("name").toString();
    simpMessagingTemplate
        .convertAndSendToUser(message, "/queue/reply", "from" + principal.getName());
    System.out.println(principal.getName());

  }

  @MessageExceptionHandler
  @SendToUser("/queue/errors")
  public String handleException(Throwable exception) {
    return exception.getMessage();
  }

}
