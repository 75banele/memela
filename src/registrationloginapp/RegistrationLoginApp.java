/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package registrationloginapp;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class RegistrationLoginApp {
   

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        RegistrationLogin key = new RegistrationLogin();

        System.out.println("REGISTRATION");
        System.out.println("Enter first name");
        String first = input.nextLine();
        System.out.println("Enter last name");
        String last = input.nextLine();
        System.out.println("Enter the username");
        String username = input.nextLine();
        System.out.println("Enter the password");
        String password = input.nextLine();
        System.out.println("Enter the cellphone number");
        String cell = input.nextLine();

        System.out.println(key.registerUser(username, password, cell, first, last));

        
        
        System.out.println("LOGIN");
        System.out.println("Enter the username");
        String loginUsername = input.nextLine();
        System.out.println("Enter the password");
        String loginPassword = input.nextLine();
        
        boolean LoginStatus = key.loginUser(loginUsername, loginPassword);
        System.out.println(key.returnLoginStatus(LoginStatus));
    }
}

    /**
     * @param args the command line arguments
     */
   
       
    
    

