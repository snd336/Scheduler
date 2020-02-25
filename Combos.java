import java.util.List;
import java.util.ArrayList;

public class Combos {
  
  
  protected int numOfEmployees;
  protected int[] tempStorage;
  protected int[] newArray;
  protected int sizeOfNewArray;
  
  
  public Combos(int numOfEmployees, int sizeOfNewArray){
    this.numOfEmployees = numOfEmployees;
    this.tempStorage = new int[numOfEmployees];
    this.sizeOfNewArray = sizeOfNewArray;
    this.newArray = new int[sizeOfNewArray];
    setNewArray();
  }
  
  public void setNewArray(){
    for (int i = 0; i < newArray.length; i++){
     this.newArray[i] = 0; 
    }
  }
  public void updateNewArray(int pos, int value) {

    newArray[pos] = value;
  }
  
  
  public void setTempStorage(int empNumber, int listIndex) {
    tempStorage[empNumber] = listIndex;
    
    
  }
  

  public void addArray(int[] array,int empNum) {
    int value;
    int pos;
    pos = empNum*Employee.endOfWeek;

    for (int i = 0; i < array.length; i++) {
      value = array[i];
      
      updateNewArray(pos,value);
      pos++;
    }
    pos = 0;
    
   
    
  }
  
  //return false if invalid
  //true if valid
  public boolean checkArrayForDuplicates() {
    for (int i = 0; i < newArray.length; i++) {
      for (int j = i + 1; j < newArray.length; j++) {
        if (newArray[j] != 0 && newArray[i] != 0 && newArray[j] == newArray[i]) {
          return false; 
        }
      }
    }
     return true;
  }

  //false for no duplicates
 public boolean checkArrayForDuplicates(int[] testing) {
   for (int k = 0; k < testing.length; k++) {
     System.out.print(testing[k]);
   }
   System.out.println("");
   
    for (int i = 0; i < testing.length; i++) {
      for (int j = i + 1; j < testing.length; j++) {
        if (testing[j] != 0 && testing[i] != 0 && testing[j] == testing[i]) {
          return false; 
        }
      }
    }
     return true;
  }
  
  
  //tempStorage[empNumber] = listIndex;
  public void printCombination(Employee[] emp){
    int[][] array = new int[emp.length][Employee.endOfWeek];
    for (int i = 0; i < numOfEmployees; i++) {
      array[i] = emp[i].permutationList.get(tempStorage[i]);
      formatComboPrint(array[i]);
    }
    System.out.println("");
  }
  
  public void formatComboPrint(int[] array){
    
    for (int value : array){
      System.out.print(value);
    }
    System.out.print("     ");
    
  }
  
  
}