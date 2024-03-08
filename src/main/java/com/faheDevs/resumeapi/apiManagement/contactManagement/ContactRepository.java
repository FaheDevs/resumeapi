package com.faheDevs.resumeapi.apiManagement.contactManagement;

import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
@Hidden
public interface ContactRepository extends MongoRepository<Contact, String> {
}
