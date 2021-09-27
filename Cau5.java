/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau5;

import java.util.Scanner;

/**
 *
 * @author tvphu
 */
public class Cau5 {

    /**
     * @param args the command line arguments
     */
     Scanner sc = new Scanner(System.in);
     void NhapMang(int a[], int n)
     {
         
         for (int i=0; i <n ; i++) 
         {
             
            System.out.println("Nhập vào phần tử thứ " + i + ": ");
            a[i] = sc.nextInt();   // nhập giá trị cho phần tử
        }
     }
     int XuatMang(int a[] , int n)
     {
         
         for (int i=0; i <n ; i++) 
         {
             
            System.out.println(a[i] + " : ");
            
        }
         return 0;
         
     }
     void SapXep(int a[],int n)
     {
         for(int i=0;i<n ;i++){
        for(int j=i+i;j<n ;j++){
            if (a[i]>a[j]){
                int tam ;
                tam=a[i];
                a[i]=a[j];
                a[j]=tam;
    
            }
        }
    }
     }
    public static void main(String[] args) {
        // TODO code application logic here
        int a[];
        int n; // kích thước của mảng
    Scanner sc = new Scanner(System.in);
     // Nhap so luong phan tu trong mang
    System.out.println("Nhập vào độ dài của mảng: ");
    n= sc.nextInt();
         
    // khai báo và cấp phát bộ nhớ cho mảng
    // mảng này có tên là array và kích thước = size
    a  = new int[n];
         
    // array.length: trả về kích thước của mảng
    for (int i = 0; i < n; i++) {
        System.out.println("Nhập vào phần tử thứ " + i + ": ");
        a[i] = sc.nextInt();   // nhập giá trị cho phần tử
    }
         Cau5 Cau5 = new Cau5();
    // hiển thị giá trị các phần tử trong mảng
    Cau5.NhapMang(a, n);
    for (int i = 0; i < n ; i++) {
        System.out.println("Phần tử thứ " + i + ": " + a[i]);
    }
    Cau5.XuatMang(a, n);
    System.out.println("Mảng vừa nhập");
    // sắp xếp 
    Cau5.SapXep(a, n);
    System.out.println("Mảng sau khi Sắp xếp : ");
    for(int i=0;i<n;i++)
    {
        System.out.print("\t" + a[i]);
    }
    
    // Tim max
    int max=a[0];
    for(int min:a)
    {
            
        
        if(max<min)
            max=min;
    
    }
        
  System.out.print("\n Số Lớn nhất trong mảng là :  \n"+ max);
        
}
}
