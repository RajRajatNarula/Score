package com.cricket.api.Score.Entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "cric_matches")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int matchId;

    private String matchHeading;
    private String matchNumVenue;
    private String battingTeam;
    private String battingTeamScore;
    private String bowlingTeam;
    private String bowlingTeamScore;
    private String matchLink;
    private String textComplete;
    private String liveText;

    @Enumerated
    private MatchStatus matchStatus;

    private Date date=new Date();


    public void setMatchStatus(){
        if(textComplete.isBlank()){
            this.matchStatus=MatchStatus.LIVE;
        }
        else{
            this.matchStatus=MatchStatus.COMPLETED;
        }
    }


}
