public class Shift {
 
 protected Day day;
 protected int shiftId;
 protected String shiftName;
 
 public Shift(int shiftId, String shiftName){
  this.shiftId = shiftId;
  this.shiftName = shiftName;
 }
  
 // GET & SET
 
 public Day getDay() {
  return day;
 } 
 public void setDay(Day day) {
  this.day = day;
 }
 
 public int getShiftId() {
  return shiftId;
 } 
 public void setShiftId(int shiftId) {
  this.shiftId = shiftId;
 }
 
 public String getShiftName() {
  return shiftName;
 } 
 public void setShiftName(String shiftName) {
  this.shiftName = shiftName;
 }
 
}