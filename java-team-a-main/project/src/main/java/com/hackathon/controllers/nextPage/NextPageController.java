package com.hackathon.controllers.nextPage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hackathon.Form.ChatForm;
import com.hackathon.services.MatchingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class NextPageController {

    @Autowired
    private MatchingService matchingService;

    @GetMapping(value = "/demo")
    public String index(Model model, @RequestParam("matchingId") Long matchingId, @RequestParam("name") String name) {
        String url = matchingService.matching(matchingId);
        model.addAttribute("url", url);
        model.addAttribute("chatName", name);
        model.addAttribute("chatForm", new ChatForm());
        model.addAttribute("matchingId", matchingId);
        return "nextpage/index";
    }
}
