package org.example.customjavanonreactapp.controller;

import lombok.RequiredArgsConstructor;
import org.example.customjavanonreactapp.modal.Data;
import org.example.customjavanonreactapp.modal.DataDto;
import org.example.customjavanonreactapp.service.CustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CustomController {

    private final CustomService customService;

    @GetMapping(value = "/data")
    public Data getData() {
        return customService.getData();
    }

    @PostMapping("/data")
    public Data saveData(@RequestBody DataDto data) {
        return customService.saveData(data);
    }

}
