package KI_35.Kudenchuk.Lab3_4;

public class Sound {
    /**
     * @param loudness of Sound
     */
	double loudness;

    /**
     *Constructor of Sound
     * @param loudness
     */
    public Sound(double loudness) {
        this.loudness = loudness;
    }

    public Sound() {
    }
    
    public void checkSound() {
    	System.out.println("all is working fine");
    }

    /**
     *
     * @return loudness of Sound
     */
    public double getLoudness() {
        return loudness;
    }

    /**
     * Sets the loudness of Sound
     * @param loudness
     */
    public void setLoudness(double loudness) {
        this.loudness = loudness;
    }
}
