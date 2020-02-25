public class Scheduler {
  
  public static void main(String[] args) {

    // TempObject data = new TempObject();
        
    boolean[] stephAvailability = {true,false,true,false,false,true,true};
    Employee steph = new Employee(1,"Steph",stephAvailability,false);
    
    boolean[] erinAvailability = {false,true,true,true,true,true,false};
    Employee erin = new Employee(2,"Erin",erinAvailability,true);
    
    boolean[] kimAvailability = {false,true,true,false,false,true,true};
    Employee kim = new Employee(3,"Kim",kimAvailability,false);
    
    boolean[] dorisAvailability = {true,true,true,true,true,true,true};
    Employee doris = new Employee(4,"Doris",dorisAvailability,false);
    
    Employee[] employees = {doris,erin,kim,steph};
    Constraints.setConstraints();
    Combos combos = new Combos(employees.length,Employee.endOfWeek*employees.length);
    
    
    
    for (Employee emp : employees) {
      permutate(0, emp);
    }
    
    //Merge.printEmpListSize(steph);
    // Merge.printEmpListSize(erin);
    //Merge.printPermutation(steph);
    recursiveCombo(0, employees, combos);
    
    /*
    
    
    int[] testing = {1,0,7,0,0,16,19,0,4,8,10,13,17,0};
    if (combos.checkArrayForDuplicates(testing) == true) System.out.println("FUCK");
    
    int[] testing2 = {1,0,7,0,10,16,19,0,4,8,10,13,17,0};
    if (combos.checkArrayForDuplicates(testing2) == false) System.out.println("YOU");
    */
  }
  
  public static void recursiveCombo(int empNum, Employee[] emp, Combos combos) {
    int[][] array = new int[emp.length][Employee.endOfWeek];

    if (empNum == emp.length) {

      if (combos.checkArrayForDuplicates() == true) {
       
       combos.printCombination(emp);
        
        
      }
    } else {   
      
      for (int i = 0; i < emp[empNum].shiftIdList.size(); i++) {       
        array[empNum] = emp[empNum].shiftIdList.get(i);
        

        combos.setTempStorage(empNum,i);   

        combos.addArray(array[empNum],empNum);
        
        recursiveCombo(empNum + 1, emp, combos);   
      } 
    }
  }
  
  public static void permutate(int pos, Employee emp){
    //end of week
    if (pos == Employee.endOfWeek) {
      if (Constraints.checkConstraints(emp) == true) {
        
        Merge.addPermutation(emp);
        Merge.addPermutationShift(emp);
        //Testing Code
       // Merge.printPermutation(emp);
        //Merge.printPermutationShift(emp);
        //emp.tempObject.debugShiftId();
        
      }
    } else if (emp.isAvailable(pos) == false) {
      emp.tempObject.setPermutationValue(pos,0);  
      emp.tempObject.setCurrentShiftId(pos,0);
      permutate(pos + 1, emp); 
    } else {   
      for (int i = 0; i < emp.tempObject.getCurrentDay().length; i++) {       
        emp.tempObject.setCurrentDay(pos);
        emp.tempObject.setPermutationValue(pos,emp.tempObject.getCurrentDayValue(i));
        emp.tempObject.setCurrentShiftId(pos,i+1);
        permutate(pos + 1, emp);   
      } 
    }
  }
  
}