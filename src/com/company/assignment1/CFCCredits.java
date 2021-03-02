package com.company.assignment1;
import java.util.Scanner;

public class CFCCredits {

    public static void main(String[] args) {

        int creditsCampusLead ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Code For Cause Campus Leader credits");
        creditsCampusLead = sc.nextInt();

        if (creditsCampusLead >= 7500){
            System.out.println("Tera Leader");

        }else if (creditsCampusLead >= 6000 && creditsCampusLead < 7500){
            System.out.println("Gega Leader");

        }else if(creditsCampusLead >= 4500 && creditsCampusLead < 6000){
            System.out.println("Mega Leader");

        }else{
            System.out.println("Rising Star");
        }

        sc.close();
    }
}

