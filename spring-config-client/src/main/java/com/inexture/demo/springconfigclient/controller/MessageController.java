package com.inexture.demo.springconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class MessageController {

	@Value("${msg:Hello Kandarp - Config Server is not working..pelase check}")
    private String msg;
 
    @RequestMapping("/msg")
    String getMsg() {
        return this.msg;
    }

}
