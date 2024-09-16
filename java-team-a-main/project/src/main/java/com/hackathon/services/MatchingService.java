package com.hackathon.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackathon.models.Matching;
import com.hackathon.repositories.MatchingRepository;

@Service
public class MatchingService {

    @Autowired
    private MatchingRepository matchingRepository;

    public String matching(Long matchingId) {
        try {
            Matching matching = matchingRepository.getReferenceById(matchingId);
            List<Matching> allMatching = matchingRepository.findAll();

            long feelingId = matching.getMatchFeelingId();

            for (Matching m : allMatching) {
                if (matchingId == m.getMatchId()) {
                    continue;
                }

                if (feelingId == m.getMatchFeelingId()) {
                    String url = matched(matching, m);
                    return url;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return null;
    }

    private String matched(Matching yourself, Matching opp) {
        String url;
        url = opp.getMatchUrl();
        try{
            matchingRepository.deleteById(yourself.getMatchId());
            matchingRepository.deleteById(opp.getMatchId());
        }
        catch(Exception e) {
            e.printStackTrace();
            return null;
        }
        return url;
    }

    public void deleteMatch(long matchingId) {
        try{
            matchingRepository.deleteById(matchingId);
        }
        catch(Exception e) {
            e.printStackTrace();
            return;
        }
        return;
    }
}
