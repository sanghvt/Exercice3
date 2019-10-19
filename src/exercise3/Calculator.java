/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise3;

/**
 *
 * @author sang
 */
 public class Calculator {
    private int a,b;
    
    static int sum(int a,int b){
        return a+b;
    }
    
    static int sub(int a,int b){
        return a-b;
    }
    
    static int mul(int a,int b){
        return a*b;
    }
    
    static float div(int a, int b){
        return (float)a/b; 
    }
    
    static int UCLN(int a, int b){
        while(b != 0){
            int tg = b;
            b = a%b;
            a = tg;
        }
        return a;
    }
    
    static int BCNN(int a, int b){
        return (a*b)/UCLN(a,b);
    }
}
