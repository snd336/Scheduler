import java.util.List;
import java.util.ArrayList;

public class Merge {
  
  
  public static void addPermutation(Employee emp) {
    int[] testing = new int[Employee.endOfWeek];
    int[] old = new int[Employee.endOfWeek];
    old = emp.tempObject.getPermutation();
    for (int i = 0; i < Employee.endOfWeek; i++) {
      testing[i] = old[i];
    }
    emp.permutationList.add(testing);
  }
  
  public static void addPermutationShift(Employee emp) {
    int[] testing = new int[Employee.endOfWeek];
    int[] old = new int[Employee.endOfWeek];
    old = emp.tempObject.getPermutationShiftId();
    for (int i = 0; i < Employee.endOfWeek; i++) {
      testing[i] = old[i];
    }
    emp.shiftIdList.add(testing);
  }
  
  public static void printEmpListSize(Employee emp){
    System.out.print(emp.permutationList.size());
  }
  
  public static void printPermutation(Employee emp) {
    int[] array = new int[7];
    for (int i = 0; i < emp.permutationList.size(); i++) {
      array = emp.permutationList.get(i);
      for (int value : array) {
        System.out.print(value);
      }
      System.out.println(emp.permutationList.size());
    }
  }
  public static void printPermutationShift(Employee emp) {
    int[] array = new int[7];
    for (int i = 0; i < emp.shiftIdList.size(); i++) {
      array = emp.shiftIdList.get(i);
      for (int value : array) {
        System.out.print(value);
      }
      System.out.println(emp.shiftIdList.size());
    }
  }
  
  
  
  
  
}