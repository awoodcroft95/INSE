/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectManagementSoftware;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Anthony
 */
public class GANTTItem {
    
    public Date startDate = new Date();
    public Date endDate = new Date();
    public String ID;
    public ArrayList predecessorID = new ArrayList();
    public ArrayList successorID = new ArrayList();
    public String actName;
    public int lengthDays;
    public String dateStringStart;
    public String dateStringEnd;
    
    
    public GANTTItem() {
        
    }
    
    public GANTTItem(int lengthDays, String name){
        this.lengthDays = lengthDays;
        this.actName = name;
    }
    
    public String getID() {
        return this.ID;
    }
    
    public void setID(String ID) {
        this.ID = ID;
    }
    
    public void setDate(int day, int month, int year) {
        startDate.setYear(year);
        startDate.setMonth(month);
        startDate.setDate(day);
        
        endDate.setYear(year);
        endDate.setMonth(month);
        endDate.setDate(day+lengthDays);//might not work unless it knows to move month over when day is greater than days in month
        
    }
    
    public void addPre(String preID){
        predecessorID.add(preID);
    }
    
    public void addSuc(String sucID){
        successorID.add(sucID);
    }
    
    public void getDate() {
        dateStringStart = startDate.toString();
        dateStringEnd = endDate.toString();
    }
}
