package com.kartashov.apachepoi.spreadsheet.randomuser;

import com.github.javafaker.Faker;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RandomUserGenerator {
    public static void main(String[] args) {

        Faker faker = new Faker();
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 1_000_000; i++) {
            users.add(new User(faker.internet().safeEmailAddress(),
                    "12/15/2022 07:05 AM", "F", "opt-in Details", "0", "", "",
                    faker.name().firstName(), faker.name().lastName()));
        }

        System.out.println(Arrays.stream(UserHeaders.values()).sequential().map(UserHeaders::getValue).collect(Collectors.joining(",")));

        File csvOutputFile = new File("users.csv");
        try (PrintWriter pw = new PrintWriter(csvOutputFile)) {
            users.forEach(pw::println);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }


}
