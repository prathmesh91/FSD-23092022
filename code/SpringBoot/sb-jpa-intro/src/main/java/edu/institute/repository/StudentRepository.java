package edu.institute.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import edu.institute.bean.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
