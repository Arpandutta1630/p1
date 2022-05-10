package com.company;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the marks in AEC: ");
        double aec = sc.nextInt();
        System.out.println("Enter the marks in ACOM: ");
        double acom = sc.nextInt();
        System.out.println("Enter the marks in NM: ");
        double nm = sc.nextInt();
        System.out.println("Enter the marks in MP: ");
        double mp = sc.nextInt();
        System.out.println("Enter the marks in DAA: ");
        double daa = sc.nextInt();
        double agr = (aec + acom + nm + mp + daa)/5;
        double per = ((aec + acom + nm + mp + daa)/500) * 100;



        System.out.println("The aggregate is : " + agr + " and the percentage is : " + per);
    }
}


