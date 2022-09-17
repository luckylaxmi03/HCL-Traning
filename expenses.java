
/*
 * Write a program to calculate the total expenses. Quantity and price per item are input by the user and discount of 10% is offered if the expense is more than 5000.
 */


import java.util.Scanner;

public class expenses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantity = sc.nextInt();
        float pricePerItem = sc.nextFloat();
        double totalExpences = quantity * pricePerItem;

        if(totalExpences > 5000) {
        	totalExpences -= totalExpences * 0.1;
        }
        System.out.println(totalExpences);
    }
}