/*
FormCDCollection.java 
Created by: Lucas N-H
Created on: May 10, 2018
Last edited on: May 10, 2018
*/
package manual.variable.trace;
public class ManualVariableTrace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2 = 0;
        for (int i = 0; i <= 4; i++){
            num1 = i * i;
            num2 += num1;
            System.out.println(num1);
        } 
        System.out.println(num2);
        /*
        num1: 0, 1, 4, 9, 16
        num2: 0, 0, 1, 5, 14, 30
        i: 0, 1, 2, 3, 4
        */
    }
    
}
