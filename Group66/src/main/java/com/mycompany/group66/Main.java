/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.group66;
import java.util.Scanner;
/**
 *
 * @author zhouyifan
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Welcome! Who are you?");
        System.out.println("1. An administrator");
        System.out.println("2. A passenger");
        System.out.println("3. A driver");
        System.out.println("4. A manager");
        System.out.println("5. None of the above");
        
        int validinput=0;
        int enternum=0;
        while(validinput==0){
            System.out.println("Please enter [1-4]");
            enternum = sc.nextInt(); 
            if(enternum == 1){
                validinput=1;
            }
            else if(enternum == 2){
                validinput=1;
            }
            else if(enternum == 3){
                validinput=1;
            }
            else if(enternum == 4){
                validinput=1;
            }
            else{
                System.out.println("[ERROR] Invalid input.");
                validinput=0;
            }
        }
    }

}
