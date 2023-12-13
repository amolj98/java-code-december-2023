package com.amol.patterns;

public class PatternPrinting {
    public static void main(String[] args) {
  //      pattern1(5);
 //       pattern2(3);
        pattern3(3);
    }

        public static void pattern1(int n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }


    public static void pattern2(int n) {
        for(int row = 0; row < n; row++)
        {
            // For loop 'col' in range 0 to row.
            for(int col = 0; col <= row; col++)
            {
                // Print '*'.
                System.out.print('*' + " ");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n) {
        for(int i = 0; i < n; i++)
        {
            // For loop 'col' in range 0 to row.
            for(int j = n; j > i ; j--)
            {
                // Print '*'.
                System.out.print('*' + " ");
            }
            System.out.println();
        }
    }
}
