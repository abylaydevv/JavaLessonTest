package homework;

import java.util.Scanner;

public class Main {


     public static void main(String[] args) {

  }
    static int getMax(int a, int b, int c) {
        if (a > b & a > c) {
            return a;
        }
        if (b > a & b > c) {
            return b;
        }
        if (c > a & c > b) {
            return c;
        }
        return a;
    }
}

