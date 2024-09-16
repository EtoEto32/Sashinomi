package com.hackathon.controllers.nextPage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.hackathon.Form.ChatForm;
import com.hackathon.services.ChatService;

@Controller
public class ChatController {

    @Autowired
    ChatService chatService;

    @PostMapping("/register")
    public String register(@ModelAttribute ChatForm chatForm, Model model) {
        chatService.registerChat(chatForm);
        ChatForm chat = new ChatForm();
        model.addAttribute("chatName", chatForm.getName());
        model.addAttribute("chatForm", new ChatForm());
        return "nextpage/index";
    }
}
