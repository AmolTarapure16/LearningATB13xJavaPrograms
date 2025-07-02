package ex_00_Task.Lab_8_24June;

import java.util.Scanner;

public class Lab_015_TriangleValidity
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side a: ");
        int a = scanner.nextInt();
        System.out.print("Enter side b: ");
        int b = scanner.nextInt();
        System.out.print("Enter side c: ");
        int c = scanner.nextInt();

        // Triangle validity check
        if (a + b > c && b + c > a && a + c > b) {
            System.out.println("Triangle is valid.");
        } else {
            System.out.println("Triangle is not valid.");
        }
    }
}
