public class CreateFirstWeek {
 
 public static void createFirstWeek(){
  
  // Convenient String arrays
  String[] dayNames = {"Mon","Tue","Wed","Thu","Fri","Sat","Sun"}; 
  String[] positionNames = {"Manager","Cook","Cashier","Dishwasher","Busser","Bar"};
  String[] shiftNames = {"A.M.","Mid","P.M."};
  
  
  
  Week firstWeek = new Week(1);
  
  Day[] days = new Day[dayNames.length];
  Position[] positions = new Position[positionNames.length];
  Shift[] shifts = new Shift[shiftNames.length];
  
  
 
  for (int i = 0; i < dayNames.length; i++) {
    days[i] = new Day(i,dayNames[i]);
    days[i].setWeek(firstWeek);
  }
  for (int i = 0; i < positionNames.length; i++) {
    positions[i] = new Position(i,positionNames[i]);
  }
  for (int i = 0; i < shiftNames.length; i++) {
    shifts[i] = new Shift(i,shiftNames[i]);
  } 
  
  

  
  
 }
 
 
}