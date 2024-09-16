package com.hackathon.controllers.nextPage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.Form.ChatForm;
import com.hackathon.services.ChatService;

@RestController
public class ChatApiController {

    @Autowired
    ChatService chatService;

    @GetMapping("/api/getChat")
    public List<ChatForm> getMethodName() {
        List<ChatForm> chats = chatService.getChat();
        return chats;
    }

}
