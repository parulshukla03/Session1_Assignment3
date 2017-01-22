/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acadgildassignment;

/**
 *
 * @author Parul
 */
public class SwapVariable {
    public static void main(String[] args)
        {
                
        int a = 20;
        int b = 10;
        System.out.println("Before swap:");
        System.out.println("a value: "+a);
        System.out.println("b value: "+b);
        a = a + b;
        b=a-b;
        a=a-b;
        System.out.println("After swap:");
        System.out.println("a value: "+a);
        System.out.println("b value: "+b);
           
}
