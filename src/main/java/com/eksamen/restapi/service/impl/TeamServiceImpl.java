package com.eksamen.restapi.service.impl;

import com.eksamen.restapi.model.Rider;
import com.eksamen.restapi.model.Team;
import com.eksamen.restapi.repository.TeamRepository;
import com.eksamen.restapi.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author roed
 */

@Service
public class TeamServiceImpl implements TeamService {
  @Autowired
  TeamRepository teamRepository;


  @Override
  public List<Team> getTeams() {
    return teamRepository.findAll();
  }

  @Override
  public Team createTeam(Team team) {
    return teamRepository.save(team);
  }

  @Override
  public Team findTeam(int teamId) {
    return teamRepository.findById(teamId).orElse(null);
  }

  @Override
  public Team deleteTeam(int teamId) {
    try {
      Optional<Team> teamDB = teamRepository.findById(teamId);
      if (teamDB.isPresent()){
        teamRepository.delete(teamDB.get());
        return teamDB.get();
      }
    }catch (Exception err){
      return null;
    }
    return null;
  }

  @Override
  public Team updateTeam(Team team) {
    Optional<Team> existingTeam = teamRepository.findById(team.getTeamId());
    if (existingTeam.isPresent()){
      team.setRiders(existingTeam.get().getRiders());
      return teamRepository.save(team);
    }
    return null;
  }
}
