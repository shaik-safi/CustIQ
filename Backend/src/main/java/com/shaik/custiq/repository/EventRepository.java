package com.shaik.custiq.repository;

import com.shaik.custiq.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}