package com.example.demo.web;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;
import java.util.HashMap;

@ControllerAdvice
public class ExceptionHandle {

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Map<String,Object> exceptionHandle()
    {
        Map<String,Object> map = new HashMap<String,Object>();

        map.put("errorCode","101");
        map.put("errorMsg","系统错误");

        return map;
    }
}
