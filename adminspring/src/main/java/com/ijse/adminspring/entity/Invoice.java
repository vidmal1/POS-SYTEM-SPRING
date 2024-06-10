package com.ijse.adminspring.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName;
    private LocalDateTime createdTime = LocalDateTime.now();
    private String paymentMethod;
    private Double totalPriceBeforeDiscount;
    private Double totalPriceAfterDiscount;
    private Double discountPercentage;

    @ElementCollection
    private List<InvoiceItem> items;

    @Embeddable
    @Getter
    @Setter
    public static class InvoiceItem {
        private String productName;
        private Integer quantity;
        private Double price;
    }
}
