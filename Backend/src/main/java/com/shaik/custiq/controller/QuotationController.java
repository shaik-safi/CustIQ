package com.shaik.custiq.controller;

import com.shaik.custiq.dto.QuotationDTO;
import com.shaik.custiq.service.QuotationService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/quotations")
public class QuotationController {

    private final QuotationService quotationService;

    public QuotationController(QuotationService quotationService) {
        this.quotationService = quotationService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<QuotationDTO> getQuotationById(@PathVariable Long id) {
        QuotationDTO quotationDTO = quotationService.getQuotationById(id);
        return ResponseEntity.ok(quotationDTO);
    }

    @PostMapping
    public ResponseEntity<QuotationDTO> createQuotation(@Valid @RequestBody QuotationDTO quotationDTO) {
        QuotationDTO createdQuotation = quotationService.createQuotation(quotationDTO);
        return new ResponseEntity<>(createdQuotation, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<QuotationDTO> updateQuotation(@PathVariable Long id, @Valid @RequestBody QuotationDTO quotationDTO) {
        QuotationDTO updatedQuotation = quotationService.updateQuotation(id, quotationDTO);
        return ResponseEntity.ok(updatedQuotation);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteQuotation(@PathVariable Long id) {
        quotationService.deleteQuotation(id);
        return ResponseEntity.noContent().build();
    }
}