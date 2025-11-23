package com.azuread.oauth2.controller;

import com.azuread.oauth2.pojo.Student;
import com.sun.net.httpserver.HttpsParameters;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class RequestController {

    @GetMapping("/getStudents")
    ResponseEntity<List<Student>> getResponse(@RequestParam("id") String id) {

        List<Student> list = new ArrayList<>();
        list.add(new Student("1", "A"));
        list.add(new Student("2", "B"));

        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
