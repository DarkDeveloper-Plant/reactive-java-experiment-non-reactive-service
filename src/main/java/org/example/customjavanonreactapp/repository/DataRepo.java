package org.example.customjavanonreactapp.repository;

import org.example.customjavanonreactapp.modal.Data;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataRepo extends JpaRepository<Data, Long> {
}
