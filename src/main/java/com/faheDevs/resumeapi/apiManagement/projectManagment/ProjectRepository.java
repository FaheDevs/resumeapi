package com.faheDevs.resumeapi.apiManagement.projectManagment;

import io.swagger.v3.oas.annotations.Hidden;

import java.util.List;

@Hidden
public interface ProjectRepository {

    List<Project> findAll();

}
