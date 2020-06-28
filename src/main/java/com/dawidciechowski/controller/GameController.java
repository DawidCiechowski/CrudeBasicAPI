package com.dawidciechowski.controller;

import java.util.List;

import com.dawidciechowski.model.Game;
import com.dawidciechowski.service.GameService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/game")
@RestController
public class GameController {

    private final GameService gameService;

    @Autowired
    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @PostMapping
    public void addGame(@RequestBody Game game) {
        gameService.addGame(game);
    }


    @GetMapping
    public List<Game> getAllPeople()
    {
        return gameService.getAllGames();
    }
    
}