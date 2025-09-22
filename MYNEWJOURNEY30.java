/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mynewjourney3.pkg0;

import java.util.Scanner;

/**
 *
 * @author RIVERA_CPE112
 */
public class MYNEWJOURNEY30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean a = true;
        while (a) {
            Scanner input = new Scanner(System.in);
            System.out.println("Hello pls Choose an Activity to performed\n 1. activity 1: MULTIPLYCATION TABLE GEGERATOR\n 2. Activity 2: SUM OF NATURAL NUMBERS\n 3. Activity 3: FACTORIAL CALCULATOR\n 4. Activity 4: EVEN AND ODD NUMDERS\n 5. Activity 5: REVERSE DIGITS OF A NUMDER");
            System.out.print("Type here: ");
            int A = input.nextInt();

            switch (A) {
                case 1:
                    System.out.println("Welcome to activity 1\n PLs Enter a number here from 1 to 10 ");
                    System.out.print("Enter Here: ");
                    int F = input.nextInt();
                    if (F < 0 || F <= 10) {
                        int G = 1;
                        int H = (F * G);
                        while (G <= 10) {
                            System.out.println(F + "*" + G + "=" + H);
                            G++;
                            H = (F * G);
                            a = false;
                        }
                        break;
                    } else {
                        System.out.println("Invalid Data \n Want to try Again?\n 1.for Yes\n 2.for No");
                        System.out.print("Enter Here: ");
                        int b = input.nextInt();
                        if (b == 1) {
                        };
                        if (b == 2) {
                            System.out.println("Program down");
                            a = false;
                        } else {
                            System.out.println("Invalid Input");
                            a = false;
                        }
                        break;
                    }

                case 2:
                    System.out.print("Welcome to Activity 2 \n pls Enter a number here: ");
                    int B = input.nextInt();
                    int C = 0;
                    int D = 1;
                    while (D <= B) {
                        C += D;
                        D++;
                    }
                    System.out.println("the sum is: " + C);
                    System.out.println("Want to continue?\n 1.for Yes\n 2.for No  ");
                    System.out.print("Enter Here: ");
                    int b = input.nextInt();
                    if (b == 1) {
                    }
                    ;
                    if (b == 2) {
                        System.out.println("Program down");
                        a = false;
                    }
                    break;

                case 3:
                    System.out.print("Welcome to Activity 3 \n pls Enter a number here: ");
                    int I = input.nextInt();
                    int J = I--;
                    do {
                        int Q = I * J;
                        J = Q;
                        I--;
                    } while (I >= 1);
                    System.out.println("Factorial: " + J);
                    System.out.println("Want to continue?\n 1.for Yes\n 2.for No  ");
                    System.out.print("Enter Here: ");
                    int c = input.nextInt();
                    if (c == 1) {
                    }
                    ;
                    if (c == 2) {
                        System.out.println("Program down");
                        a = false;
                    }
                    break;

                case 4:
                    System.out.print("Welcome to Activity 4 \n pls Enter a number here: ");
                    int K = input.nextInt();
                    if (K % 2 == 0) {
                        System.out.print("Even Numers: ");
                        int L = 2;
                        int S = 1;
                        while (L <= K) {
                            System.out.print(L + " ");
                            L += 2;
                        }
                        System.out.println(" ");
                        System.out.print("Odd Numbers: ");
                        while (S <= K) {
                            System.out.print(S + " ");
                            S += 2;
                        }
                    } else {
                        System.out.print("Odd Numbers: ");
                        int M = 1;
                        int T = 2;
                        while (M <= K) {
                            System.out.print(M + " ");
                            M += 2;
                        }
                        System.out.println(" ");
                        System.out.print("Even Numbers: ");
                        while (T <= K) {
                            System.out.print(T + " ");
                            T += 2;
                        }
                    }
                    System.out.println("\nWant to continue?\n 1.for Yes\n 2.for No  ");
                    System.out.print("Enter Here: ");
                    int d = input.nextInt();
                    if (d == 1) {
                    }
                    ;
                    if (d == 2) {
                        System.out.println("Program down");
                        a = false;
                    }
                    break;
                case 5:
                    System.out.println("Welcome to Activity 5 \n pls Enter the number to be reverse");
                    int N = input.nextInt();
                    int O = 0;
                    while (N > 0) {
                        int P = N % 10;
                        O = O * 10 + P;
                        N = N / 10;
                    }
                    System.out.println(O);
                    System.out.println("Want to continue?\n 1.for Yes\n 2.for No  ");
                    System.out.print("Enter Here: ");
                    int e = input.nextInt();
                    if (e == 1) {
                    }
                    ;
                    if (e == 2) {
                        System.out.println("Program down");
                        a = false;
                    }
            }
        }
    }
}
