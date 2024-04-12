/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.counterstrikematchresults.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Class representing a collection of teams in the Counter Strike match results system.
 * @author Przemyslaw Bednarz
 * @version 1.1
 */
public class TeamManager {
    private List<Team> teams = new ArrayList<>();

    /**
     * Constructor for the TeamManager class.
     */
    public TeamManager() {
    }

    /**
     * Set the list of teams in the collection.
     *
     * @param teams The list of teams to be set.
     */
    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    /**
     * Add a team to the collection of teams.
     *
     * @param team The team to be added.
     */
    public void addTeam(Team team) {
        this.teams.add(team);
    }

    /**
     * Get the list of teams in the collection.
     *
     * @return The list of teams.
     */
    public List<Team> getTeams() {
        return teams;
    }

    /**
     * Get a team by its name.
     *
     * @param name The name of the team to retrieve.
     * @return The team with the specified name, or null if not found.
     */
    public Team getTeamByName(String name) {
        String lowercaseName = name.toLowerCase();
        Optional<Team> matchingTeam = teams.stream()
            .filter(team -> team.getTeamName().toLowerCase().equals(lowercaseName))
            .findFirst();
        return matchingTeam.orElse(null);
    }
}
