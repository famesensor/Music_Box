package Music_b;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class Sound extends Thread
{
    private static Clip clip;

    public Sound()
    {

    }

    public static void play(File fileName) {
        try
        {
            clip = AudioSystem.getClip();
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(fileName);
            clip.open(inputStream);
            clip.start();
        }
        catch (Exception e)
        {
            System.out.println("error: " + e.getMessage() + " for " + fileName);
        }
    }

    public static void Metronome(double bpm, int measure){
        int counter = 0;
        if(measure != 0)
            while(true){
                try {
                    Thread.sleep((long)(1000*(60/bpm)));
                }catch(InterruptedException e) {
                    e.printStackTrace();
                }
                counter++;
                if (counter%measure==0){
                    File S = new File("profiles/metrnme", "1.wav");
                    Sound.play(S);
                }
                else{
                    File S = new File("profiles/metrnme", "2.wav");
                    Sound.play(S);
                }
            }
    }

}
