/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstprojectjptv22;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class FirstProjectJPTV22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите имя:  ");
        String firstname = scanner.nextLine();
        System.out.print("Введите фамилию: ");
        String lastname = scanner.nextLine();
        System.out.print("Введите год rozdenia: ");
        int birthdate = scanner.nextInt();
        int currentYear = 2023;
        int age = currentYear - birthdate;
        
        System.out.println("Hello, " + lastname + " " + firstname); 
        System.out.println("Your age: " + age );
    }
    
}
