package Music_b;

import java.util.Random;

public class RandomColor {
    public static String randColor()
    {
        Random rand = new Random();
        int n = rand.nextInt(7) + 1;
        if(n==1) return "src/Picture/green.png";
        else if(n==2) return "src/Picture/blue.png";
        else if(n==3) return "src/Picture/yellow.png";
        else if(n==4) return "src/Picture/purple.png";
        else if(n==5) return "src/Picture/mint.png";
        else if(n==6) return "src/Picture/pink.png";
        else if(n==7) return "src/Picture/red.png";
        else return "src/Picture/orange.png";
    }

}