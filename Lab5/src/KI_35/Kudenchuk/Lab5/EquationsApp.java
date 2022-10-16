package KI_35.Kudenchuk.Lab5;
import java.util.Scanner;
import java.io.*;
import static java.lang.System.out;
/**
 * Class <code>EquationsApp</code> Implements driver for Equations class
 * @author Kudenchuk Vladyslav
 * @version 1.0
 */
public class EquationsApp {
    public static void main(String[] args)
    {
        try
        {
            out.print("Enter file name: ");
            Scanner in = new Scanner(System.in);
            String fName = in.nextLine();
            PrintWriter fout = new PrintWriter(fName);
            try
            {
                try
                {
                    Equations eq = new Equations();
                    out.print("Enter X: ");
                    fout.print(eq.calculate(in.nextDouble()));
                }
                finally
                {
                    fout.flush();
                    fout.close();
                }
            }
            catch (CalcException ex)
            {
                out.print(ex.getMessage());
            }
        }
        catch (FileNotFoundException ex)
        {
            out.print("Exception reason: Perhaps wrong file path");
        }
    }
}