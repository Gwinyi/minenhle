package finaltasktwo;

import javax.swing.JOptionPane;


public class FinalTaskTwo {
    boolean checkTaskDescription;
    String createTaskID;
    String printTaskDetails;
    int returnTotalHours;
    String taskDevDetails;
    String taskStatus;
    String taskNumber;
    String taskName;
    String taskDesc;
    String taskID;
    String taskDuration;
    
    
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
    
    public static String getPrintTaskDetails(String taskStatus, String taskDetails, int taskNumber, String taskName, String taskDemo, String taskID, int taskDuration) {
        JOptionPane.showMessageDialog(null, "Task details of task 1 : " + taskNumber + "\n Task Status" + taskStatus + "\n Developer Details :" + taskDetails + "\n Task number : " + taskNumber + "\n Task name : " + taskName + "\n Task ID : " + taskID + "\n Task Duration : " + taskDuration + " hours");
        return taskDetails;
}
    



   






    public void setPrintTaskDetails(String printTaskDetails){
        this.printTaskDetails = printTaskDetails;
    }
    //calc method
    public int getReturnTotalHours(int taskDuration, int totalHours)
    {
        totalHours = totalHours +taskDuration;
        return totalHours;
    }
    
    public void getReturnTotalHours(int returnTotalHours)
    {
        this.returnTotalHours = returnTotalHours;
    }
    
    }
           
   