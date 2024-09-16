package com.hackathon.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hackathon.models.Matching;

@Repository
public interface MatchingRepository extends JpaRepository<Matching, Long> {
}