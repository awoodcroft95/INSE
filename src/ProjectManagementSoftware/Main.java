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
import java.util.Random;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Main 
{

    Random randGen = new Random();
    String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    
    
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
    
    public void generateID(activityItem item){
        int charSelect = randGen.nextInt(26);
        int id_A = randGen.nextInt(1000000);
        char id_B = alpha.charAt(charSelect);
        char id_C = alpha.charAt(charSelect);
        char id_D = alpha.charAt(charSelect);
        String id = null;
        if ("WBT".equals(item.getType())){    
            id = "WBT" + id_A + id_B + id_C + id_D;
        }else if ("GNT".equals(item.getType())){
            id = "GNT" + id_A + id_B + id_C + id_D;
        }else if ("PRT".equals(item.getType())){
            id = "PRT" + id_A + id_B + id_C + id_D;
        }else{
            System.out.println("Not a valid Item given.");
        }
        item.setID(id);
    }
    
}
