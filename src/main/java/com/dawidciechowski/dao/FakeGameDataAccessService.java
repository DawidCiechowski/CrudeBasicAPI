package com.dawidciechowski.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.dawidciechowski.model.Game;

import org.springframework.stereotype.Repository;


@Repository("fakeDao")
public class FakeGameDataAccessService implements GameDao {
    private static List<Game> DB = new ArrayList<>();

    @Override
    public int insertGame(UUID id, Game game) {
        DB.add(new Game(id, game.getName(), game.getPrice(), game.getInStock(), game.getStock()));
        return 0;
    }

    @Override
    public List<Game> selectAllGames() {
        // TODO Aut
        return DB;
    }

}