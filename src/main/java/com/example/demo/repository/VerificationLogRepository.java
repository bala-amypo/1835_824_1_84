package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.VerificationLog;
import java.util.List;

public interface VerificationLogRepository
        extends JpaRepository<VerificationLog, Long> {

    List<VerificationLog> findByEntryId(Long entryId);
}
