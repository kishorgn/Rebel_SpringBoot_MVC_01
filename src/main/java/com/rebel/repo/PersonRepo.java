package com.rebel.repo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepo extends JpaRepository<com.rebel.model.Person, java.lang.Integer> {

}
