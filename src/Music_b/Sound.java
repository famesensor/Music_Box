package Music_b;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class Sound extends Thread implements Runnable
{
    private static Clip clip;

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

    public static void drop()
    {
        if (clip != null) {
            clip.stop();
        }
    }

}
