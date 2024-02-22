package com.company;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int count=n-1;
            for(int j=0;j<2*(n-1);j++){
                if(count>i){
                    System.out.print(" ");
                    count--;
                }
                else if(Math.abs(count)<=i){
                    System.out.print(Math.abs(count)+" ");
                    count--;
                }
            }


//            while(j>i){
//                System.out.print(" ");
//                j--;
//            }
//            while(j>0){
//                System.out.print(j+" ");
//                j--;
//            }
//            while(j<=i){
//                System.out.print(j+" ");
//                j++;
//            }
            System.out.println("");
        }
    }
}
