package lab3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class VideoPlayer{
    /**
     * Creation of a file to write information
     */
    private static final File dataFile = new File("log.txt");
    PrintWriter pw;
    {
        try {
            pw = new PrintWriter(dataFile);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Creation of new objects
     */
    Sound kt = new Sound();
    Screen br = new Screen();
    public static int k;

    /**
     * "Putting" Screen and Sound into a box
     * @param kt
     * @param br
     */
    public VideoPlayer(Sound kt, Screen br) {
        this.kt = kt;
        this.br = br;

        if(kt.loudness >= 20)
        {
            k++;
        }
        
    }
    public static int Getk()
    {
       return k;
    }
    /**
     * Gets Sound variables
     * @return kt
     */
    public Sound getKt() {
        return kt;
    }

    /**
     * Sets Sound variables
     * @param kt
     */
    public void setKt(Sound kt) {
        this.kt = kt;
    }
    /**
     * Gets Sound variables
     * @return br
     */
    public Screen getIx() {
        return br;
    }
    /**
     * Sets Screen variables
     * @param d
     */
    public void setIx(double d) {
        this.br.area = d;
    }
    /**
     * Gets Sound variables
     * @throws "FileNotFoundException"
     */
    public VideoPlayer() throws FileNotFoundException {
    }
    
    public void play() {
    	System.out.println("VideoPlayer sounds...");
    }
    
    public void nextSong() {
    	System.out.println("start playing next song");
    }
    
    
    /**
     * Methods that print information into file
     * @param message
     * @throws FileNotFoundException
     */
    protected void logActivity(String message) throws FileNotFoundException {
        pw.println(message);
        pw.flush();
    }

    /**
     * Method for display of showing and printing info in file
     *
     * @throws FileNotFoundException
     */
    public void show() throws FileNotFoundException {
        System.out.println("showing screen");
        try {
            logActivity("method show() was called");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    /**
     * Method for notification of reviewing and printing info in file
     * @throws FileNotFoundException
     */
    public void review(){
        System.out.println("reviewing case");
        try {
            logActivity("method review() was called");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}