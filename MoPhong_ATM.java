/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mophong_atm;

import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class MoPhong_ATM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DecimalFormat df= new DecimalFormat();
        
        // Your's Money
        int money = 0;
        
        final int TEN_THOUSAND                  = 10000;
        final int TWENTY_THOUSAND               = 20000;
        final int FIFTY_THOUSAND                = 50000;
        final int ONE_HUNDRED_THOUSAND          = 100000;
        final int TW0_HUNDRED_THOUSAND          = 200000;
        final int FIVE_HUNDRED_THOUSAND         = 500000;
        
        int tenThousand                         = 0;
        int twentyThousand                      = 0;
        int fiftyThousand                       = 0;
        int oneHundredThousand                  = 0;
        int twoHundredThousand                  = 0;
        int fiveHundredThousand                 = 0;
        
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Your Money");
            money = sc.nextInt();
            
        }while(money %10000 !=0);
        sc.close();
        
        
        System.out.println("---------------------------\n");

        //10k
        if(money >= TEN_THOUSAND  )
        {
            tenThousand = money / TEN_THOUSAND;
            money = money % TEN_THOUSAND;
            System.out.printf("Mệnh giá %d : Có %d tờ \n",TEN_THOUSAND ,tenThousand);
        }
        
        //20k
        if(money >= TWENTY_THOUSAND  )
        {
            twentyThousand = money / TWENTY_THOUSAND;
            money = money % TWENTY_THOUSAND;
            System.out.printf("Mệnh giá %d : Có %d tờ \n",TWENTY_THOUSAND ,twentyThousand);
        }
        
        //50k
        if(money >= FIFTY_THOUSAND   )
        {
            fiftyThousand  = money / FIFTY_THOUSAND ;
            money = money % FIFTY_THOUSAND ;
            System.out.printf("Mệnh giá %d : Có %d tờ \n",FIFTY_THOUSAND  ,fiftyThousand );
        }
        
        //100k
        if(money >= ONE_HUNDRED_THOUSAND    )
        {
           oneHundredThousand = money / ONE_HUNDRED_THOUSAND  ;
            money = money % ONE_HUNDRED_THOUSAND  ;
            System.out.printf("Mệnh giá %d : Có %d tờ \n",ONE_HUNDRED_THOUSAND,oneHundredThousand);
        }
        
        //200k
        if(money >= TW0_HUNDRED_THOUSAND )
        {
            twoHundredThousand = money / TW0_HUNDRED_THOUSAND;
            money = money % TW0_HUNDRED_THOUSAND;
            System.out.printf("Mệnh giá %d : Có %d tờ \n",TW0_HUNDRED_THOUSAND ,twoHundredThousand);
        }
        
        //500k
        if(money >= FIVE_HUNDRED_THOUSAND  )
        {
            fiveHundredThousand = money / FIVE_HUNDRED_THOUSAND;
            money = money % TEN_THOUSAND;
            System.out.printf("Mệnh giá %d : Có %d tờ \n",TEN_THOUSAND ,fiveHundredThousand);
        }
            
    }
    
}
