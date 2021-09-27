/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau2;

import java.util.Scanner;

/**
 *
 * @author tvphu
 */
public class Cau2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =  new Scanner(System.in);
    int a,b,c;
    System.out.print("Nhập A:");
    a=sc.nextInt();
    System.out.print("Nhập B:");
    b=sc.nextInt();
    System.out.print("Nhập C:");
    c=sc.nextInt();
    if ((c<a+b)||(a < b+c) || (b < a+c))
    {
        System.out.println("3 số vừa nhập tạo thành tam giác");
        
              
        
    } else {
        System.out.println("3 số vừa nhập không tạo thành tam giác");
    }
    
    }
    
}
