package Midterm;

import java.util.Scanner;

public class Test2 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String id = getID();
        String Name = getName();
        String Salary = getSalary();
        String OverTime = getOverTime();
        String calculateTax = calculateTax();
        String showDataInfo = showDataInfo();

    }//main
       private static String getID() {
        System.out.print("Enter employee id: ");
        return scanner.nextLine();
       }

    private static String getName() {
        System.out.print("Enter employee  Name: ");
        return scanner.nextLine();
    }

    private static String getSalary() {
        System.out.print("Enter employee Salary: ");
        return scanner.nextLine();
    }

    private static String getOverTime() {
        System.out.print("Enter employee OverTime: ");
        return scanner.nextLine();
    }

    private static String calculateTax() {
        System.out.print("Enter employee calculateTax: ");
        return scanner.nextLine();
    }

    private static String showDataInfo() {
        System.out.print("Enter employee showDataInfo: ");
        return scanner.nextLine();
    }



}//class
