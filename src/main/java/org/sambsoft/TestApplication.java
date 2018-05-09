package org.sambsoft;

import org.sambsoft.entities.UserRole;
import org.sambsoft.entities.UserRoleId;
import org.sambsoft.entities.UserSettings;
import org.sambsoft.repositories.UserRoleRepository;
import org.sambsoft.repositories.UserSettingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.Serializable;
import java.util.Arrays;

@SpringBootApplication
public class TestApplication implements CommandLineRunner {


    @Autowired
    private UserRoleRepository userRoleRepository;

    @Autowired
    private UserSettingsRepository userSettingsRepository;

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }

    @Override
    public void run(String... args) {
        userRoleRepository.save(new UserRole("ADMIN", "Editor"));
        userRoleRepository.save(new UserRole("USER", "Editor"));
        userRoleRepository.save(new UserRole("GUEST", "GUEST"));
        userRoleRepository.save(new UserRole("ADMIN", "ADMIN"));

        Arrays.asList("ADMIN", "USER", "GUEST").forEach(e -> {
            userSettingsRepository.save((new UserSettings(e, e)));
        });

        //find all userroles
        System.out.println("===searching roles===");
        userRoleRepository.findAll().forEach(System.out::println);

        System.out.println("===searching settings===");
        userSettingsRepository.findAll().forEach(System.out::println);

        System.out.println("===Role count===");
        Long uniqueEditors = userRoleRepository.countRoles().longValue();
        System.out.println("uniqueEditors" +"=" +uniqueEditors);
        //   userRoleRepository.countRoles().forEach(System.out::println);
        //    System.out.println(userRoleRepository.countRoles().get(userRoleRepository.countRoles().size()-1));


    }
}
