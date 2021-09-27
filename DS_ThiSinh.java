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
public class DS_ThiSinh {
   
        ThiSinh  dsts[];
        int n=2;
        
        public DS_ThiSinh()
        {
        }
        public void NhapDS()
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Số lượng thí sinh :");
            n=sc.nextInt();
            dsts= new ThiSinh[n];
          
            for(int i=0 ;i<n ;i++)
            {
            
                    dsts[i]= new ThiSinh();
                    dsts[i].Nhap();
            
            }  
            
            
        }
        public void XuatDS()
        {
            
        
            System.out.println("Danh sach thi Sinh vua nhap la:");
            for (int i=0;i<n;i++)
            {
                dsts[i].Xuat();
            }
           
        }
        public void TinhTong()
        {
            
            for (int i=0;i<n;i++)
            {
                float tong;
               
                tong =(float) (dsts[i].diemToan + dsts[i].diemLy+dsts[i].diemHoa);
                dsts[i].Xuat();
            }
        }
}
