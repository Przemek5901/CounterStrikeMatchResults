package com.mycompany.counterstrikematchresults.view;

import com.mycompany.counterstrikematchresults.model.MatchResult;
import com.mycompany.counterstrikematchresults.model.Player;
import java.util.List;

/**
 * Class representing the view of a team's results in Counter Strike matches.
 * @author Przemyslaw Bednarz
 * @version 1.1
 */
public class ViewTeamResults {

    /**
     * Constructor for the ViewTeamResults class.
     */
    public ViewTeamResults() {
    }

    /**
     * Generates and returns the team's results in a textual format.
     *
     * @param teamName      The name of the team.
     * @param players       The list of players in the team.
     * @param matchResults  The list of match results.
     * @return              Textual representation of the team's results.
     */
    public String printTeamResults(String teamName, List<Player> players, List<MatchResult> matchResults) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Team name: ").append(teamName);
        stringBuilder.append("\nActive Squad: \n");
        for (Player player : players) {
            stringBuilder.append(player.getNickName()).append("  ");
        }
        stringBuilder.append("\n---------------------------------");
        int i = 1;
        for (MatchResult result : matchResults) {
            stringBuilder.append("\nGame ").append(i).append(", map ")
                    .append(result.getMap()).append(": \n");
            stringBuilder.append(result.getHostName()).append("  ")
                    .append(result.getHostPoints()).append(" - ")
                    .append(result.getGuestsPoints()).append("  ")
                    .append(result.getGuestName());
            stringBuilder.append("\n---------------------------------");
            i++;
        }
        String result = stringBuilder.toString();

        return result;
    }
}