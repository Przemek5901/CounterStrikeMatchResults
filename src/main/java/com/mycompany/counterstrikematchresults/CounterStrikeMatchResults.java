/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.counterstrikematchresults;

import com.mycompany.counterstrikematchresults.controller.CounterStrikreMatchResultsController;
import com.mycompany.counterstrikematchresults.model.InvalidRoundsNumberException;
import com.mycompany.counterstrikematchresults.model.MatchResult;
import com.mycompany.counterstrikematchresults.model.Player;
import com.mycompany.counterstrikematchresults.model.Team;
import com.mycompany.counterstrikematchresults.model.TeamManager;
import com.mycompany.counterstrikematchresults.view.ViewTeamResults;
import javax.swing.JOptionPane;
/**
 * The Lab1 class is the main class for a Counter Strike Match results program.
 * 
 * @author Przemyslaw Bednarz
 * @version 1.1
 */
public class CounterStrikeMatchResults {

    /**
     * The main method of the program, responsible for controlling the user interface and
     * finding team data, added default team name for fast and easy testing
     * To find other team type "NiP",letter size does not 
     * matter(search in lower and upper case letters has been implemented)
     * 
     * @param args Command-line arguments.Pass 0 to quit, or 1 for fiding team results
     */
    public static void main(String[] args)  {

        CounterStrikeMatchResults csResults = new CounterStrikeMatchResults();
        TeamManager teamManager = new TeamManager();

        teamManager = csResults.retriveTeamsFromDatabase();

        ViewTeamResults view = new ViewTeamResults();
        Team team = new Team();
        CounterStrikreMatchResultsController controller = new CounterStrikreMatchResultsController(teamManager,view, team);

              
        while(true)
        {
            String option = "";
            if(args.length>0)
            {
                if(Integer.parseInt(args[0]) == 1)
                {
                    option = "1";
                }
                else if(Integer.parseInt(args[0]) == 2)
                {
                    option = "2";
                }
            }
            else
            {
                option = JOptionPane.showInputDialog("Press 0 to Exit\nPress 1 to enter team name\nChoose an option: ");
            }

            switch(option)
            {
                case "0":
                    return;
                case "1":
                    String text = JOptionPane.showInputDialog(null, "Enter team name", "VirtusPro");
                    Team searchedTeam;
                    searchedTeam = controller.getTeamByName(text);
                    controller.setTeam(searchedTeam);                
                    JOptionPane.showMessageDialog(null, controller.updateView(controller.getTeamManager()));
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
        
    }

    private TeamManager retriveTeamsFromDatabase() {
        
    TeamManager teamManager = new TeamManager();
    
    Team VirtusPro = new Team("VirtusPro");
    Team NiP = new Team("NiP");

    Player playerVP1 = new Player("Neo");
    Player playerVP2 = new Player("Taz");
    Player playerVP3 = new Player("Pasha");
    Player playerVP4 = new Player("Snax");
    Player playerVP5 = new Player("Byali");
    Player playerNiP1 = new Player("Xizt");
    Player playerNiP2 = new Player("GeT_RiGhT");
    Player playerNiP3 = new Player("Friberg");
    Player playerNiP4 = new Player("F0rest");        
    Player playerNiP5 = new Player("Fifflaren");

    VirtusPro.addPlayer(playerVP1);
    VirtusPro.addPlayer(playerVP2);
    VirtusPro.addPlayer(playerVP3);
    VirtusPro.addPlayer(playerVP4);
    VirtusPro.addPlayer(playerVP5);


    NiP.addPlayer(playerNiP1);
    NiP.addPlayer(playerNiP2);
    NiP.addPlayer(playerNiP3);
    NiP.addPlayer(playerNiP4);
    NiP.addPlayer(playerNiP5);


    teamManager.addTeam(VirtusPro);
    teamManager.addTeam(NiP);
    
    /**
    * Adds match results for teams.
    * 
    * Checks whether the added match results fall within the range from 0 to 16.
    * 
    * @throws InvalidRoundsNumberException 
    * If the match results do not fall within the range from 0 to 16.
    */
    
    try {

        MatchResult matchResultVP1 = new MatchResult(16, 2, "VirtusPro", "Cloud9", MatchResult.Map.DE_CACHE);
        MatchResult matchResultVP2 = new MatchResult(16, 13, "VirtusPro", "Navi", MatchResult.Map.DE_DUST2);
        MatchResult matchResultVP3 = new MatchResult(16, 9, "VirtusPro", "Team Titan", MatchResult.Map.DE_MIRAGE);

        MatchResult matchResultNiP1 = new MatchResult(16, 2, "NiP", "Envyus", MatchResult.Map.DE_NUKE);
        MatchResult matchResultNiP2 = new MatchResult(16, 2, "NiP", "TSM", MatchResult.Map.DE_CACHE);
        MatchResult matchResultNiP3 = new MatchResult(16, 2, "NiP", "Ibuypower", MatchResult.Map.DE_VERTIGO);



        VirtusPro.addMatchResult(matchResultVP1);
        VirtusPro.addMatchResult(matchResultVP2);
        VirtusPro.addMatchResult(matchResultVP3);

        NiP.addMatchResult(matchResultNiP1);
        NiP.addMatchResult(matchResultNiP2);
        NiP.addMatchResult(matchResultNiP3);


    } catch (InvalidRoundsNumberException e) {
         System.err.println(e.getMessage());
    }
    return teamManager;
    
    }
}
