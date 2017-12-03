/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogomemoria.gui.sons;

import java.applet.Applet;
import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

public class Abertura {
	public static void main(String[] args) throws Exception {

		System.out.println("1");
		//URL url = new URL("http://www.edu4java.com/sound/back.wav");
                URL url = Abertura.class.getResource("simons.wav");
		AudioClip clip = Applet.newAudioClip(url);
		//AudioClip clip2 = Applet.newAudioClip(url);
		clip.play();
		Thread.sleep(30000);
                clip.stop();
                System.out.print("acabou");
        }
}