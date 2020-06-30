package Gui;

import java.io.FileInputStream;
import java.io.InputStream;
import sun.audio.*;
import javax.sound.sampled.AudioInputStream;

public class Ses {

	public static void Call(String path)
	 {
		try
		 {
		 InputStream in=new FileInputStream(path);
		 AudioStream as=new AudioStream(in);
		 AudioPlayer.player.start(as);
		 }
		 catch (Exception e)
		 {
		 System.out.println("Hata :"+e);
		 }
	 }
}
