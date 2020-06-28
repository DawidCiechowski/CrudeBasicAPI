package com.dawidciechowski.service;

import java.util.List;

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
}