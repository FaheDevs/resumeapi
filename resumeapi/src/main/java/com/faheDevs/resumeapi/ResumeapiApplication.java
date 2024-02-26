package com.faheDevs.resumeapi;

import com.faheDevs.resumeapi.apiManagement.contactManagement.Contact;
import com.faheDevs.resumeapi.apiManagement.profileManagement.Profile;
import com.faheDevs.resumeapi.apiManagement.profileManagement.ProfileRepository;
import com.faheDevs.resumeapi.apiManagement.profileManagement.ProfileService;
import com.faheDevs.resumeapi.securityManagement.auth.AuthenticationService;
import com.faheDevs.resumeapi.securityManagement.auth.RegisterRequest;
import com.faheDevs.resumeapi.securityManagement.user.Role;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.List;
import java.util.UUID;

@SpringBootApplication
@ComponentScan(basePackages = "com.faheDevs.resumeapi")
@EnableMongoRepositories(basePackages = "com.faheDevs.resumeapi.apiManagement")
public class ResumeapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResumeapiApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(
			AuthenticationService service,
			ProfileService ProfileService
	) {
		return args -> {
			var admin = RegisterRequest.builder()
					.firstname("Admin")
					.lastname("Admin")
					.email("admin@mail.com")
					.password("password")
					.role(Role.ADMIN)
					.build();
			System.out.println("Admin token: " + service.register(admin).getAccessToken());

			var manager = RegisterRequest.builder()
					.firstname("Admin")
					.lastname("Admin")
					.email("manager@mail.com")
					.password("password")
					.role(Role.MANAGER)
					.build();
			System.out.println("Manager token: " + service.register(manager).getAccessToken());

			var contact = Contact.builder()
					.id(UUID.randomUUID().toString())
					.phone("")
					.email("fahed@mail.com")
					.build();
			var profile = Profile.builder().name("fahed")
					.id(UUID.randomUUID().toString())
					.aboutMe("aboutme")
					.comments(List.of())
					.experience(List.of())
					.projects(List.of())
					.contacts(contact)
					.build();

			ProfileService.save(profile);
		};
	}


}
