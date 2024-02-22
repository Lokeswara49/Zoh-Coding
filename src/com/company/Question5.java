package com.company;

import java.util.*;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Map<Character,Integer> map=new HashMap<>();
        int j=0;
        String temp="";
        String ans="";
        for(int i=0;i<s.length();i++){
            System.out.println(map+ " temp::"+temp+" ans"+ans);
            if(map.containsKey(s.charAt(i))){
                if(ans.length()<temp.length()){
                    ans=temp;
                }
                i=map.get(s.charAt(i));
                temp="";
                map.clear();
            }
            else{
                temp+=s.charAt(i);
                map.put(s.charAt(i),i);
            }


        }
        if(ans.length()<temp.length())
            ans=temp;
        System.out.println(ans);
    }
}
