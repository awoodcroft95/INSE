/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectManagementSoftware;
import java.util.ArrayList;

/**
 *
 * @author Anthony
 */
public class WBTItem {
    
    public String ID;
    public String actName;
    public String parentID;
    public ArrayList childrenID = new ArrayList();
    public String activityInfo;
    
    public WBTItem(){
        
    }
    
    public WBTItem(String actName){
        this.actName = actName;
    }
    
    public String getID() {
        return this.ID;
    }
    
    public void setID(String ID) {
        this.ID = ID;
    }
    
    public void setParent(String pID){
        this.parentID = pID;
    }
    
    public void addChild(String cID){
        childrenID.add(cID);
    }
    
    public void setInfo(String info){
        this.activityInfo = info;
    }    
    
}
