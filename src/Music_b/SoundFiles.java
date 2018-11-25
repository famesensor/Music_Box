package Music_b;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import java.io.File;
import java.nio.file.*;

public class SoundFiles
{
    public static File location_user[] = new File[50];
    public static void defaultFile(int temp, int num)
    {

        if(temp==0) {
            if (num == 1) {
                File Sound = new File("profiles/default1", "1.wav");
                Music_b.Sound.play(Sound);
            } else if (num == 2) {
                File Sound = new File("profiles/default1", "2.wav");
                Music_b.Sound.play(Sound);
            } else if (num == 3) {
                File Sound = new File("profiles/default1", "3.wav");
                Music_b.Sound.play(Sound);
            } else if (num == 4) {
                File Sound = new File("profiles/default1", "4.wav");
                Music_b.Sound.play(Sound);
            } else if (num == 5) {
                File Sound = new File("profiles/default1", "5.wav");
                Music_b.Sound.play(Sound);
            } else if (num == 6) {
                File Sound = new File("profiles/default1", "6.wav");
                Music_b.Sound.play(Sound);
            } else if (num == 7) {
                File Sound = new File("profiles/default1", "7.wav");
                Music_b.Sound.play(Sound);
            } else if (num == 8) {
                File Sound = new File("profiles/default1", "8.wav");
                Music_b.Sound.play(Sound);
            } else if (num == 9) {
                File Sound = new File("profiles/default1", "9.wav");
                Music_b.Sound.play(Sound);
            } else if (num == 10) {
                File Sound = new File("profiles/default1", "10.wav");
                Music_b.Sound.play(Sound);
            } else if (num == 11) {
                File Sound = new File("profiles/default1", "11.wav");
                Music_b.Sound.play(Sound);
            } else if (num == 12) {
                File Sound = new File("profiles/default1", "12.wav");
                Music_b.Sound.play(Sound);
            } else if (num == 13) {
                File Sound = new File("profiles/default1", "13.wav");
                Music_b.Sound.play(Sound);
            } else if (num == 14) {
                File Sound = new File("profiles/default1", "14.wav");
                Music_b.Sound.play(Sound);
            } else if (num == 15) {
                File Sound = new File("profiles/default1", "15.wav");
                Music_b.Sound.play(Sound);
            } else if (num == 16) {
                File Sound = new File("profiles/default1", "16.wav");
                Music_b.Sound.play(Sound);
            }
        }

        else if(temp==1) {
            if (num == 1) {
                File Sound = new File("profiles/default2", "1.wav");
                Music_b.Sound.play(Sound);
            } else if (num == 2) {
                File Sound = new File("profiles/default2", "2.wav");
                Music_b.Sound.play(Sound);
            } else if (num == 3) {
                File Sound = new File("profiles/default2", "3.wav");
                Music_b.Sound.play(Sound);
            } else if (num == 4) {
                File Sound = new File("profiles/default2", "4.wav");
                Music_b.Sound.play(Sound);
            } else if (num == 5) {
                File Sound = new File("profiles/default2", "5.wav");
                Music_b.Sound.play(Sound);
            } else if (num == 6) {
                File Sound = new File("profiles/default2", "6.wav");
                Music_b.Sound.play(Sound);
            } else if (num == 7) {
                File Sound = new File("profiles/default2", "7.wav");
                Music_b.Sound.play(Sound);
            } else if (num == 8) {
                File Sound = new File("profiles/default2", "8.wav");
                Music_b.Sound.play(Sound);
            } else if (num == 9) {
                File Sound = new File("profiles/default2", "9.wav");
                Music_b.Sound.play(Sound);
            } else if (num == 10) {
                File Sound = new File("profiles/default2", "10.wav");
                Music_b.Sound.play(Sound);
            } else if (num == 11) {
                File Sound = new File("profiles/default2", "11.wav");
                Music_b.Sound.play(Sound);
            } else if (num == 12) {
                File Sound = new File("profiles/default2", "12.wav");
                Music_b.Sound.play(Sound);
            } else if (num == 13) {
                File Sound = new File("profiles/default2", "13.wav");
                Music_b.Sound.play(Sound);
            } else if (num == 14) {
                File Sound = new File("profiles/default2", "14.wav");
                Music_b.Sound.play(Sound);
            } else if (num == 15) {
                File Sound = new File("profiles/default2", "15.wav");
                Music_b.Sound.play(Sound);
            } else if (num == 16) {
                File Sound = new File("profiles/default2", "16.wav");
                Music_b.Sound.play(Sound);
            }
        }

        else if(temp==2) {
            if (num == 1) {
                File Sound = new File(String.valueOf(location_user[num]));
                Music_b.Sound.play(Sound);
            } else if (num == 2) {
                File Sound = new File(String.valueOf(location_user[num]));
                Music_b.Sound.play(Sound);
            } else if (num == 3) {
                File Sound = new File(String.valueOf(location_user[num]));
                Music_b.Sound.play(Sound);
            } else if (num == 4) {
                File Sound = new File(String.valueOf(location_user[num]));
                Music_b.Sound.play(Sound);
            } else if (num == 5) {
                File Sound = new File(String.valueOf(location_user[num]));
                Music_b.Sound.play(Sound);
            } else if (num == 6) {
                File Sound = new File(String.valueOf(location_user[num]));
                Music_b.Sound.play(Sound);
            } else if (num == 7) {
                File Sound = new File(String.valueOf(location_user[num]));
                Music_b.Sound.play(Sound);
            } else if (num == 8) {
                File Sound = new File(String.valueOf(location_user[num]));
                Music_b.Sound.play(Sound);
            } else if (num == 9) {
                File Sound = new File(String.valueOf(location_user[num]));
                Music_b.Sound.play(Sound);
            } else if (num == 10) {
                File Sound = new File(String.valueOf(location_user[num]));
                Music_b.Sound.play(Sound);
            } else if (num == 11) {
                File Sound = new File(String.valueOf(location_user[num]));
                Music_b.Sound.play(Sound);
            } else if (num == 12) {
                File Sound = new File(String.valueOf(location_user[num]));
                Music_b.Sound.play(Sound);
            } else if (num == 13) {
                File Sound = new File(String.valueOf(location_user[num]));
                Music_b.Sound.play(Sound);
            } else if (num == 14) {
                File Sound = new File(String.valueOf(location_user[num]));
                Music_b.Sound.play(Sound);
            } else if (num == 15) {
                File Sound = new File(String.valueOf(location_user[num]));
                Music_b.Sound.play(Sound);
            } else if (num == 16) {
                File Sound = new File(String.valueOf(location_user[num]));
                Music_b.Sound.play(Sound);
            }
        }

        else if(temp==3) {
            if (num == 1) {
                SoundFiles.selectFile(num);
            } else if (num == 2) {
                SoundFiles.selectFile(num);
            } else if (num == 3) {
                SoundFiles.selectFile(num);
            } else if (num == 4) {
                SoundFiles.selectFile(num);
            } else if (num == 5) {
                SoundFiles.selectFile(num);
            } else if (num == 6) {
                SoundFiles.selectFile(num);
            } else if (num == 7) {
                SoundFiles.selectFile(num);
            } else if (num == 8) {
                SoundFiles.selectFile(num);
            } else if (num == 9) {
                SoundFiles.selectFile(num);
            } else if (num == 10) {
                SoundFiles.selectFile(num);
            } else if (num == 11) {
                SoundFiles.selectFile(num);
            } else if (num == 12) {
                SoundFiles.selectFile(num);
            } else if (num == 13) {
                SoundFiles.selectFile(num);
            } else if (num == 14) {
                SoundFiles.selectFile(num);
            } else if (num == 15) {
                SoundFiles.selectFile(num);
            } else if (num == 16) {
                SoundFiles.selectFile(num);
            }
        }

    }

    public static void selectFile(int num)
    {
        JFileChooser file = new JFileChooser();
        file.setDialogTitle("Select a sound");
        file.setFileFilter(new FileNameExtensionFilter("wav Images", "wav"));
        if (file.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
             location_user[num] = file.getSelectedFile();
        }

    }
}
