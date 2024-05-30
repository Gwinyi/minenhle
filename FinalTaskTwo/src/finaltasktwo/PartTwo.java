 
package finaltasktwo;
import javax.swing.JOptionPane;


 
    
     public class PartTwo {
    boolean checkTaskDescription;
    String createTaskID;
    String printTaskDetails;
    int returnTotalHours;
    
    //method 1
    public boolean isCheckTaskDescrption(String taskName){
        
        if(taskName.length()<=50){
            
            JOptionPane.showMessageDialog(null,"Task captured");
        }
        else{
            JOptionPane.showMessageDialog(null,"Desc exceeded....." );
        }
        return checkTaskDescription = true;
        
    
    
    
    
}
   //setter
    public boolean isCheckTaskDescription() {
        return checkTaskDescription;
    }

    public void setCheckTaskDescription(boolean checkTaskDescription) {
        this.checkTaskDescription = checkTaskDescription;
    }

    //dealing with the task id AD:0:INA
    public String getCreateTaskID(String taskName , int taskNumber,
             String taskDev ,String taskID)
    {
        taskID = taskName.substring(0,2).toUpperCase()+ ":"
                + taskNumber + ":"
                + taskDev.substring(taskDev.length()-3).toUpperCase();
        
        return null;
     }
   //The setter
    public String getCreateTaskID() {
        return createTaskID;
    }

    public void setCreateTaskID(String createTaskID) {
        this.createTaskID = createTaskID;
    }

    }

