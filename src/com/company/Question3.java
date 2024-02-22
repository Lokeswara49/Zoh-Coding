package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        Map<Integer,Character> m=new HashMap<>();
        int count=26;
        for(int i=97;i<=122;i++){
            m.put(count,(char)(i));
            count--;
        }
        findAllMsg(s,m,0,"");
    }
    static void findAllMsg(String s, Map<Integer,Character> m, int i, String ans){
        if(i==s.length()){
            System.out.println(ans);
        }
        else{
            String t="";
            t+=s.charAt(i);
            if(s.charAt(i)>'2'){
                findAllMsg(s,m,i+1,ans+m.get(Integer.parseInt(t)));
            }
            else if(s.charAt(i)=='2' && i<s.length()-1 && s.charAt(i+1)<='6'){
                findAllMsg(s,m,i+1,ans+m.get(Integer.parseInt(t)));
                String temp="";
                temp+=s.charAt(i);
                temp+=s.charAt(i+1);
                ans+=m.get(Integer.parseInt(temp));
                findAllMsg(s,m,i+2,ans);
            }
            else if(s.charAt(i)=='2'){
                findAllMsg(s,m,i+1,ans+m.get(Integer.parseInt(t)));
            }
            else{
                findAllMsg(s,m,i+1,ans+m.get(Integer.parseInt(t)));
                String temp="";
                temp+=s.charAt(i);
                temp+=s.charAt(i+1);
                ans+=m.get(Integer.parseInt(temp));
                findAllMsg(s,m,i+2,ans);
            }
        }

    }


}
