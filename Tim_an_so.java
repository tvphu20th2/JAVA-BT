/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tim_an_so;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Tim_an_so {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int MAX_NUMBER =100;
        final int MIN_NUMBER =1;
        int range=(MAX_NUMBER-MIN_NUMBER)+1;
        int secretNumber =(int)(Math.random()*range)+MIN_NUMBER;
        
        Scanner sc = new Scanner(System.in);
        
        int yourNumber =0;
        int score =0;
        while(secretNumber != yourNumber)
        {
            System.out.println("Your Number (1-100)");
            yourNumber =sc.nextInt();
            sc.nextLine();
            
            if(yourNumber >secretNumber)
            {
                 System.out.println("Số ban nhập > số bí mật");
            }
            else if(yourNumber <secretNumber)
            {
                System.out.println("Số ban nhập < số bí mật");
            }else
            {
                System.out.println("Successfull");
            }
        }
    }
    
}
