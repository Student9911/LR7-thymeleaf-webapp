package ru.aurakhov.lr7thymeleafwebapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.aurakhov.lr7thymeleafwebapp.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
