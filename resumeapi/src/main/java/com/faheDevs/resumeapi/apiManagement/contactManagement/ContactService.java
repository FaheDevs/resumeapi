package com.faheDevs.resumeapi.apiManagement.contactManagement;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class ContactService {
    private final ContactRepository contactRepository;

    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    public Contact getContactById(String id) {
        return contactRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Contact not found with id: " + id));
    }

    public Contact createContact(Contact contact) {
        return contactRepository.save(contact);
    }
}
