
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tvphu
 */
public class cau1_btc1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner (System.in);
        int a,b,tong,tich;
        System.out.print("Nhập A : ");
        a=sc.nextInt();
        System.out.print("Nhập B : ");
        b=sc.nextInt();
        tong=a+b;
        System.out.println("Tong : "+tong);
        tich=a*b;
        System.out.println("Tich : "+tich);

    }
    
}
