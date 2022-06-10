package org.example.customjavanonreactapp.repository;

import org.example.customjavanonreactapp.modal.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface DataRepo extends JpaRepository<Data, Long> {

    Optional<Data> findFirstByOrderByRequestCameTimeAsc();
}
