package com.faheDevs.resumeapi;

import com.faheDevs.resumeapi.apiManagement.contactManagement.Contact;
import com.faheDevs.resumeapi.apiManagement.contactManagement.ContactService;
import com.faheDevs.resumeapi.apiManagement.experienceManagement.Experience;
import com.faheDevs.resumeapi.apiManagement.experienceManagement.ExperienceService;
import com.faheDevs.resumeapi.apiManagement.profileManagement.Profile;
import com.faheDevs.resumeapi.apiManagement.profileManagement.ProfileService;
import com.faheDevs.resumeapi.apiManagement.projectManagment.Project;
import com.faheDevs.resumeapi.apiManagement.projectManagment.ProjectService;
import com.faheDevs.resumeapi.securityManagement.auth.AuthenticationService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.Arrays;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.faheDevs.resumeapi.apiManagement")
public class ResumeapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResumeapiApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(
			AuthenticationService service,
			ProfileService ProfileService,
			ContactService contactService,
			ProjectService projectService,
			ExperienceService experienceService
	) {
		return args -> {
			// Create and save experiences using builders
			Experience javaDevExperience = Experience.builder()
					.id("experience 1")
					.title("INGENIEUR LOGICIEL JAVA")
					.company("MONACO TELECOM")
					.range("ALTERNANCE Master 2")
					.responsibilities(Arrays.asList("Concevoir, déployer et entretenir une solution IT complète", "Collaboration sur l'amélioration des composants React", "Prioriser la compréhension des besoins des utilisateurs"))
					.build();

			Experience fullStackDevExperience = Experience.builder()
					.id("experience 2")
					.title("INGENIEUR FULL STACK JAVA/REACTJS")
					.company("RIVIERA INTEGRATION SOLUTIONS FACTORY")
					.range("Avril 2023 - Août 2023")
					.responsibilities(Arrays.asList("Conception d'une extension Google Chrome", "Mise en place d'un processus d'automatisation", "Gestion de la migration des API"))
					.build();

			Experience javaDeveloper = Experience.builder()
					.id("experience 3")
					.title("DÉVELOPPEUR JAVA")
					.company("UNIDEES ALGERDZ")
					.range("Mars 2022 - Août 2022")
					.responsibilities(Arrays.asList("Conception et développement de plateforme de E-learning", "Participation dans les phases d'analyse, conception et développement"))
					.build();

			experienceService.saveAllExperiences(Arrays.asList(javaDevExperience, fullStackDevExperience, javaDeveloper));

			// Create and save projects using builders
			Project microblogAMU = Project.builder()
					.id("project 1")
					.name("MICROBLOGAMU")
					.description("Application de microblogging inspirée de Twitter")
					.stack(Arrays.asList("JavaFx", "Java Networking", "regex", "MVC-Design Patterns"))
					.build();

			Project weatherApp = Project.builder()
					.id("project 2")
					.name("WeatherApp")
					.description("Application de prévision météorologique utilisant Open Weather Map API")
					.stack(Arrays.asList("JavaFx", "ApiConsuming", "MVC-Design Patterns"))
					.build();
//			projectService.createProject(microblogAMU);

			projectService.saveAllProjects(Arrays.asList(microblogAMU, weatherApp));

			// Create and save contact info using builders
			Contact contact = Contact.builder()
					.id("contact 1")
					.email("zidanifahd@gmail.com")
					.phone("0695204657")
					.gitHub("https://github.com/FaheDevs")
					.linkedIn("@Fahed imed zidani")
					.build();

			contactService.save(contact);


			// Create and save profile using builders
			Profile profile = Profile.builder()
					.id("profile 1")
					.name("Fahed ZIDANI")
					.aboutMe("Ingénieur en génie logiciel. Étudiant alternant Master 2 Ingénierie du développement logiciel.")
					.projects(Arrays.asList(microblogAMU, weatherApp))
					.experience(Arrays.asList(javaDevExperience, fullStackDevExperience, javaDeveloper))
					.contacts(contact)
					.build();

			ProfileService.save(profile);

//			var admin = RegisterRequest.builder()
//					.firstname("Admin")
//					.lastname("Admin")
//					.email("admin@mail.com")
//					.password("password")
//					.role(Role.ADMIN)
//					.build();
//			System.out.println("Admin token: " + service.register(admin).getAccessToken());
//
//			var manager = RegisterRequest.builder()
//					.firstname("Admin")
//					.lastname("Admin")
//					.email("manager@mail.com")
//					.password("password")
//					.role(Role.MANAGER)
//					.build();
//			System.out.println("Manager token: " + service.register(manager).getAccessToken());

		};
	}


}
