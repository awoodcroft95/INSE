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
//test
public class WBTItem 
{
    
    public String ID;
    public String actName;
    public String parentID;
    public ArrayList childrenID = new ArrayList();
    public String activityInfo;
    public String code;
    public int percentageWork;
    public int level;
    public String type;
    
    public WBTItem()
    {
        type = "WBT";
    }
    
    public WBTItem(String actName)
    {
        this.actName = actName;
    }
    
    public void setLevel(int level){
        this.level = level;
    }
    
    public void setPercentage(int percentage){
        this.percentageWork = percentage;
    }
    
    public String getID() {
        return this.ID;
    }
    
    public void setID(String ID)
    {
        this.ID = ID;
    }
    
    public void setParent(String pID)
    {
        this.parentID = pID;
    }
    
    public void addChild(String cID)
    {
        childrenID.add(cID);
    }
    
    public void setInfo(String info)
    {
        this.activityInfo = info;
    }
    
    public String getType(){
        return this.getID();
    }
    
}
