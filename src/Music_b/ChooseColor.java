package Music_b;

import java.util.Random;

public class ChooseColor {

    public static String randomColor()
    {
        Random rand = new Random();
        int n = rand.nextInt(7) + 1;
        if(n==1) return "src/green.png";
        else if(n==2) return "src/blue.png";
        else if(n==3) return "src/yellow.png";
        else if(n==4) return "src/purple.png";
        else if(n==5) return "src/mint.png";
        else if(n==6) return "src/pink.png";
        else return "src/orange.png";
    }

}