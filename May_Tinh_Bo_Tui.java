/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package may_tinh_bo_tui;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class May_Tinh_Bo_Tui {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numberFirst;
        int numberSecond;
        int result =0;
        String caculate;
        
        Scanner sc = new Scanner(System.in);
        
        // numberFirst
        System.out.println("Number First :");
        numberFirst = sc.nextInt();
        sc.nextLine();
        
        //numberSecond
        System.out.println("Number Second :");
        numberSecond = sc.nextInt();
       sc.nextLine();
        
        //caculate
        System.out.println("Caculate :");
        caculate = sc.nextLine();
        sc.close();
        
        switch(caculate)
        {
            case "+":
                result = numberFirst + numberSecond;
                break;
            case "-":
                result = numberFirst - numberSecond;
                break;
            case "x":
                result = numberFirst * numberSecond;
                break;
            case "/":
                result = numberFirst / numberSecond;
                break;
            default:
                break;
               
        }
        System.out.println("------------------------------------");
        System.out.printf("%d %s %d = %d \n",numberFirst ,caculate,numberSecond,result);
     
    }
    
}
