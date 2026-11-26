import javax.sound.sampled.*;
import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class Sound {
    private Clip clip = null;
    String filePath;

    public Sound(String filePath) {
        AudioInputStream audioIn = null;
        // Try-Catch with help from https://stackoverflow.com/questions/2091589/java-unreported-exception
        try {
            File soundFile = new File(filePath);
            audioIn = AudioSystem.getAudioInputStream(soundFile);

            clip = AudioSystem.getClip();

            clip.open(audioIn);
            this.filePath = filePath;

        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException e) {
            throw new RuntimeException(e);
        }
    }


    public void play() {
        clip.setFramePosition(0); // https://stackoverflow.com/questions/66443421/audiosystem-successfully-plays-clip-but-only-once-lineunavailableexception
        clip.start();
    }
}
