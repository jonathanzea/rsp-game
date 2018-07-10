package com.transferwise.rsp;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameService {

    private static void fight(List<Player> players, Player player) {
        List<Player> opponents = players.stream().filter(p -> !p.equals(player)).collect(Collectors.toList());
        for (Player opponent : opponents) {
            battle(player, opponent);
        }

    }

    private static void battle(Player player, Player opponent) {
        if (player.getTool().equals(ToolType.PAPER)) {
            if (opponent.getTool().equals(ToolType.ROCK)) {
                player.addPoint();
            }
        } else if (player.getTool().equals(ToolType.SCISSORS)) {
            if (opponent.getTool().equals(ToolType.PAPER)) {
                player.addPoint();
            }
        } else {
            if (opponent.getTool().equals(ToolType.SCISSORS)) {
                player.addPoint();
            }
        }
    }

    public List<String> play(List<Player> players) {
        List<String> results = new ArrayList<>();

        for (Player player : players) {
            fight(players, player);
        }
        players.sort(Comparator.comparing(Player::getWins));
        players.forEach(p -> results.add(p.getName() + "= " + p.getWins() + ((p.getWins() > 1 || p.getWins() == 0) ? " points." : " point")));
        cleanPlayerList(players);
        results.add("GAME OVER! (Inster more players and play again! :D");
        return results;
    }

    private void cleanPlayerList(List<Player> players) {
        players.clear();
    }

    public String addPlayerInList(List<Player> players, String name, ToolType tool) {
        try {
            players.add(new Player(name, tool));

        } catch (Exception e) {
            e.printStackTrace();
            return "asdas";
        }
        return "Player " + name + " (" + tool + ") " + "registered.";
    }


}
