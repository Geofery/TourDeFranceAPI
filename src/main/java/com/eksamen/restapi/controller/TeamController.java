package com.eksamen.restapi.controller;

import com.eksamen.restapi.model.Rider;
import com.eksamen.restapi.model.Team;
import com.eksamen.restapi.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author roed
 */
@RestController
@CrossOrigin
@RequestMapping("/teams")
public class TeamController {

  @Autowired
  TeamService teamService;

  @GetMapping()
  public List<Team> getTeams(){
    return teamService.getTeams();
  }

  @GetMapping("/{teamId}")
  public Team findTeam(@PathVariable int teamId){
    return teamService.findTeam(teamId);
  }

  @PostMapping()
  public Team createTeam(@RequestBody Team team){
    return teamService.createTeam(team);
  }

  //Måske ResponseEntity???
  @PutMapping("/{teamId}")
  public Team updateTeam(@PathVariable int teamId, @RequestBody Team team){
    team.setTeamId(teamId);
    return teamService.updateTeam(team);
  }

  //Virker men smider status 500 - kan ikke sende Objekt retur som JSon.
  @DeleteMapping("/{teamId}")
  public Team deleteRider(@PathVariable int teamId){
    return teamService.deleteTeam(teamId);
  }

}
