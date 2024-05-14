package com.shaik.custiq.service;

import com.shaik.custiq.dto.EventDTO;

public interface EventService {
    EventDTO getEventById(Long id);

    EventDTO createEvent(EventDTO eventDTO);

    EventDTO updateEvent(Long id, EventDTO eventDTO);

    void deleteEvent(Long id);
}
