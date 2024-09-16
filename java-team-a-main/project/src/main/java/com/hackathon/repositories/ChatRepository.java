package com.hackathon.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hackathon.models.Chat;

@Repository
public interface ChatRepository extends JpaRepository<Chat, Integer> {
}
