package Respository;
//Importing required classes

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Entity.Department;

//Annotation
@Repository

//Interface
public interface DepartmentRepository
 extends JpaRepository<Department, Long> {
}