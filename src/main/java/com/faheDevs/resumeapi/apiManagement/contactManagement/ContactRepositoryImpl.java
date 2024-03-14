package com.faheDevs.resumeapi.apiManagement.contactManagement;


import org.springframework.stereotype.Component;

@Component
public class ContactRepositoryImpl implements ContactRepository {

    public Contact getContact() {
        return ContactDataProvider.provideContact();
    }
}
