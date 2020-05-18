package com.spring.study.mvcexam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.study.mvcexam.dto.PlusResult;

@Controller
public class PlusApiController {
    @GetMapping("/api/plus")
    @ResponseBody // view의 이름을 return하는 것이 아니라 object를 return하고 이를 print하도록 한다
    public PlusResult plus(@RequestParam("value1") int value1, @RequestParam("value2") int value2){
        PlusResult plusResult = new PlusResult();
        plusResult.setValue1(value1);
        plusResult.setValue2(value2);
        plusResult.setResult(value1 + value2);
        return plusResult;
    }
}