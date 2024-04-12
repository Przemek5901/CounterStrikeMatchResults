/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.counterstrikematchresults.model;

/**
 * Class representing a Counter Strike match result.
 * @author Przemyslaw Bednarz
 * @version 1.1
 */
public class MatchResult {
    private int hostPoints;
    private int guestsPoints;
    private String hostName;
    private String guestName;
    private TeamManager teamManager;
    private Map map;
    
    
    public enum Map{
        DE_DUST2, DE_MIRAGE, DE_INFERNO, DE_CACHE, DE_OVERPASS, DE_NUKE, DE_TRAIN, DE_VERTIGO
    }

    public MatchResult() {
    }
    
    

    /**
     * Constructor for the MatchResult class with additional match details.
     *
     * @param hostPoints The number of rounds won by the host team.
     * @param guestsPoints The number of rounds won by the guest team.
     * @param hostName The name of the host team.
     * @param guestName The name of the guest team.
     * @param map The name of the map.
     * @throws InvalidRoundsNumberException If the round results are invalid (out of the 0-16 range).
     */
    public MatchResult(int hostPoints, int guestsPoints, String hostName, String guestName, Map map) throws InvalidRoundsNumberException {
        if (guestsPoints < 0 || guestsPoints > 16 || hostPoints < 0 || hostPoints > 16 || hostName == null || guestName == null || map == null) {
            throw new InvalidRoundsNumberException("Invalid data.");
        }
    
        this.hostPoints = hostPoints;
        this.guestsPoints = guestsPoints;
        this.hostName = hostName;
        this.guestName = guestName;
        this.map = map;
    }


    /**
     * Set the number of rounds won by the host team.
     *
     * @param hostPoints The number of rounds won by the host team.
     */
    public void setHostPoints(int hostPoints) {
        this.hostPoints = hostPoints;
    }

    /**
     * Set the number of rounds won by the guest team.
     *
     * @param guestsPoints The number of rounds won by the guest team.
     */
    public void setGuestsPoints(int guestsPoints) {
        this.guestsPoints = guestsPoints;
    }

    /**
     * Set the name of the host team.
     *
     * @param hostName The name of the host team.
     */
    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    /**
     * Set the name of the guest team.
     *
     * @param guestName The name of the guest team.
     */
    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    /**
     * Set the TeamManager responsible for the match result.
     *
     * @param teamManager The TeamManager responsible for the match result.
     */
    public void setTeamManager(TeamManager teamManager) {
        if (teamManager == null) {
            throw new NullPointerException("Map cannot be null");
        }
        this.teamManager = teamManager;
    }

    /**
     * Set the name of the map.
     *
     * @param map The name of the map.
     */
    public void setMap(Map map) {
        if (map == null) {
            throw new NullPointerException("Map cannot be null");
        }
        this.map = map;
    }

    /**
     * Get the TeamManager responsible for the match result.
     *
     * @return The TeamManager responsible for the match result.
     */
    public TeamManager getTeamManager() {
        return teamManager;
    }

    /**
     * Get the name of the map.
     *
     * @return The name of the map.
     */
    public Map getMap() {
        return map;
    }

    /**
     * Get the number of rounds won by the host team.
     *
     * @return The number of rounds won by the host team.
     */
    public int getHostPoints() {
        return hostPoints;
    }

    /**
     * Get the number of rounds won by the guest team.
     *
     * @return The number of rounds won by the guest team.
     */
    public int getGuestsPoints() {
        return guestsPoints;
    }

    /**
     * Get the name of the host team.
     *
     * @return The name of the host team.
     */
    public String getHostName() {
        return hostName;
    }

    /**
     * Get the name of the guest team.
     *
     * @return The name of the guest team.
     */
    public String getGuestName() {
        return guestName;
    }
}
