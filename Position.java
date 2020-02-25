public class Position {
  
 protected Shift shift;
 protected int positionId;
 protected String positionName;
 
 public Position(int positionId, String positionName){
  this.positionId = positionId;
  this.positionName = positionName;
 }
  
 // GET & SET
 
 public Shift getShift() {
  return shift;
 } 
 public void setShift(Shift shift) {
  this.shift = shift;
 }
 
 public int getPositionId() {
  return positionId;
 } 
 public void setPositionId(int positionId) {
  this.positionId = positionId;
 }
 
 public String getPositionName() {
  return positionName;
 } 
 public void setPositionName(String positionName) {
  this.positionName = positionName;
 }
  
}