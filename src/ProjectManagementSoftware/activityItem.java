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
public abstract class activityItem {
    public String type;
    public String ID;
    
    public String getType(){
        return this.type;
    }
    
    public void setID(String id){
        this.ID = id;
    }
}
