package com.danielcharbel.taskmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository repository;

    @Autowired
    private CourseJpaRepository JpaRepository;

    @Autowired
    private CourseSpringDataJpaRepository SDJpaRepository;

    @Override
    public void run(String... args) throws Exception {
        //JDBC
        repository.insert(new Course(777, "Life", "Daniel Charbel"));
        repository.insert(new Course(666, "Death", "Daniel Charbel"));
        repository.deleteById(666);
        System.out.println(repository.findById(777));

        //JPA
        JpaRepository.insert(new Course(888, "Life 2", "Daniel Charbel"));
        JpaRepository.insert(new Course(666, "Death 2", "Daniel Charbel"));
        JpaRepository.deleteById(666);
        System.out.println(JpaRepository.findById(888));

        //Spring Data JPA
        SDJpaRepository.save(new Course(999, "Life 3", "Daniel Charbel"));
        SDJpaRepository.save(new Course(666, "Death 3", "Daniel Charbel"));
        SDJpaRepository.deleteById(666L);
        System.out.println(SDJpaRepository.findById(999L));
        System.out.println(SDJpaRepository.findByAuthor("John Doe"));
        System.out.println(SDJpaRepository.findByName("Life"));
    }

}
