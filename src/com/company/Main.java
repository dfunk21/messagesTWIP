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
        System.out.println("Enter your message:");
        String txtMessage = sb.nextLine();
        System.out.println(df.format(dateobj));

        Message hello = new Message(phoneNum, txtMessage, dateobj);


    }
}
