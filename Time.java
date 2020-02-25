public class Time {
 
 protected Position position;
 protected int startTime;
 protected int finishTime;
 protected int totalTime;
 
 public Time(int startTime, int finishTime) {
  this.startTime = startTime;
  this.finishTime = finishTime;
  this.totalTime = finishTime - startTime;
 }
 
 // GET& SET
 
 public Position getPosition() {
  return position;
 } 
 public void setPosition(Position position) {
  this.position = position;
 }
 
 public int getStartTime() {
  return startTime;
 } 
 public void setStartTime(int startTime) {
  this.startTime = startTime;
 }
 
 public int getFinishTime() {
  return startTime;
 } 
 public void setFinishTime(int finishTimefinishTime) {
  this.finishTime = finishTime;
 }
 
 public int getTotalTime() {
  return totalTime;
 } 
 public void setTotalTime(int totalTime) {
  this.totalTime = totalTime;
 }
 
 
}