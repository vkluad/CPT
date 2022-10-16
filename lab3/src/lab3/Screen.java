package lab3;

public class Screen {
    /**
     * @param area of Screen
     */
    double area =0;
    
    /**
     *Constructor of Screen
     * @param area of Screen
     */
    public Screen(double area) {
        this.area = area;
    }
    public Screen() {

    }
    /**
     * Gets the area of an Screen
     */
    public void mainScreen() {
    	System.out.println("returned to lab3.Main screen");
    }
    
    public double getArea() {
        return area;
    }

    /**
     * Sets the area of an Screen
     * @param area of Screen
     */
    public void setArea(double area) {
        this.area = area;
    }
}
