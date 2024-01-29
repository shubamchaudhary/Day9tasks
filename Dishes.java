package com.blueyonder.Day9;

import java.util.Scanner;

public class Dishes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] dishes = new int[n][m];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				dishes[i][j] = sc.nextInt();
			}
		}
      int r=0;
      int c=0;
      int maxi=0;
      for(int i=1;i<n-1;i++) {
    	  for(int j=1;j<m-1;j++) {
    		  if(dishes[i][j]+dishes[i-1][j]+dishes[i+1][j]+dishes[i][j-1]+dishes[i][j+1]+dishes[i-1][j-1]+dishes[i-1][j+1]+dishes[i+1][j-1]+dishes[i+1][j+1]>maxi) {
    			  maxi=dishes[i][j]+dishes[i-1][j]+dishes[i+1][j]+dishes[i][j-1]+dishes[i][j+1]+dishes[i-1][j-1]+dishes[i-1][j+1]+dishes[i+1][j-1]+dishes[i+1][j+1];
    			  r=i;
    			  c=j;
    		  }
    	  }
      }
      System.out.println(r+" "+c+" value: "+maxi);
	}

}
