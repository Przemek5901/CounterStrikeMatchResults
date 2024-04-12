/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.counterstrikematchresults.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Class representing a Counter Strike team.
 * @author Przemyslaw Bednarz
 * @version 1.1
 */
public class Team {
    private String teamName;
    private List<MatchResult> matchResults = new ArrayList<>();
    private List<Player> players = new ArrayList<>();
    private TeamManager teamManager;

    /**
     * Default constructor for the Team class.
     */
    public Team() {
    }

    /**
     * Constructor for the Team class with a specified team name.
     *
     * @param teamName The name of the team.
     */
    public Team(String teamName) {
        this.teamName = teamName;
    }

    /**
     * Get the list of players in the team.
     *
     * @return The list of players.
     */
    public List<Player> getPlayers() {
        return players;
    }

    /**
     * Add a player to the team.
     *
     * @param player The player to be added.
     */
    public void addPlayer(Player player) {
        players.add(player);
    }

    /**
     * Get the list of match results associated with the team.
     *
     * @return The list of match results.
     */
    public List<MatchResult> getMatchResults() {
        return matchResults;
    }

    /**
     * Get the collection of teams.
     *
     * @return The collection of teams.
     */
    public TeamManager getTeamManager() {
        return teamManager;
    }

    /**
     * Set the list of match results for the team.
     *
     * @param matchResults The list of match results to be set.
     */
    public void setMatchResults(List<MatchResult> matchResults) {
        this.matchResults = matchResults;
    }

    /**
     * Set the collection of teams.
     *
     * @param teamManager The collection of teams.
     */
    public void setTeamManager(TeamManager teamManager) {
        this.teamManager = teamManager;
    }

    /**
     * Add a match result to the team's list of match results.
     *
     * @param result The match result to be added.
     */
    public void addMatchResult(MatchResult result) {
        matchResults.add(result);
    }

    /**
     * Get all match results associated with the team.
     *
     * @return The list of all match results.
     */
    public List<MatchResult> getAllMatchResults() {
        return matchResults;
    }

    /**
     * Get the name of the team.
     *
     * @return The name of the team.
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * Set the name of the team.
     *
     * @param teamName The name of the team to be set.
     */
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
}
