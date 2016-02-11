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
    
    
    public GANTTItem() {
        
    }
    
    public GANTTItem(Date start, Date end, String name){
        this.startDate = start;
        this.endDate = end;
        this.actName = name;
    }
    
    public String getID() {
        return this.ID;
    }
    
    public void setID(String ID) {
        this.ID = ID;
    }
    
}
