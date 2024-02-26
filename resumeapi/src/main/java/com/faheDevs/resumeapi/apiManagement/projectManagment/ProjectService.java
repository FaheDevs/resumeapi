package com.faheDevs.resumeapi.apiManagement.projectManagment;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
@Service
@RequiredArgsConstructor
public class ProjectService {
    private final ProjectRepository projectRepository;

    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    public Project getProjectById(String id) {
        return projectRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Project not found with id: " + id));
    }

    public Project createProject(Project project) {
        return projectRepository.save(project);
    }
}
