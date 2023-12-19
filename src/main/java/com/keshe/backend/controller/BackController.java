package com.keshe.backend.controller;

import com.keshe.backend.common.Result;
import com.keshe.backend.dto.BackNumDto;
import com.keshe.backend.service.impl.BackServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BackController {
    @Autowired
    private BackServiceImpl backService;

    @GetMapping("/quantity")
    public Result queryOrderNum(){
        List<BackNumDto> result=backService.queryOrderNum();
        return Result.success(result);
    }
}
