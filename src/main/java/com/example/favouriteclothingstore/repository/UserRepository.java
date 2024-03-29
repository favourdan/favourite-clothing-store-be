package com.example.favouriteclothingstore.repository;

import com.example.favouriteclothingstore.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Person, Long> {


}
