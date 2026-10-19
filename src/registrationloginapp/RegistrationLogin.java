/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registrationloginapp;
import java.util.Scanner;
/**
 *
 * @author Student
 */

  



/**
 *
 * @author Student
 */
public class RegistrationLogin{
    private String registeredUsername;
    private String registeredPassword;
    private String registeredCell;
    private String registeredFirstName;
    private String registeredLastName;

    public boolean checkUsername(String username){
        return username.contains("_") && username.length() <= 5;
    }

    public boolean checkPasswordComplexity(String password){
        boolean length = password.length() >= 8;
        boolean hasUpper = password.matches(".[A-Z].");
        boolean hasDigit = password.matches(".[0-9].");
        boolean hasSpecial = password.matches(".[^a-zA-Z0-9].");
        return length && hasUpper && hasDigit && hasSpecial;
    }

    public boolean checkCellPhoneNumber(String cell){
        return cell.matches("^\\+27\\d{10}$");
    }

    public String registerUser(String username, String password, String cell, String firstName, String lastName){
        if(!checkUsername(username)){
            return "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five in length.";
        }
        if(!checkPasswordComplexity(password)){
            return "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
        }
        if(!checkCellPhoneNumber(cell)){
            return "Cell phone number incorrectly formatted or does not contain international code.";
        }
        this.registeredUsername = username;
        this.registeredPassword = password;
        this.registeredCell = cell;
        this.registeredFirstName = firstName;
        this.registeredLastName = lastName;
        return "The two above conditions have been met, and the user has been registered successfully.";
    }

    public boolean loginUser(String username, String password){
        return username.equals(registeredUsername) && password.equals(registeredPassword);
    }

    public String returnLoginStatus(boolean loggedIn){
        if(loggedIn){
            return "Welcome " + registeredFirstName + " " + registeredLastName + ", it is great to see you again.";
        } else {
            return "Username or password incorrect, please try again.";
        }
    }
      public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        RegistrationLogin app = new RegistrationLogin();
        
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

        System.out.println(app.registerUser(username, password, cell, first, last));
        
       
    }
}

  
