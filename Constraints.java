public class Constraints {
  
  //For Specific company to apply to all employees
  public static void setConstraints(){
    
    
    //Changes class variables of employees
    Employee.minFTHours = 32;
    Employee.maxFTHours = 40;
    Employee.minPTHours = 15;
    Employee.maxPTHours = Employee.minFTHours; //Change in check constraints and Employee may be better to do 31?
    Employee.maxDaysPerWeek = 6; //Per Week 
    Employee.maxDaysInRow = 5;//Days in a row, refers to week before * not changed yet.
    //redundant check, when scheduling specific emp use availiblity to cross days in a row
    //Holiday
    Employee.endOfWeek = 7;
    
  }
  
  
  //returns true if within employer constraints
  public static boolean checkConstraints(Employee emp){
    boolean constraintCheck;
    
    //check if permutation between FT or PT Hours
    if (emp.isFullTime() == true) {
      constraintCheck = checkBetweenFT(emp.tempObject);
    }
    else {
      constraintCheck = checkBetweenPT(emp.tempObject);
    }
    
   if (constraintCheck == false) return false;
   
   if (checkMaxDaysPerWeek(emp.tempObject) == false) return false;
  
   if (checkMaxDaysInRow(emp.tempObject) == false) return false;
    
    return constraintCheck;
  }
  
  

     //check if between FT Hours
  public static boolean checkBetweenFT(TempObject data){
    return (data.getPermutationSum() >= Employee.minFTHours && data.getPermutationSum() <= Employee.maxFTHours);
  }
  
   //check if between PT Hours
  public static boolean checkBetweenPT(TempObject data){
    return (data.getPermutationSum() >= Employee.minPTHours && data.getPermutationSum() < Employee.maxPTHours);
  }
  
  //check max days per week
  public static boolean checkMaxDaysPerWeek(TempObject data){
    return (data.getDayCount() <= Employee.maxDaysPerWeek);
  }
  
  //check max days in row 
  public static boolean checkMaxDaysInRow(TempObject data){
    return (data.getDayInRowCount() <= Employee.maxDaysInRow);
  }
}