/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */


package com.mycompany.counterstrikematchresults.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;


/**
 * JUnit 5 test class for the MatchResult class.
 * 
 * @author Przemyslaw Bednarz
 * @version 1.1
 *
 * Test class for the MatchResult class.
 */

public class MatchResultTest {

    /**
     * Default constructor for the MatchResultTest class.
     */
    public MatchResultTest() {
    }

    /**
     * Method executed once before all test methods in this class.
     */
    @BeforeAll
    public static void setUpClass() {
    }

    /**
     * Method executed once after all test methods in this class.
     */
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Method executed before each test method.
     */
    @BeforeEach
    public void setUp() {
    }

    /**
     * Method executed after each test method.
     */
    @AfterEach
    public void tearDown() {
    }

    /**
     * Parameterized test for host match rounds.
     * 
     * @param hostPoints The number of rounds won by the host team.
     * @throws InvalidRoundsNumberException If the round results are invalid (out of the 0-16 range).
     */
    @ParameterizedTest
    @ValueSource(ints = {-5, 17, 100, -100})
    public void testHostMatchRounds(int hostPoints) throws InvalidRoundsNumberException {
        InvalidRoundsNumberException exception = assertThrows(InvalidRoundsNumberException.class, () -> {
            new MatchResult(hostPoints, 0, "Cisiec", "Olskusz", MatchResult.Map.DE_CACHE);
        });
        assertEquals("Invalid data.", exception.getMessage());
    }

    /**
     * Parameterized test for guest match rounds.
     * 
     * @param guestPoints The number of rounds won by the guest team.
     * @throws InvalidRoundsNumberException If the round results are invalid (out of the 0-16 range).
     */
    @ParameterizedTest
    @ValueSource(ints = {-5, 17, 100, -100})
    public void testGuestMatchRounds(int guestPoints) throws InvalidRoundsNumberException {
        InvalidRoundsNumberException exception = assertThrows(InvalidRoundsNumberException.class, () -> {
            new MatchResult(5, guestPoints, "Cisiec", "Olskusz", MatchResult.Map.DE_CACHE);
        });
        assertEquals("Invalid data.", exception.getMessage());
    }

    /**
     * Parameterized test for null guest name.
     * 
     * @param guestName The guest team name (can be null).
     * @throws InvalidRoundsNumberException If the name is null.
     */
    @ParameterizedTest
    @NullSource
    void testNullGuestName(String guestName) throws InvalidRoundsNumberException {
        InvalidRoundsNumberException exception = assertThrows(InvalidRoundsNumberException.class, () -> {
            new MatchResult(0, 10, "Cisiec", guestName, MatchResult.Map.DE_CACHE);
        });
        assertEquals("Invalid data.", exception.getMessage());
    }

    /**
     * Parameterized test for null host name.
     * 
     * @param hostName The host team name (can be null).
     * @throws InvalidRoundsNumberException If the name is null.
     */
    @ParameterizedTest
    @NullSource
    void testNullHostName(String hostName) throws InvalidRoundsNumberException {
        InvalidRoundsNumberException exception = assertThrows(InvalidRoundsNumberException.class, () -> {
            new MatchResult(0, 10, hostName, "Cisiec", MatchResult.Map.DE_CACHE);
        });
        assertEquals("Invalid data.", exception.getMessage());
    }

    /**
     * Parameterized test for null map name.
     * 
     * @param map The map name (can be null).
     * @throws InvalidRoundsNumberException If the map name is null.
     */
    @ParameterizedTest
    @NullSource
    void testNullMapName(MatchResult.Map map) throws InvalidRoundsNumberException {
        InvalidRoundsNumberException exception = assertThrows(InvalidRoundsNumberException.class, () -> {
            new MatchResult(0, 10, "Cisiec", "Zywiec", map);
        });
        assertEquals("Invalid data.", exception.getMessage());
    }

    /**
     * Parameterized test for setting map with null.
     * 
     * @param map The map name (can be null).
     */
    @ParameterizedTest
    @NullSource
    public void testSetMapWithNull(MatchResult.Map map) {
        MatchResult matchResult = new MatchResult();
        assertThrows(NullPointerException.class, () -> {
            matchResult.setMap(map);
        }, "Error");
    }

    /**
     * Parameterized test for setting team manager with null.
     * 
     * @param teamManager The team manager (can be null).
     */
    @ParameterizedTest
    @NullSource
    public void testSetTeamManagerWithNull(TeamManager teamManager) {
        MatchResult matchResult = new MatchResult();
        assertThrows(NullPointerException.class, () -> {
            matchResult.setTeamManager(teamManager);
        }, "Error");
    }
}
