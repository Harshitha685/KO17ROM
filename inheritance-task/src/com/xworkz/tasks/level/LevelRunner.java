package com.xworkz.tasks.level;

public class LevelRunner {
    public static void main(String[] args) {
        Level level = new Level();
        level.getGameName();
        level.gameLevel();

        Easy easy = new Easy();
        easy.getGameName();
        easy.gameLevel();
    }
}
