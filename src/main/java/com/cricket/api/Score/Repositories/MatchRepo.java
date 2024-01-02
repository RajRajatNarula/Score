package com.cricket.api.Score.Repositories;

import com.cricket.api.Score.Entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MatchRepo extends JpaRepository<Match,Integer> {

    Optional<Match> findByMatchHeading(String matchheading);

}
