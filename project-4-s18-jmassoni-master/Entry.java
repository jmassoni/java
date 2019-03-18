import java.util.ArrayList;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Entry {
    private String play;
    private String act;
    private String scene;
    private String character;
    private String line;
    
    Entry(String play, String act, String scene, String character, String line) {
        this.play = play;
        this.act = act;
        this.scene = scene;
        this.character = character;
        this.line = line;
    }
    
    public void setPlay(String play) {
        this.play = play;
    }
    
    public void setAct(String act) {
        this.act = act;
    }
    
    public void setScene(String scene) {
        this.scene = scene;
    }
    
    public void setCharacter(String character) {
        this.character = character;
    }
    
    public void setLine(String line) {
        this.line = line;
    }
    
    public String getPlay() {
        return play;
    }
    
    public String getAct() {
        return act;
    }
    
    public String getScene() {
        return scene;
    }
    
    public String getCharacter() { 
        return character;
    }
    
    public String getLine() {
        return line;
    }
    
    @Override
    public String toString() {
        return play + "\n" 
            + act + ", " + scene + "\n"
            + character + "\n"
            + line;
    }
} // end class
