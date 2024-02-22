package com.company;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1= sc.nextLine();
        String s2= sc.nextLine();
        int n=s1.length();
        String temp1="";
        String temp2="";
        for (int i = 0; i < n; i++) {
            if(s1.charAt(i)!=s2.charAt(i)){
                temp1+=s1.charAt(i);
                temp2+=s2.charAt(i);
            }
            if((temp1!="" && temp2!="") && ((s1.charAt(i)==s2.charAt(i)) || i==n-1)){
                System.out.println(temp1+","+temp2);
                temp1=temp2="";
            }
        }
//        if(temp1!="" && temp2!="") {
//            System.out.println(temp1 + "," + temp2);
//            temp1 = temp2 = "";
//        }

    }
}
