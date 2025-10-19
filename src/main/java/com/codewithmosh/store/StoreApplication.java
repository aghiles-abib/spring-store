package com.codewithmosh.store;

import com.codewithmosh.store.entities.Address;
import com.codewithmosh.store.entities.Profile;
import com.codewithmosh.store.entities.Tag;
import com.codewithmosh.store.entities.User;
import com.codewithmosh.store.repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(StoreApplication.class, args);

        var repository = context.getBean(UserRepository.class);

        repository.findAll().forEach(u -> System.out.println(u.getEmail()));


//        var user = User.builder().name("aghiles")
//                .password("password")
//                .email("email")
//                .build();
//        repository.save(user);
//        var address = Address.builder()
//                .street("aghiles")
//                .city("password")
//                .state("state")
//                .zip("zip")
//                .build();
//
//        user.addAddress(address);
//        System.out.println(user);
//
//        user.addTag("tag1");
//
//        var profile = Profile.builder()
//                        .bio("bio")
//                                .build();
//        user.setProfile(profile);
//
//        profile.setUser(user);
//
//        System.out.println(user);


    }

}
