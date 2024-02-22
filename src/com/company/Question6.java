package com.company;

import java.util.Scanner;
import java.util.Stack;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Integer> stack = new Stack<>();
        int n = s.length();
        stack.push(-1);
        int max=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                stack.push(i);
            }
            else{
                if(!stack.isEmpty()){
                    stack.pop();
                }
                if(!stack.isEmpty()){
                    max=Math.max(max,(i-stack.peek()));
                }
                else{
                    stack.push(i);
                }
            }
        }
        System.out.println(max);

    }
}
