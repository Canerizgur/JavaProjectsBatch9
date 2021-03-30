package replit2_18_30;

import java.util.Scanner;

public class conditionalStatementScanner28 {

    public static void main(String[] args) {
Scanner inp = new Scanner(System.in);
        System.out.println("Please enter the length");
        int num1 = inp.nextInt();
        System.out.println("Please enter the width");
        int num2 =inp.nextInt();

        if (num1==num2){
            System.out.println("The shape of your object is square");
        }else{
            System.out.println("The shape of your object is rectangle");
        }

    //passed

    }
}
