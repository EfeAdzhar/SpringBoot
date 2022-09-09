package com.zoolatech.registration.controller;

import com.zoolatech.registration.dto.Student;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@RestController
public class RegistrationController {
    Map<Integer, String> userMap = new ConcurrentHashMap<>();

    @GetMapping(path = "user/${id}")
    public String getAllUsersId(@RequestParam(name = "id", required = true) int id) {
        if(!userMap.isEmpty()) {
                if (userMap.containsKey(id)) {
                    for (Map.Entry<Integer, String> entry : userMap.entrySet()) {
                        return "Found user with such id: " + entry.getKey() + " " + entry.getValue();
                    }
                }
            }
        return "No users";
    }

    @PostMapping(path = "user")
    public String getUser(@RequestBody Student student) {
        userMap.put(student.getId(), student.getName());
        return student.getName();
    }
}