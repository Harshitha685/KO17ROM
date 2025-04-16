package com.xworkz.tasks.level;

public class LevelRunner {
    public static void main(String[] args) {
        Level level = new Level();
        level.getGameName();
        level.gameLevel();
        level.unlock();
        level.increaseStars();
        level.updateTime();

        Level level2 = new Easy();
        level2.getGameName();
        level2.gameLevel();
        level2.unlock();
        level2.increaseStars();
        level2.updateTime();

        Easy easy = new Easy();
        easy.changeTopic();
        easy.updateTime();
        easy.addQuestions();
        easy.updateHint();
        easy.increaseDuration();


        Level level1 = new Easy();

        Easy easy1 = (Easy) level1;
        System.out.println(easy1);
    }
}
