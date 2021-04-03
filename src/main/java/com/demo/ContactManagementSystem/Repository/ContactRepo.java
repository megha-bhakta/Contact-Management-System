package com.demo.ContactManagementSystem.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.ContactManagementSystem.Model.Person;

@Repository
public interface ContactRepo extends JpaRepository<Person, Long> {

}
