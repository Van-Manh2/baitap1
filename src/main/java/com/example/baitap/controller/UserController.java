package com.example.baitap.controller;
import org.apache.catalina.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    // Nhập thông tin người dùng
    @PostMapping("/submit")
    public ResponseEntity<String> submitUser(@RequestBody User user) {
        System.out.println("Received data: " + user);
        return ResponseEntity.ok("User data received successfully");
    }

    // Cập nhật thông tin người dùng
    @PostMapping("/update")
    public ResponseEntity<String> updateUser(@RequestBody User user) {
        System.out.println("Updated data: " + user);
        return ResponseEntity.ok("User data updated successfully");
    }
}

