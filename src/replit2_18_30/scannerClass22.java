package replit2_18_30;


import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Scanner;

public class scannerClass22 {

    public static void main(String[] args) {
         Scanner myScanner=new Scanner(System.in);
        Scanner input=new Scanner(System.in);
        //Scanner phone=new Scanner(System.in);
      // Scanner age=new Scanner(System.in);
      //Scanner phone=new Scanner(System.in);


        System.out.println("Enter your name");

           //Scanner myScanner=new Scanner(System.in);
        String name=myScanner.next();

        System.out.println("Enter your mobile number");

       // String phone=input.myScanner.next();
        int phone=input.nextInt();

        System.out.println("Enter your age");

        int age=input.nextInt();

        System.out.println("Your name is "+name+","+"your age is "+age+"and your mobile number is"+phone);


         // fail : telefon numarasini 3-5 hane yazinca problem cikmiyor.fakat 9 haneli yazinca problem cikiyor

    }
}
