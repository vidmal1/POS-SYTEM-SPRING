package com.ijse.adminspring.repository;

import com.ijse.adminspring.entity.Invoice;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
      List<Invoice> findByCreatedTimeBetween(LocalDateTime startOfDay, LocalDateTime endOfDay);
}
