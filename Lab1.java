package edu.umw.lab1;
import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name > ");
        String name = input.nextLine();
        System.out.println("Hello, " + name);
    }
}
