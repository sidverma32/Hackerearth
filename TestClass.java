/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdemo;

/**
 *
 * @author SIDDHARTH
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
//import for Scanner and other utility  classes
import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
      int i,j;
        
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        
        int[] Monk= new int[N] ;
        for (i = 0; i < N; i++) {
             Monk[i]=s.nextInt();
             
        }
            for (i = 0; i < N; i++) {
                    for (j = 0; j<N; j++) {
                        if(Monk[i]>Monk[j])
                        {
                              int tmp = Monk[i];
           Monk[i]= Monk[j];
         Monk[j] = tmp;
                        }
                        
                    }
            }
        
         for (int k: Monk) {
            
   System.out.println(k);
   }
    }
}

       