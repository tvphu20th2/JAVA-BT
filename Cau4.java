/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau4;

import java.util.Scanner;

/**
 *
 * @author tvphu
 */
public class Cau4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner sc = new Scanner (System.in);
        int n ;
        int tong = 0;
        System.out.print("Nhập N :");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        { 
           // System.out.println("Tong tu "+i+" den "+n+" = "+ tong);
            tong+=i;
            
        }
     
        System.out.println("Tong tu 1 den "+n+" = "+tong);
    }
    
}
