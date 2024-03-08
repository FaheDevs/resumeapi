package com.faheDevs.resumeapi.apiManagement.profileManagement;

import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
@Hidden
public interface ProfileRepository extends MongoRepository<Profile, String> {
}
