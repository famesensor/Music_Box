package Music_b;

import java.util.Random;

public class ChooseColor {

    public static String randomColor()
    {
        Random rand = new Random();
        int n = rand.nextInt(3) + 1;
        if(n==1) return "src/green.jpg";
        else if(n==2) return "src/red.jpg";
        else return "src/yellow.jpg";
    }

}