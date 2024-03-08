package com.faheDevs.resumeapi.apiManagement.projectManagment;

import com.faheDevs.resumeapi.apiManagement.Mappers.MapperMethods;
import com.faheDevs.resumeapi.controllers.DTOs.ProjectDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProjectService {
    private final ProjectRepository projectRepository;

    public List<ProjectDTO> getAllProjects() {
        List<Project> projects = projectRepository.findAll();
        return projects.stream()
                .map(MapperMethods::mapToProjectDTO)
                .collect(Collectors.toList());
    }

    public Project getProjectById(String id) {
        return projectRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Project not found with id: " + id));
    }

    public Project createProject(Project project) {
        return projectRepository.save(project);
    }

    public void saveAllProjects(List<Project> projects) {
        projectRepository.saveAll(projects);
    }

    public void deleteAllProjects() {
        projectRepository.deleteAll();
    }
}
