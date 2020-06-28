package com.dawidciechowski.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.dawidciechowski.model.Game;

public interface GameDao {
    
    int insertGame(UUID id, Game game);

    default int addGame(Game game)
    {
        UUID id = UUID.randomUUID();
        return insertGame(id, game);
    }

    List<Game> selectAllGames();

    Optional<Game> selectGameById(UUID id);

    int deleteGameById(UUID id);

    int updateGameById(UUID id, Game game);


}