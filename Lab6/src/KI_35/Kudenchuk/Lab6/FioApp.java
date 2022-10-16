package KI_35.Kudenchuk.Lab6;
import java.io.*;
import java.util.*;

public class FioApp {
    /**
     @param args Cline arguments
     */
    public static void main(String[] args) throws IOException
    {
        CalcWFio obj = new CalcWFio();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter X value: ");
        double x = s.nextDouble();
        obj.calculate(x);
        System.out.println("Result is: " + obj.getResult());
        obj.writeResTxt("textRes.txt");
        obj.writeResBin("BinRes.bin");
        obj.readResBin("BinRes.bin");
        System.out.println("Result in Bin file is: " + obj.getResult());
        obj.readResTxt("textRes.txt");
        System.out.println("Result in text file is: " + obj.getResult());
    }
}