package com.example.palautettava23.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.palautettava23.domain.Friend;


@Controller
public class FriendController {
    List<Friend> friendList = new ArrayList<>();

    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("newfriend", new Friend());
        model.addAttribute("kaverit", friendList);
        return "index";
    }

    @PostMapping("/addFriend")
    public String addFriend(@ModelAttribute Friend newFriend, Model model) {
        friendList.add(newFriend);
        model.addAttribute("kaverit", friendList);
        return "redirect:/index";
    }
}






