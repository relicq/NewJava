package com.acem.jc;
import com.acem.jc.FootBall;
import com.acem.jc.BasketBall;
import com.acem.jc.VolleyBall;
import com.acem.jc.Guitar;
import com.acem.jc.Flute;

public class Main {
    public static void main(String args[]){
        String input = args[0];
        Playable playable = null;
        switch(input){
            case"football":
                playable = new FootBall();
            break;
            case"basketball":
                playable = new BasketBall();
            break;
            case"guitar":
                playable = new Guitar();
            break;
            case "volleyball":
                playable = new VolleyBall();
            break;
            case "flute":
                playable = new Flute(); 
            break;       
        }
        play(playable);
    }
    public static void play( Playable playable){
        playable.play();
        
    }


}
