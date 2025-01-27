package org.example.customjavanonreactapp.service;

import lombok.RequiredArgsConstructor;
import org.example.customjavanonreactapp.modal.Data;
import org.example.customjavanonreactapp.modal.DataDto;
import org.example.customjavanonreactapp.repository.DataRepo;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomService {

    private final DataRepo dataRepo;

    public Data getData() {
        try {
            Thread.sleep(2000);
        var data = dataRepo.findFirstByOrderByRequestCameTimeAsc();
        return data.orElse(null);
                } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("error happened");
        }
    }

    public Data saveData(DataDto dto) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        var data = Data.builder()
                .data(dto.data())
                .requestCameTime(System.currentTimeMillis())
                .build();
        return dataRepo.save(data);
    }
}
