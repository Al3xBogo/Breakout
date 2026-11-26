import javax.sound.sampled.*;
import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class Sound {
    private Clip clip;
    String filePath;

    public Sound(String filePath) {
        AudioInputStream audioIn;
        // Try-Catch with help from https://stackoverflow.com/questions/2091589/java-unreported-exception
        try {
            File soundFile = new File(filePath);
            audioIn = AudioSystem.getAudioInputStream(soundFile);

            clip = AudioSystem.getClip();

            clip.open(audioIn);
            this.filePath = filePath;

        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException e) {
            clip = null;
            System.err.println("Failed to fetch sound file at " + filePath);
            // throw new RuntimeException(e); // Removed thanks to Google Gemini Hydrogen letting me know that "throw" crashes the program.
        }
    }


    public void play() {
        if (clip != null) {
            clip.setFramePosition(0); // https://stackoverflow.com/questions/66443421/audiosystem-successfully-plays-clip-but-only-once-lineunavailableexception
            clip.start();
        }

    }
}
