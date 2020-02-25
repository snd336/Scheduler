public class Day {
 //change day id compatible with day[][]
 protected Week week;
 protected int dayId;
 protected String dayName;
 protected int openTime;
 protected int closeTime;
 
 public Day(int dayId, String dayName){
  this.dayId = dayId;
  this.dayName = dayName;
  this.openTime = 7;
  if (dayId < 4) {
    closeTime = 22;
  } else if (dayId == 3) {
    closeTime = 23;
  } else {
    closeTime = 24;
  }
 }
  
 // GET & SET
 
 public Week getWeek() {
  return week;
 } 
 public void setWeek(Week week) {
  this.week = week;
 }
 
 
 public int getDayId() {
  return dayId;
 } 
 public void setDayId(int dayId) {
  this.dayId = dayId;
 }
 
 public String getDayName() {
  return dayName;
 } 
 public void setDayName(String dayName) {
  this.dayName = dayName;
 } 
 
}