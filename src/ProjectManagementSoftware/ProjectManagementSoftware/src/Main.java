/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectManagementSoftware;


/**
 *
 * @author Anthony
 */

import java.io.*;
import java.util.*;
import java.util.Date;


import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Calendar;


public class Main 
{

    
    
    public static void main(String[] args) throws IOException 
    {
       
        String dateFormat = "dd/MM/yyyy";
        
        SimpleDateFormat sfd = new SimpleDateFormat(dateFormat);
        
        Scanner input = new Scanner(System.in);
        
        Date projectStart = new Date();
        Date projectEnd = new Date();
        
        try
        {
            System.out.println("Enter the start date: ");
            projectStart = sfd.parse(input.nextLine());
            
            System.out.println("Enter the End date: ");
            projectEnd = sfd.parse(input.nextLine());
            
        
        }
        catch(Exception e)
        {
            
        }
        

        System.err.println("Project Start date: " + projectStart.toString());
        System.err.println("Project End date: " + projectStart.toString());
        
        
        
    }
    
}
