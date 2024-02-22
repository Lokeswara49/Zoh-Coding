package com.company;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int n=s.nextInt();
        int[][] a=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=s.nextInt();
            }
        }
        int[][] matrix=new int[(m*n)][(m*n)];
        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j += 1) {
                if (i - 1 >= 0) {
                    matrix[a[i][j]][a[i - 1][j]] = 1;
                }
                else{
                    matrix[a[i][j]][a[n-1][j]]=1;
                }
                if (i + 1 <= n-1) {
                    matrix[a[i][j]][a[i + 1][j]] = 1;
                }
                else{
                    matrix[a[i][j]][a[0][j]]=1;
                }
                if (j + 1 <= n-1) {
                    matrix[a[i][j]][a[i][j + 1]] = 1;
                }
                else{

                }
                if (j - 1 >= 0) {
                    matrix[a[i][j]][a[i][j - 1]] = 1;
                }
            }
        }
        //System.out.println(findShortestRoute());

    }
}
