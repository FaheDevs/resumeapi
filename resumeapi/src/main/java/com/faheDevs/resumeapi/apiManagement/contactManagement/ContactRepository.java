package com.faheDevs.resumeapi.apiManagement.contactManagement;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends MongoRepository<Contact, Integer> {
}
