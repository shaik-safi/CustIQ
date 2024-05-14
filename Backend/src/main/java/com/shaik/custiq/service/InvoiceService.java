package com.shaik.custiq.service;

import com.shaik.custiq.dto.InvoiceDTO;

public interface InvoiceService {
    InvoiceDTO getInvoiceById(Long id);

    InvoiceDTO createInvoice(InvoiceDTO invoiceDTO);

    InvoiceDTO updateInvoice(Long id, InvoiceDTO invoiceDTO);

    void deleteInvoice(Long id);
}
