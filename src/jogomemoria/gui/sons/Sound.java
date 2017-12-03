package jogomemoria.gui.sons;

import java.applet.Applet;
import java.applet.AudioClip;

public class Sound {

    public static final AudioClip INICIO = Applet.newAudioClip(Sound.class.getResource("simons.wav"));
    public static final AudioClip FIMJOGO = Applet.newAudioClip(Sound.class.getResource("simons.wav"));
    public static final AudioClip ACERTO = Applet.newAudioClip(Sound.class.getResource("ce.wav"));
    public static final AudioClip ERRO = Applet.newAudioClip(Sound.class.getResource("erou.wav"));

}
