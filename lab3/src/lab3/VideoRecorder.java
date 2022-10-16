package lab3;

import java.io.FileNotFoundException;

/**
 * Creation of a variable for classes made, using its methods
 * @author Kudenchuk Vladyslav
 * @version 1.0
 */

public class VideoRecorder extends VideoPlayer implements Record, Test {
	

	VideoPlayer a = new VideoPlayer(new Sound(35.5),new Screen(20));

    /**
     * Making default instruments military
     * @param hk Hook
     * @param ix IceAxe
     */
    public VideoRecorder(Sound hk, Screen ix) {
        super(hk, ix);
        
    }

    /**
     * Default constructor of MilitaryAlpinistInventory
     * @throws FileNotFoundException 
     */
    public VideoRecorder() throws FileNotFoundException {
        super();
    }

    /**
     * Method hide
     */
    @Override
    public void record() {
        try {
            a.logActivity("recording");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("recording");
    }

    @Override
    public void test()
    {
        try {
            a.logActivity("test");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("test");
    }
}