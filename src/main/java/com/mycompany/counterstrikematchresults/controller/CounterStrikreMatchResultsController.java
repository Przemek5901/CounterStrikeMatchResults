/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.counterstrikematchresults.controller;


import com.mycompany.counterstrikematchresults.model.MatchResult;
import com.mycompany.counterstrikematchresults.model.MatchResult.Map;
import com.mycompany.counterstrikematchresults.model.Player;
import com.mycompany.counterstrikematchresults.model.Team;
import com.mycompany.counterstrikematchresults.model.TeamManager;
import com.mycompany.counterstrikematchresults.view.ViewTeamResults;
import java.util.List;
import java.util.Optional;

/**
 * Controller class for managing Counter-Strike match results.
 * @author Przemyslaw Bednarz
 * @version 1.1
 */
public class CounterStrikreMatchResultsController {
    private Team team;
    private ViewTeamResults view;
    private MatchResult matchResult;
    private TeamManager teamManager;
    private Player player;

    /**
     * Default constructor for the CounterStrikreMatchResultsController class.
     */
    public CounterStrikreMatchResultsController() {
    }
    
    /**
     * Constructor for the CounterStrikreMatchResultsController class with specified components.
     *
     * @param teamManager The class responsible for storing teams.
     * @param view The view for displaying team results.
     * @param team The current team.
     */
    public CounterStrikreMatchResultsController(TeamManager teamManager, ViewTeamResults view, Team team) {
        this.team = team;
        this.view = view;
        this.teamManager = teamManager;
    }
    
    /**
     * Get the list of match results associated with the team.
     *
     * @return The list of match results.
     */
    public List<MatchResult> getMatchResults() {
        return team.getAllMatchResults();
    }

    /**
     * Set the current team.
     *
     * @param team The team to be set as the current team.
     */
    public void setTeam(Team team) {
        this.team = team;
    }

    /**
     * Set the list of match results for the team.
     *
     * @param matchResults The list of match results to be set.
     */
    public void setMatchResults(List<MatchResult> matchResults) {
        team.setMatchResults(matchResults);
    }

    /**
     * Set the class responsible for storing teams.
     *
     * @param teamManager The class to be set.
     */
    public void setTeamManager(TeamManager teamManager) {
        team.setTeamManager(teamManager);
    }
    
    /**
     * Add a match result to the current team's list of match results.
     *
     * @param result The match result to be added.
     */
    public void addMatchResult(MatchResult result) {
        

        team.addMatchResult(result);


    }

    /**
     * Get all match results associated with the current team.
     *
     * @return The list of all match results.
     */
    public List<MatchResult> getAllMatchResults() {
        return team.getAllMatchResults();
    }

    /**
     * Get the name of the current team.
     *
     * @return The name of the team.
     */
    public String getTeamName() {
        return team.getTeamName();
    }
    /**
     * Set the name of the current team.
     *
     * @param teamName The name to be set for the current team.
     */
    public void setTeamName(String teamName) {
        team.setTeamName(teamName);
    }

        /**
     * Get the current match result.
     *
     * @return The current match result.
     */
    public MatchResult getMatchResult() {
        return matchResult;
    }

    /**
     * Set the current match result.
     *
     * @param matchResult The match result to be set as the current match result.
     */
    public void setMatchResult(MatchResult matchResult) {
        
        this.matchResult = matchResult;
        
    }

    /**
     * Add a team to the list of teams.
     *
     * @param team The team to be added.
     */
    public void addTeam(Team team) {
        teamManager.addTeam(team);
    }

    /**
     * Get the list of collection of teams.
     *
     * @return The list of teams.
     */
    public List<Team> getTeams() {
        return teamManager.getTeams();
    }
    
    /**
     * Get a team by its name from the list of teams.
     *
     * @param name The name of the team to retrieve.
     * @return The Team object with the specified name, or null if not found.
     */
     public Team getTeamByName(String name) {
        String lowercaseName = name.toLowerCase();
        Optional<Team> matchingTeam = teamManager.getTeams().stream()
            .filter(team -> team.getTeamName().toLowerCase().equals(lowercaseName))
            .findFirst();
        return matchingTeam.orElse(null);
    }
    

    /**
     * Set the number of rounds won by the host team in the current match result.
     *
     * @param hostPoints The number of rounds won by the host team.
     */
    public void setHostPoints(int hostPoints) {
        matchResult.setHostPoints(hostPoints);
    }

    /**
     * Set the number of rounds won by the guest team in the current match result.
     *
     * @param guestsPoints The number of rounds won by the guest team.
     */
    public void setGuestsPoints(int guestsPoints) {
        matchResult.setGuestsPoints(guestsPoints);
    }

    /**
     * Get the collection of teams.
     *
     * @return The collection of teams.
     */
    public TeamManager getTeamManager() {
        return team.getTeamManager();
    }
    
    /**
     * Set the name of the host team in the current match result.
     *
     * @param hostName The name of the host team.
     */
    public void setHostName(String hostName) {
        matchResult.setHostName(hostName);
    }

    /**
     * Set the name of the guest team in the current match result.
     *
     * @param guestName The name of the guest team.
     */
    public void setGuestName(String guestName) {
        matchResult.setGuestName(guestName);
    }

    /**
     * Set the name of the map in the current match result.
     *
     * @param map The name of the map.
     */
    public void setMap(Map map) {
        matchResult.setMap(map);
    }

    /**
     * Get the name of the map in the current match result.
     *
     * @return The name of the map.
     */
    public Map getMap() {
        return matchResult.getMap();
    }

    /**
     * Get the number of rounds won by the host team in the current match result.
     *
     * @return The number of rounds won by the host team.
     */
    public int getHostPoints() {
        return matchResult.getHostPoints();
    }

    /**
     * Get the number of rounds won by the guest team in the current match result.
     *
     * @return The number of rounds won by the guest team.
     */
    public int getGuestsPoints() {
        return matchResult.getGuestsPoints();
    }

    /**
     * Get the name of the host team in the current match result.
     *
     * @return The name of the host team.
     */
    public String getHostName() {
        return matchResult.getHostName();
    }

    /**
     * Get the name of the guest team in the current match result.
     *
     * @return The name of the guest team.
     */
    public String getGuestName() {
        return matchResult.getGuestName();
    }

    /**
     * Get the nickname of the current player.
     *
     * @return The nickname of the player.
     */
    public String getPlayerNickName() {
        return player.getNickName();
    }

    /**
     * Set the nickname of the current player.
     *
     * @param nickName The nickname to be set for the player.
     */
    public void setPlayerNickName(String nickName) {
        player.setNickName(nickName);
    }

    /**
     * Update the view with team results.
     *
     * @param teamManager The collection responsible for storing teams.
     * @return A formatted string of team results.
     */
    public String updateView(TeamManager teamManager) {
        return view.printTeamResults(team.getTeamName(), team.getPlayers(), team.getAllMatchResults());
    }
}


