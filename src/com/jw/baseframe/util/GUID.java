// Decompiled by Jad v1.5.7g. Copyright 2000 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/SiliconValley/Bridge/8617/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi 
// Source File Name:   RandomGUID.java

package com.jw.baseframe.util;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.*;
import java.util.Random;

public class GUID
{

    public String valueBeforeMD5;
    public String valueAfterMD5;
    private static Random myRand;
    private static SecureRandom mySecureRand;
    private static String s_id;

    public GUID()
    {
        valueBeforeMD5 = "";
        valueAfterMD5 = "";
        getRandomGUID(false);
    }

    public GUID(boolean secure)
    {
        valueBeforeMD5 = "";
        valueAfterMD5 = "";
        getRandomGUID(secure);
    }

    private void getRandomGUID(boolean secure)
    {
        MessageDigest md5 = null;
        StringBuffer sbValueBeforeMD5 = new StringBuffer();
        try
        {
            md5 = MessageDigest.getInstance("MD5");
        }
        catch(NoSuchAlgorithmException e)
        {
            System.out.println("Error: " + e);
        }
        try
        {
            long time = System.currentTimeMillis();
            long rand = 0L;
            if(secure)
                rand = mySecureRand.nextLong();
            else
                rand = myRand.nextLong();
            sbValueBeforeMD5.append(s_id);
            sbValueBeforeMD5.append(":");
            sbValueBeforeMD5.append(Long.toString(time));
            sbValueBeforeMD5.append(":");
            sbValueBeforeMD5.append(Long.toString(rand));
            valueBeforeMD5 = sbValueBeforeMD5.toString();
            md5.update(valueBeforeMD5.getBytes());
            byte array[] = md5.digest();
            StringBuffer sb = new StringBuffer();
            for(int j = 0; j < array.length; j++)
            {
                int b = array[j] & 0xff;
                if(b < 16)
                    sb.append('0');
                sb.append(Integer.toHexString(b));
            }

            valueAfterMD5 = sb.toString();
        }
        catch(Exception e)
        {
            System.out.println("Error:" + e);
        }
    }

    public String toString()
    {
        String raw = valueAfterMD5.toUpperCase();
        StringBuffer sb = new StringBuffer();
        sb.append(raw.substring(0, 8));
        sb.append("-");
        sb.append(raw.substring(8, 12));
        sb.append("-");
        sb.append(raw.substring(12, 16));
        sb.append("-");
        sb.append(raw.substring(16, 20));
        sb.append("-");
        sb.append(raw.substring(20));
        return sb.toString();
    }

    static 
    {
        mySecureRand = new SecureRandom();
        long secureInitializer = mySecureRand.nextLong();
        myRand = new Random(secureInitializer);
        try
        {
            s_id = InetAddress.getLocalHost().toString();
        }
        catch(UnknownHostException e)
        {
            e.printStackTrace();
        }
    }
}