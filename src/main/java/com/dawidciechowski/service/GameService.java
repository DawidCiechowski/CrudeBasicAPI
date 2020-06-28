package com.dawidciechowski.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.dawidciechowski.dao.GameDao;
import com.dawidciechowski.model.Game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class GameService 
{
    private final GameDao gameDao;

    @Autowired
    public GameService(@Qualifier("fakeDao") GameDao gameDao) {
        this.gameDao = gameDao;
    }


    public int addGame(Game game)
    {
        return gameDao.addGame(game);
    }

    public List<Game> getAllGames()
    {
        return gameDao.selectAllGames();
    }

    public Optional<Game> getGameById(UUID id)
    {
        return gameDao.selectGameById(id);
    }

    public int deleteGame(UUID id)
    {
        return gameDao.deleteGameById(id);
    }

    public int updatePerson(UUID id, Game game)
    {
        return gameDao.updateGameById(id, game);
    }
}