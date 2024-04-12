/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.counterstrikematchresults.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * JUnit 5 test class for the TeamManager class.
 * 
 * @author Przemyslaw Bednarz
 * @version 1.1
 *
 * Test class for the TeamManager class.
 */

public class TeamManagerTest {

    /**
     * Instance of TeamManager for testing.
     */
    TeamManager teamManager;

    /**
     * Default constructor for the TeamManagerTest class.
     */
    public TeamManagerTest() {
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
        teamManager = new TeamManager();
    }

    /**
     * Method executed after each test method.
     */
    @AfterEach
    public void tearDown() {
    }

    /**
     * Parameterized test for adding a team to the list (testing the size of the list).
     * 
     * @param teamName The name of the team to add.
     */
    @ParameterizedTest
    @ValueSource(strings = {"Test1", "2Test", "666"})
    public void testAddTeamSizeList(String teamName) {
        Team team = new Team(teamName);
        teamManager.addTeam(team);
        assertEquals(1, teamManager.getTeams().size());
    }

    /**
     * Parameterized test for adding a team to the list (testing the content of the list).
     * 
     * @param teamName The name of the team to add.
     */
    @ParameterizedTest
    @ValueSource(strings = {"Test1", "test test", "Test3"})
    public void testAddTeamListContent(String teamName) {
        Team team = new Team(teamName);
        teamManager.addTeam(team);
        assertEquals(teamName, teamManager.getTeams().get(0).getTeamName());
    }

    /**
     * Test for checking if the list is initially empty.
     */
    @Test
    public void testIsListEmpty() {
        assertEquals(0, teamManager.getTeams().size());
    }
}
