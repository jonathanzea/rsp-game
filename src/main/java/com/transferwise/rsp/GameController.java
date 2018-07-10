package com.transferwise.rsp;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class GameController {
    private static final List<Player> PLAYERS = new ArrayList<>();

    @Autowired
    private GameService gameService;

    @RequestMapping(value = "register_player", method = RequestMethod.GET)
    private @ResponseBody
    String registerPlayer(@NotEmpty @RequestParam("name") String name
            , @NotEmpty @RequestParam("tool") ToolType tool) {
        return gameService.addPlayerInList(PLAYERS, name, tool);
    }

    @RequestMapping("/play")
    private List<String> play() {
        return gameService.play(PLAYERS);
    }
}
