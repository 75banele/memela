/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Student
 */
public class Message {
    String messageID;
    String recipient;
    String message;

 }   

    public static void main(String [] args){
        Scanner banzo = new Scanner(System.in);
        int choice;
    
         do {
    System.out.print("Welcome to QuickChat");
    System.out.print("Option 1" + "Send Message");
    System.out.print("Option 2" + "Coming soon");
    System.out.print("Option 3" + "Quit");
    choice = banzo.nextInt();
    
    if(choice == 1){
         }
         else if(choice == 2){
         System.out.println("Coming soon");
         
    }
    else if(choice == 3){
       System.out.println("Thank you for using Quickchat");
       
            }
    else{
       System.out.println("Invalid options chosen!");
    }
    }
   while(choice != 3);
    }
    public static void sendMessage(){
        Scanner banzo = new Scanner(System.in);
        System.out.println("How many times do you want to send");
        int n = banzo.nextInt();
        
        Random ran = new Random();
         String messageID = String.valueOf(200000000 + (long)(ran.nextInt() * 900000000));
         System.out.println("Message ID: " + messageID);
    }  
    public boolean checkMessageID() {
        return messageID.length() == 10;
    }
    public String checkRecipientCell() {
        if (recipient.length() <= 10 && recipient.contains("+")){
            return "cell number successfully captured.";
        } else {
            return "cell number is incorrectly formatted or does not contain an international code. correct number try again.";
        }
    }    
    public String checkMessageLength() {
        if (message.length() <= 250) {
            return "Message sent";
        } else {
            return "please enter a message of less than 250 chars.";
            
        }
   
    public String createMessageHash(){
        String[] words = message.trim().split("\\s+");
        String firstWord = words[0];
        String lastWord = words[words.length - 1];
        String firstTwo = messageID.substring(0, 2);
        String messageHash = firstTwo + ":" + message + ":" + firstWord + lastWord;
        messageHash = messageHash.toUpperCase();
        System.out.println(messageHash);
    
    }  
    public String sendMessage(int choice) {
        Scanner banzo1 = new Scanner(System.in);
        System.out.println("Choose an option: ");
        System.out.println("1. send message");
        System.out.println("2. Disregard message");
        System.out.println("3. Store Message to send later");
   
        System.out.println("Enter your option: ");
        System.out.println("Enter option: 1=Send 2=Delete 3=Stored ");
        int option = banzo1.nextInt();
        
        switch (option){
            case 1:
                System.out.println("Message successfully sent");
                break;
            case 2:
                 System.out.println("Press 0 to delete the message");
                 int delete = banzo1.nextInt();
                 
        if (delete == 0){
             System.out.println("message deleted");
        }
        else{
            System.out.println("message not deleted");
        }
            break;
        case 3:
            System.out.println("message successfully stored");
            break;
        default:
            System.out.println("invalid option");
            banzo1.close();
        }
    }
     
}
        

           
          
           
        
          
                  
    
    
