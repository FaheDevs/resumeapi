package com.faheDevs.resumeapi.apiManagement.contactManagement;

import com.faheDevs.resumeapi.apiManagement.Mappers.MapperMethods;
import com.faheDevs.resumeapi.apiManagement.profileManagement.Profile;
import com.faheDevs.resumeapi.controllers.DTOs.ContactDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ContactService {
    private final ContactRepositoryImpl contactRepositoryImpl;

    public ContactDTO getAllContacts() {
        return MapperMethods.mapToContactDTO(contactRepositoryImpl.getContact());
    }

}
