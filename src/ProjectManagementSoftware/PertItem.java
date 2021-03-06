/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectManagementSoftware;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Anthony
 */
public class PertItem {
    
    public Calendar startDate = Calendar.getInstance();
    public Calendar endDate = Calendar.getInstance();
    public Calendar lateStart = Calendar.getInstance();
    public Calendar lateEnd = Calendar.getInstance();
    public boolean critAct; 
    public int lengthDays;
    public int slackDays;
    public String ID;
    public ArrayList predecessorID = new ArrayList();
    public ArrayList successorID = new ArrayList();
    public String actName;
    public String dateStringStart;
    public String dateStringEnd;
    public String dateStringLateStart;
    public String dateStringLateEnd;
    private String dateFormat = "dd/MM/yyyy";;
    SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
    public String type;
    
    public PertItem() {
        
        this.type = "PRT";
    }
    
    public PertItem(String name, boolean critAct){
        this.dateFormat = "dd/MM/yyyy";
        this.critAct = critAct;
        this.actName = name;
    }
    
    public PertItem(int lengthDays, String name, boolean critAct){
        this.dateFormat = "dd/MM/yyyy";
        this.lengthDays = lengthDays;
        this.critAct = critAct;
        this.actName = name;
        this.dateStringLateStart = "";
        this.dateStringLateEnd = "";
        this.slackDays = 0;
    }
    
    public String getID() {
        return this.ID;
    }
    
    public void setID(String ID) {
        this.ID = ID;
    }
    
    public void addPre(String preID){
        predecessorID.add(preID);
    }
    
    public void addSuc(String sucID){
        successorID.add(sucID);
    }
    
    public void setDate(String date) {
        try {
            startDate.setTime(sdf.parse(date));
        } catch (ParseException ex) {
            Logger.getLogger(PertItem.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (startDate.isSet(Calendar.DAY_OF_MONTH) && startDate.isSet(Calendar.MONTH) && startDate.isSet(Calendar.YEAR)){       
        endDate = (Calendar) startDate.clone();
        endDate.add(Calendar.DATE, lengthDays);
        dateStringStart = date;
        dateStringEnd = sdf.format(endDate.getTime());
        }
        else{
            System.err.println("No valid date given.");
        }
    }
    
    public void getDate() {
        dateStringStart = startDate.toString();
    }
    
    public String getType(){
        return this.getID();
    }
    
    public String returnStartDate(){
        return dateStringStart;
    }
    
    public String returnEndDate(){
        return dateStringEnd;
    }
    
    public String returnSlackStart(){
        return dateStringLateStart;
    }
    
    public String returnSlackEnd(){
        return dateStringLateEnd;
    }
    
    public int returnSlack(){
        return slackDays;
    }
}
