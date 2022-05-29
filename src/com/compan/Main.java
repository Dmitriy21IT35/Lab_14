package com.compan;
import java.io.*;
import java.util.Scanner;


public class  Main {

    public Main() throws IOException {
    }

    public static void main(String[] args) {

        int x;
        double y;

        Scanner E = new Scanner (System.in);
        new Scanner (System.in);
        System.out.println ("Завершить:exit, продолжить");
        while (true) {
            String S = E.nextLine ();
            if (S.equals ("продолжить"))

            {
                Scanner form = new Scanner (System.in);
                System.out.println ("Введите число:");
                x = form.nextInt ();
                y = (x + Math.sin (x));
                System.out.println ("Результат исходный:" + x);
                System.out.println (y);
                Scanner E1 = new Scanner (System.in);
                new Scanner (System.in);
                System.out.println ("Завершить 'exit', save, продолжить");
                while (true) {
                    String S1 = E.nextLine ();
                    if (S1.equals ("save")) {

                            try {
                                PrintWriter pw = new PrintWriter ("C:\\rico\\ru.txt");
                                pw.println ("Исходный результат:" + x);
                                pw.println (y);
                                pw.close ();
                                System.out.println ("Cохранено");
                                System.out.println ("Завершить 'exit', save, продолжить");
                            } catch (Exception exception) {

                                System.out.println ();
                            }
                    }
                    else if (S1.equals ("продолжить")){

                    {System.out.println ("Введите число:");
                        x = form.nextInt ();
                        y = (x + Math.sin (x));
                        System.out.println ("Результат исходный:" + x);
                        System.out.println (y);
                        System.out.println ("Завершить 'exit', save, продолжить");

                    }}
                    else break;
                }

            }

            else break;
        }
    }
}



