package com.faheDevs.resumeapi.apiManagement.projectManagment;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends MongoRepository<Project, Integer> {
}
