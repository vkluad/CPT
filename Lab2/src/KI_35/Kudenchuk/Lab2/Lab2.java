package KI_35.Kudenchuk.Lab2;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
/*
 * Main class for Lab2
 * @author Vladyslav Kudenchuk
 * @version 1.0.0
 * */

public class Lab2{
    /*
     * @param h size of matrix
     * @param filler Element that will be printed
     * @return void
     * */
//     Function to demonstrate printing pattern
    public static void printFigure(int n, char a) throws Exception {
        char [][] array = new char[n][];
        File file = new File("MyFile.txt");
        PrintWriter fout = new PrintWriter(file);
        int k = n/5;//2;
        int g = n/3;//3
        int q = (n % 3 == 0 ? 0 : 1);

        for (int i = 0; i < n; i++) {
            // allocate memory for the ragged array
            // values changing acc. to requirement
            if((i > (n - k - 1)) || (i < k))
            {
                array[i] = new char [n];
            }
            else
            {
                if ((i < (n - g)) && (i >= g))
                {
                    array[i] = new char[(k * 2) + g + q];
                }
                else
                {
                    array[i] = new char[k * 2];
                }
            }
//            System.out.println("size: " + array[i].length);


            // inner loop to print elements of array and inner loop to handle number spaces
            // values changing acc. to requirement
            for(int j = 0; j < n; j++)
            {
                if ((i > (n - k - 1)) || (i < k))
                {
                    array[i][j] = a;
                    System.out.print(array[i][j]);
                    fout.print(array[i][j]);
                    continue;
                }

                if (j > (n - k - 1))
                {
                    if((i < (n - g)) && (i > (g - 1)))
                    {
                        int cur_index = j - n + g + k * 2 + q;
                        array[i][cur_index] = a;
                        System.out.print(array[i][cur_index]);
                        fout.print(array[i][cur_index]);
                    }
                    else
                    {
                        array[i][j - n + k * 2] = a;
                        System.out.print(array[i][j - n + k * 2]);
                        fout.print(array[i][j - n + k * 2]);
                    }
                    continue;
                }

                if (j < k)
                {
                    array[i][j] = a;
                    System.out.print(array[i][j]);
                    fout.print(array[i][j]);
                    continue;
                }

                if ((i < (n - g)) && (i > (g - 1))) {
                    if ((j > (g - 1)) && (j < (n - g))) {
                        array[i][k + (j - g)] = a;
                        System.out.print(array[i][k + (j - g)]);
                        fout.print(array[i][k + (j - g)]);
                        continue;
                    }
                }
                System.out.print(" ");
                fout.print(" ");
            }
            System.out.println();
            fout.println();
        }
        fout.flush();
        fout.close();
    }
    /*
     * @throws Exception
     * @return void
     * */
    // Driver Function


    public static void main (String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length-width of a square: ");
        int n = scanner.nextInt();
        scanner.nextLine();
//        System.out.print("Enter a filling symbol: ");
//        String la = scanner.nextLine();
//        char a = la.charAt(0);
        printFigure(n, '0');
    }
}