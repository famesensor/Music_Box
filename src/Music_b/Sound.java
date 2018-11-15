package Music_b;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class Sound
{
    public static void play(File fileName)
    {
        new Thread(new Runnable()
        {
            public void run()
            {
                try
                {
                    Clip clip = AudioSystem.getClip();
                    AudioInputStream inputStream = AudioSystem.getAudioInputStream(fileName);
                    clip.open(inputStream);
                    clip.start();
                }
                catch (Exception e)
                {
                    System.out.println("error: " + e.getMessage() + " for " + fileName);
                }
            }
        }).start();
    }

    public static void stop()
    {

    }

}
