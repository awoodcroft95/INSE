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
public class PertItem {
    
    public Date startDate = new Date();
    public Date endDate = new Date();
    public Date lateStart = new Date();
    public Date lateEnd = new Date();
    public boolean critAct; 
    public int lengthDays;
    public int stackDays;
    public String ID;
    public ArrayList predecessorID = new ArrayList();
    public ArrayList successorID = new ArrayList();
    public String actName;
    public String dateStringStart;
    public String dateStringEnd;
    
    public PertItem() {
    }
    
    public PertItem(int lengthDays, String name, boolean critAct){
        this.lengthDays = lengthDays;
        this.critAct = critAct;
        this.actName = name;
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
    
    public void calcStartDate() {
        
    }
    
    public void setStrtDate(int day, int month, int year) {
        startDate.setMonth(month);
        startDate.setYear(year);
        startDate.setDate(day);
    }
    
    public void getDate() {
        dateStringStart = startDate.toString();
        dateStringEnd = endDate.toString();
    }
    
    
    
    
}
