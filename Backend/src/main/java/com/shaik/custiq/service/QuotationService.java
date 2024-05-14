package com.shaik.custiq.service;

import com.shaik.custiq.dto.QuotationDTO;

public interface QuotationService {
    QuotationDTO getQuotationById(Long id);

    QuotationDTO createQuotation(QuotationDTO quotationDTO);

    QuotationDTO updateQuotation(Long id, QuotationDTO quotationDTO);

    void deleteQuotation(Long id);
}
