package com.hackathon.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hackathon.models.Todo;

@Repository
public interface TestRepository extends JpaRepository<Todo, Integer> {
}
