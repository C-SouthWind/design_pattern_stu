package com.chj.appearance;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.appearance
 * @className: HomeFacad
 * @author: chj
 * @description:
 * @date: Created in  2023/7/25 19:51
 * @version: 1.0
 */
public class HomeFacade {
    private DVDPlayer dvdPlayer;
    private Popcorn popcorn;
    private Projector projector;

    public HomeFacade() {
        dvdPlayer = DVDPlayer.getInstance();
        popcorn = Popcorn.getInstance();
        projector = Projector.getInstance();
    }

    public void ready(){
        dvdPlayer.on();
        popcorn.on();
        projector.on();
    }

    public void play(){
        dvdPlayer.play();
        popcorn.play();
        projector.play();
    }

    public void end(){
        dvdPlayer.off();
        popcorn.off();
        projector.off();
    }
}
