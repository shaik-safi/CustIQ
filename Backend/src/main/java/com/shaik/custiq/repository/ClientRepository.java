package com.shaik.custiq.repository;

import com.shaik.custiq.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}