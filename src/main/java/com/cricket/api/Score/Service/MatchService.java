package com.cricket.api.Score.Service;

import com.cricket.api.Score.Entities.Match;

import java.util.List;
import java.util.Map;

public interface MatchService {

    // List of all matches
    List<Match> getAllMatches();

    // List of Live matches
    List<Match> getLiveMatches();

    List<List<String>> getPointsTable();

}
