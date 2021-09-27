/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau5;
import java.util.Scanner;

/**
 *
 * @author Ta Van Phu - DTH195338
 */
public class ThiSinh {
    // Thuoc tinh
    String ten;
    float  diemToan;
     float diemLy;
     float diemHoa;
     float Tong;

      public ThiSinh()
{
}

      public ThiSinh( String ten, float diemToan, float diemLy, float diemHoa) {
        this.ten = ten;
        this.diemToan = diemToan;
	this.diemLy = diemLy;
	this.diemHoa = diemHoa;
    }

    // Ham nhap vao thong tin sinh vien
    public void Nhap() {
        
        Scanner sc = new Scanner (System.in);
        System.out.print("\tNhap ten: ");
        ten = sc.nextLine();
        System.out.print("\tNhap diemToan : ");
        diemToan = sc.nextFloat();
	System.out.print("\tNhap diemLy : ");
        diemLy = sc.nextFloat();
	System.out.print("\tNhap diemHoa : ");
        diemHoa = sc.nextFloat();
    }

    // Ham hien thi thong tin sinh vien
   public void Xuat() {
        System.out.println("\nTen: " + ten);
        System.out.println("\nDiem mon Toan: " + diemToan);
	System.out.println("\nDiem mon Ly: " + diemLy);
	System.out.println("\tDiem mon Hoa: " + diemHoa);
	System.out.println("\tDiem Tong: " + Tong);
	
    }

  
    

    // Ham lay thong tin ten sinh vien
   
}


    // Phuong thuc
    // Ham khoi tao khong doi so
  

    // Ham khoi tao co doi so
    

