package com.sit.teach.controller;

import com.sit.teach.services.LiveServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LiveControll {

    @Autowired
    LiveServer liveserver;

    @RequestMapping("/live")
    public String live(){
        return liveserver.live();
    }

}
