import java.util.*;
abstract class Instrument{
    public abstract void play(); // abstract keyword is important
    public abstract void tune();
}
class Glockenspiel extends Instrument{
    public void play(){
        System.out.println("Glockenspiel is playing now!");
    }
    public void tune(){
        System.out.println("Glockenspiel has a unique tune!");
    }
}
class Violin extends Instrument{
    public void play(){
        System.out.println("Violin is playing now!");
    }
    public void tune(){
        System.out.println("Violin has a unique tune!");
    }
}

public class Main
{
	public static void main(String[] args) {
		Instrument i1 = new Glockenspiel();
		i1.play();
		i1.tune();
		Instrument i2 = new Violin();
		i2.play();
		i2.tune();
	}
}
/*
Glockenspiel is playing now!
Glockenspiel has a unique tune!
Violin is playing now!
Violin has a unique tune!
*/
