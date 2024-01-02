package com.cricket.api.Score.Controllers;

import com.cricket.api.Score.Entities.Match;
import com.cricket.api.Score.Service.MatchService;
import com.cricket.api.Score.Service.impl.MatchServiceImpl;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/match")
@AllArgsConstructor
public class MatchController {
    private MatchService matchService;

//    public MatchController(MatchService matchService){
//        this.matchService=matchService;
//    }

    @GetMapping("/live")
    public ResponseEntity<List<Match>> getLiveMatches(){
        return new ResponseEntity<>(matchService.getLiveMatches(), HttpStatus.OK);
    }


    @GetMapping
    public ResponseEntity<List<Match>> getAllMacthes(){
        return new ResponseEntity<>(matchService.getAllMatches(),HttpStatus.OK);
    }


    @GetMapping("/point-table")
    public ResponseEntity<?> getPointTable(){
        return new ResponseEntity<>(matchService.getPointsTable(),HttpStatus.OK);
    }

}
