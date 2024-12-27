/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javakap8övning8.pkg9;
import java.util.Scanner;

/**
 *
 * @author dogge
 */
public class JavaKap8Övning89 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        boolean fortsätt = true;
        int behållning = 1000;
        
        do {
            System.out.println("MENY");
            System.out.println("1.\tInsättning");
            System.out.println("2.\tUttag");
            System.out.println("3.\tVisa behållning");
            System.out.println("4.\tAvsluta programmet");
            System.out.print("Vänligen gör ett val: ");
            int val = input.nextInt();
            
            switch (val){
                case 1: 
                    System.out.print("Ange summa: ");
                    int summa = input.nextInt();
                    behållning = behållning + summa;
                    System.out.print("Behållning: " + behållning +"\n");
                    break;
                case 2:
                    System.out.print("Ange summa: ");
                    int uttag = input.nextInt();
                    behållning = behållning - uttag;
                    System.out.print("Behållning: " + behållning +"\n");
                    break;
                case 3:
                    System.out.print("Behållningen är: " + behållning +"\n");
                    break;
                case 4:
                    fortsätt = false;
                    break;
                default:
                    System.out.print("Felinmatning");
            }
                    
            }
            
        
        while (fortsätt);
    }}
        


    
    

