package com.kob.backend.controller.search;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController {

    @GetMapping("/search")
    public String searchMsg(HttpServletRequest msg){
        System.out.println("接受信息："+msg.getParameter("message"));
        return "nb";
    }
}
