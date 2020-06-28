package com.dawidciechowski.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
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

    @Override
    public Optional<Game> selectGameById(UUID id) {
        return DB.stream().filter(game -> game.getId().equals(id)).findFirst();
    }

    @Override
    public int deleteGameById(UUID id) {
        Optional<Game> game = selectGameById(id);

        if(game.isEmpty())
        {
            return 0;
        }

        DB.remove(game.get());
        return 1;
    }

    @Override
    public int updateGameById(UUID id, Game game) {
        return selectGameById(id).map(g -> {
            int indexOfGameToUpdate = DB.indexOf(g);
            if(indexOfGameToUpdate >= 0)
            {
                DB.set(indexOfGameToUpdate, new Game(id, game.getName(), game.getPrice(), game.getInStock(), game.getStock()));
                return 1;
            }
            return 0;
        }).orElse(0);
    }

}