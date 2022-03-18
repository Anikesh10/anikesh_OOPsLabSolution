package com.services;
import java.util.Random;

import com.model.*;

public class CredentialService {
    public final static String generateEmail(String firstName, String lastName, String dept) {
        return (firstName + lastName + "@" + dept + ".company.com ");
    }
    
    public static void displayCreds(Employee emp) {
        System.out.println("Hi " + emp.getFirstName() + ", please find your new email and password");

        System.out.println("Email     =" + emp.getEmailId());
        System.out.println("Password  =" + emp.getPassword());
    }

    public final static String generatePassword(int length) {
        String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smallLetters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "1234567890";
        String specialcharacters = "!@#$%^&*_=+-/.?<>)";
        String characterList = capitalLetters + smallLetters + numbers + specialcharacters;

        char[] password = new char[length];
        Random random = new Random();
        
        for (int index = 0; index < length; index++) {
            int randomNumber = random.nextInt(characterList.length());
            char c = characterList.charAt(randomNumber);
            password[index] = c;
        }
        
        return password.toString();
    }


   

}
