package com.company;

import java.util.Date;

/**
 * Created by df377 on 1/30/17.
 */
public class Message {

    public String phone;
    public String message;
    public Date timeReceived;

    public Message(String p, String m, Date tR)
    {
        phone = p;
        message = m;
        timeReceived = tR;
    }
}
