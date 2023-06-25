public class BuildingBetterHealth { 
  
    public static void main(String[] args) { 
  
        // Declaring variables 
        int age; 
        double height; 
        double weight; 
        String gender; 
        double bmi; 
  
        // Initializing variables 
        age = 30; 
        height = 173.0; 
        weight = 74.0; 
        System.out.println("Your age is: " + age); 
        System.out.println("Your height is: " + height + " cm"); 
        System.out.println("Your weight is: " + weight + " kg"); 
  
        // Calculating BMI 
        bmi = weight / Math.pow(height, 2); 
        System.out.println("Your BMI is: " + bmi); 
  
        // Evaluating BMI 
        if (18.5 < bmi && bmi < 25.0) { 
            System.out.println("Your BMI falls in the normal range."); 
        } 
        else if (bmi >= 25.0) { 
            System.out.println("Your BMI is above the normal range."); 
        } 
        else { 
            System.out.println("Your BMI is below the normal range."); 
        } 
  
        // Outputting advice 
        if (bmi < 18.5) { 
            System.out.println("Eat more healthy food such as"
                               + " fruits, vegetables and grains to gain weight!"); 
        } 
        else if (bmi >= 25.0) { 
            System.out.println("Exercise more to burn calories and reduce weight!"); 
        } 
        else { 
            System.out.println("Maintain your current weight by"
                               + " eating a healthy and balanced diet!"); 
        } 
  
        // Outputting gender-specific advice 
        System.out.println("Please input your gender (M/F):"); 
        Scanner scanner = new Scanner(System.in); 
        gender = scanner.nextLine(); 
        if (gender.equals("M") || gender.equals("m")) { 
            System.out.println("Men should also consider reducing their alcohol intake."); 
        } 
        else if (gender.equals("F") || gender.equals("f")) { 
            System.out.println("Women should also consider taking more calcium."); 
        } 
        else { 
            System.out.println("Please select either 'M' or 'F'."); 
        } 
  
        // Outputting advice about stress 
        System.out.println("Manage stress levels to ensure a healthy lifestyle."
                           + " Stay active to help combat stress."); 
  
        // Outputting advice about sleep
        System.out.println("Get sufficient sleep and rest from time to time to stay healthy."); 
  
        // Closing the scanner 
        scanner.close(); 
    } 
}