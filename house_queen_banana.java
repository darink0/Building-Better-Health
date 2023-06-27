import java.text.DecimalFormat; 

public class betterHealth { 

 //variables  
 private double height;
 private double weight;
 private double BMI;
 private String message; 
 
 public betterHealth(double height, double weight) { 
  this.height = height;
  this.weight = weight;
  
  calculateBMI();
 } 
 
 //Calculation of BMI
 public void calculateBMI() { 
  BMI = (weight/((height/100)*(height/100)));
 }
 
 public void setHeight(double height) {
  this.height = height;
  calculateBMI();
 }
 
 public void setWeight(double weight) { 
  this.weight = weight;
  calculateBMI();
 } 
 
 public double getBMI() { 
  return BMI;
 }
 
 public double getHeight() { 
  return height;
 }
 
 public double getWeight() {
  return weight;
 }
 
 //method that returns a message based on BMI
 public String getMessage() {
  DecimalFormat df = new DecimalFormat("#.0");
  
  if (BMI<18.5) {
   message = "You are Underweight, your BMI is "+df.format(BMI);
  }
  else if (BMI>=18.5 && BMI<25) {
   message = "You are Normal Weight, your BMI is "+df.format(BMI);
  }
  else if (BMI>=25 && BMI<30) {
   message = "You are Overweight, your BMI is "+df.format(BMI);
  }
  else if (BMI>30) {
   message = "You are Obese, your BMI is "+df.format(BMI);
  }
  return message;
 }
 
 //Method that prints out the message
 public void printMessage() { 
  System.out.println(message);
 }
 
 //Main method
 public static void main(String[] args) { 
  //Test Case
  betterHealth bh = new betterHealth(175, 83); 
 
  System.out.println("Your Weight: "+bh.getWeight()+"Kg");
  System.out.println("Your Height: "+bh.getHeight()+"cm");
  System.out.println("Your BMI: "+bh.getBMI());
  bh.getMessage();
  bh.printMessage();
 }
 
}