package com.Myapp.firstapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/") // ถ้าผู้ใช้ส่ง Request มาที่ Path "/" ก็จะให้เรียกใช้ Method display()
    public String display(){
        return "Hello SpringBoot";
    }

    @GetMapping("/about") // ถ้าผู้ใช้ส่ง Request มาที่ Path "/about" ก็จะให้เรียกใช้ Method about()
    public String about(){
        return "เกี่ยวกับเรา";
    }

    @GetMapping("/contact") // ถ้าผู้ใช้ส่ง Request มาที่ Path "/about" ก็จะให้เรียกใช้ Method about()
    public String contact(){
        return "ติดต่อ";
    }
}
