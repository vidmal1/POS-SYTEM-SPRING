package com.ijse.adminspring.service;

import com.ijse.adminspring.entity.Invoice;

import java.util.List;

public interface InvoiceService {
    Invoice createInvoice(Invoice invoice);
    Invoice getInvoiceById(Long id);
    List<Invoice> getAllInvoices();
    void deleteInvoice(Long id);
    List<Invoice> getInvoicesForToday();
}
