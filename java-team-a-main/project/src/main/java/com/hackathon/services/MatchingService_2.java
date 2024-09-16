package com.hackathon.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackathon.models.Matching;
import com.hackathon.repositories.MatchingRepository;

@Service
public class MatchingService_2 {

    @Autowired
    private MatchingRepository matchingRepository;

    public Matching saveMatching(Matching matching) {
        return matchingRepository.save(matching);
    }

    
}
