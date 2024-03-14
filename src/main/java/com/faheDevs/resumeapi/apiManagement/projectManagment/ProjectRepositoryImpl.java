package com.faheDevs.resumeapi.apiManagement.projectManagment;

import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class ProjectRepositoryImpl implements ProjectRepository{

    @Override
    public List<Project> findAll() {
        return ProjectDataProvider.provideProjects();
    }
}
