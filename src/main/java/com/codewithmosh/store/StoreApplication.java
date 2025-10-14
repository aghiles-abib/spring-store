package com.codewithmosh.store;

import com.codewithmosh.store.entities.Address;
import com.codewithmosh.store.entities.Tag;
import com.codewithmosh.store.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
        var user = User.builder().name("aghiles")
                .password("password")
                .email("email")
                .build();

        var address = Address.builder()
                .street("aghiles")
                .city("password")
                .state("state")
                .zip("zip")
                .build();

        user.addAddress(address);
        System.out.println(user);

        user.addTag("tag1");

        System.out.println(user);


    }

}
