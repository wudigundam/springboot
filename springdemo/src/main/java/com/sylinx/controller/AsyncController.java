package com.sylinx.controller;

import com.sylinx.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class AsyncController {
    public static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    @Autowired
    private AsyncService asyncService;

    @GetMapping("/aysnc1")
    public String async1(){
        asyncService.sendMsg("123123" );
        // 订单搞定之后就可以返回
        return "sss" + simpleDateFormat.format(new Date(System.currentTimeMillis()));
    }
}
