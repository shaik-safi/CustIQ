package com.shaik.custiq.service;

import com.shaik.custiq.dto.ClientDTO;

public interface ClientService {
    ClientDTO getClientById(Long id);

    ClientDTO createClient(ClientDTO clientDTO);

    ClientDTO updateClient(Long id, ClientDTO clientDTO);

    void deleteClient(Long id);
}
