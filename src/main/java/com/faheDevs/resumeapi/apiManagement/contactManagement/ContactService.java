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
    private final ContactRepository contactRepository;

    public List<ContactDTO> getAllContacts() {
        List<Contact> contacts = contactRepository.findAll();
        return contacts.stream()
                .map(MapperMethods::mapToContactDTO)
                .collect(Collectors.toList());
    }

    public Contact getContactById(String id) {
        return contactRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Contact not found with id: " + id));
    }

    public Contact createContact(Contact contact) {
        return contactRepository.save(contact);
    }

    public void save (Contact contact){
        contactRepository.save(contact);
    }

}
