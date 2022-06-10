package org.example.customjavanonreactapp;


import lombok.RequiredArgsConstructor;
import org.example.customjavanonreactapp.modal.Data;
import org.example.customjavanonreactapp.repository.DataRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.UUID;

@SpringBootApplication
@RequiredArgsConstructor
public class Application {

    private final DataRepo dataRepo;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @PostConstruct
    void saveOneData() {
        var data = Data.builder()
                .data("some Data")
                .requestCameTime(0L)
                .build();
        dataRepo.save(data);
    }
}

