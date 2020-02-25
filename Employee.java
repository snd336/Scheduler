import java.util.List;
import java.util.ArrayList;

public class Employee {
  
  //class variables
  protected static int maxDaysPerWeek;
  protected static int maxDaysInRow;
  protected static int maxFTHours;
  protected static int minFTHours;
  protected static int maxPTHours;
  protected static int minPTHours;
  protected static int endOfWeek;
  
  
  //instance variables
  protected int employeeId;
  protected String employeeName;
  protected Position position;
  protected boolean fullTime;
  protected int currentHours;
  protected int overTimeHours;
  protected double payRate;
  protected boolean[] availability;
  protected TempObject tempObject;
  
  //Testing Code
  protected List<int[]> permutationList;
  protected List<int[]> shiftIdList;
  
  
  public Employee(int employeeId, String employeeName, boolean[] availability, boolean fullTime){
    this.employeeId = employeeId;
    this.employeeName = employeeName;
    this.tempObject = new TempObject();
    setAvailability(availability);
    this.fullTime = fullTime;
    //Testing Code
    this.permutationList = new ArrayList<int[]>();
    this.shiftIdList = new ArrayList<int[]>();
    
    
  }
  
  
  // GET & SET 
  public int getEmployeeId() {
    return employeeId;
  } 
  public void setEmployeeId(int employeeId) {
    this.employeeId = employeeId;
  }
  public boolean getFullTime() {
    return fullTime;
  } 
  public void getFullTime(boolean fullTime) {
    this.fullTime = fullTime;
  }
  public boolean isFullTime(){
    return fullTime;
  }
  
  public String getEmployeeName() {
    return employeeName;
  } 
  public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
  }
  
  public boolean[] getAvailability() {
    return availability;
  } 
  public void setAvailability(boolean[] availability) {
    this.availability = availability;
    //changing for permuation cycle
    changeTempObjectDay(availability);
  }
  
  //Methods
  //returns true for specific day
  public boolean isAvailable(int day) {
    return availability[day];
  }
  
  //change employee day
  public void changeTempObjectDay(boolean[] availability) {
    int i = 0;
    for (boolean day : availability){
      if (day == false) {
        tempObject.setDayValue(i,0);    
      }
      i++;
    }
    
  }
  public void printDayAvailability() {
    tempObject.printDays();
  }
}