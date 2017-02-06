package com.company;

import java.util.*;
import java.text.*;

public class Main {

    public static void main(String[] args) {

        Scanner sb = new Scanner(System.in);

        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Date dateobj = new Date();

        System.out.println("Welcome to the NEW Apple iMessaging system!\nEnter your phone number:");
        String phoneNum = sb.nextLine();
        System.out.println("Enter your message: ");
        String txtMessage = sb.nextLine();
        System.out.println(df.format(dateobj));

        Message hello = new Message(phoneNum, txtMessage, dateobj);

        while (true) {
            System.out.println("Would you like to ADD another message, REMOVE the last message on list, PRINT out all the\n " +
                    "messages already sent, or CLEAR the message list (Type EXIT to end program)");
            String response = sb.nextLine();

            if(response.equalsIgnoreCase("EXIT"))
            {
                break;
            }

            else if (response.equalsIgnoreCase()){

            }
        }


    }
}
