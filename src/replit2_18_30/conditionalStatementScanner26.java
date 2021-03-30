package replit2_18_30;

import java.util.Scanner;

public class conditionalStatementScanner26 {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("in:");
        String name = inp.nextLine();

        if (name=="Chen"){
            System.out.println("teacher");
        }else {
            System.out.println("student");
        }

    }
}
