package ProjectManagementSoftware;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author UP730799
 */
public class GANTTItem {
    
    public Calendar startDate = Calendar.getInstance();
    public Calendar endDate = Calendar.getInstance();
    public String ID;
    public ArrayList predecessorID = new ArrayList();
    public ArrayList successorID = new ArrayList();
    public String actName;
    public int lengthDays;
    public String dateStringStart;
    public String dateStringEnd;
    private String dateFormat = "dd/MM/yyyy";
    SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
    
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
    
    public void setDate(String date) {
        try {
            startDate.setTime(sdf.parse(date));
        } catch (ParseException ex) {
            Logger.getLogger(GANTTItem.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (startDate.isSet(Calendar.DAY_OF_MONTH) && startDate.isSet(Calendar.MONTH) && startDate.isSet(Calendar.YEAR)){       
        endDate = (Calendar) startDate.clone();
        endDate.add(Calendar.DATE, lengthDays);
        }
        else{
            System.err.println("No valid date given.");
        }
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
