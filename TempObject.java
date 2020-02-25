
public class TempObject {
  

  private int[] currentDay = new int[7];
  private int[] permutation = new int[7];
  private int permutationSum;
  private int[] shiftId;
  private int currentShiftId;
  private int[] permutationShiftId = new int[7];
  
  //this defaults to pubic?
  int[][] day = {{7,4,0},
    {8,4,0},
    {8,6,0},
    {8,5,0},
    {8,6,0},
    {8,6,0},
    {8,4,2}};
  
  
  public TempObject(){
    setCurrentDay(0);
    setShiftId();
  }
  
  
  //eventually in own class
  //stars at zero, but actually id are 1 plus 0shift = off
  public void setShiftId(){
    int length = 0;
    for (int[] a : day) {
      length += a.length; 
    }
    this.shiftId = new int[length+1];
    for (int i = 0; i < length + 1; i++) {
      this.shiftId[i] = i; 
    }
  }
  public int getCurrentShiftId(){
    return currentShiftId;
  }
  
 
  public void setCurrentShiftId(int pos, int value) {
    currentShiftId = 1;
   
    if (value == 0){
      currentShiftId = 0;
    } else {
      value = value - 1;
      for (int i = 0; i < pos; i++) {
        for (int j = 0; j < day[pos].length; j++) {
          currentShiftId++;
        }
      }
      for (int i = 0; i < value; i++) {
        currentShiftId++; 
      }
      
    }
 
    
    permutationShiftId[pos] = currentShiftId;
  }
  
  public void setPermutationShiftId (int pos, int currentShiftId) {
    
    permutationShiftId[pos] = currentShiftId;
  }
  
  
  public int[] getPermutationShiftId() {
    return permutationShiftId;
  }
  
  public void debugShiftId() {
    printPermutation();
    
    for (int a : permutationShiftId)
      System.out.print(a + " ");
    
    System.out.println("");
    
    for (int a : shiftId)
      System.out.print(a + " ");
    
    System.out.println("");
    
    
  }
 
  
  public int[] getCurrentDay() {
    return currentDay;
  }
  //day[pos][value]
  public int getCurrentDayValue(int value) {
    return currentDay[value];
  }
  //change day hours **HERE
  public void setDayValue(int pos, int value) {
    for (int i = 0; i < day[pos].length; i++) {
      day[pos][i] = value;
    }
  }
  //day[pos][i]
  public void setCurrentDay(int pos) {
    this.currentDay = day[pos];
  }
  
  public int[] getPermutation() {
    return permutation;
  } 
  
  public void setPermutationValue(int pos, int value) {
    this.permutation[pos] = value;
  }
  
  public int getPermutationSum() {
    permutationSum = 0;
    for (int permutationValue : permutation){
      permutationSum += permutationValue;
    }
    return permutationSum;
  } 
  public void setPermutationSum(int permutationSum) {
    this.permutationSum = permutationSum;
  }
  
  
  //Methods
  public void printPermutation(){
    for (int permutationValue : permutation){
      System.out.print(permutationValue);
    }
    System.out.println("");//find a nicer way, moves cursor to next line
  }
  //prints array day
  public void printDays(){
    for (int j = 0; j < day.length; j++){
      for (int i = 0; i < day[j].length; i++){
        System.out.print(day[j][i]);
      }
      System.out.println("");//find a nicer way, moves cursor to next line
    }
  }
  
  
  //returns total days in week
  public int getDayCount(){
    int count = 0;
    for (int permutationValue : permutation){
      if(permutationValue != 0) count++;  
    }
    return count;
  }
  
  // returns max day in a row
  public int getDayInRowCount(){
    int count = 0;
    int max = 0;
    for (int permutationValue : permutation){
      if(permutationValue != 0){
        count++; 
      } else if (count > max) { // if == 0
        max = count;  
        count = 0;
      }
    }
    if (count > max) max = count;
    return max;
  }
  
  
}


