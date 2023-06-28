public class BuildingBetterHealth {

    public static void main(String[] args) {
        // Declare Variables
        int age;
        int currWeight;
        int goalWeight;
        int calorieIntake;
        String diet;
        String exercise;

        // Initialize Variables
        age = 25;
        currWeight = 160;
        goalWeight = 145;
        calorieIntake = 2000;
        diet = "healthy";
        exercise = "cardio";

        // Print out the goal
        System.out.println("My goal is to reach a healthier weight.");

        // Calculate BMI
        double bodyMassIndex = currWeight / (Math.pow(age, 2) * 0.0001);

        // Print out current BMI
        System.out.println("My current BMI is: " + bodyMassIndex);

        // Determine if BMI needs to be lowered
        if (bodyMassIndex > 25) {
            System.out.println("My BMI needs to be lowered.");
            System.out.println("I will need to make lifestyle changes.");
        } else {
            System.out.println("My BMI is healthy.");
        }

        // Calculate the calories needed to reach goal weight
        int caloriestoLoseWeight = (int) (calorieIntake - ((goalWeight - currWeight) * 3500 / 7));

        // Print out the calories to reach goal weight
        System.out.println("I need to consume " + caloriestoLoseWeight + " calories per day to reach my goal weight.");

        // Create a custom diet plan
        System.out.println("I will create a custom diet plan that includes " + diet + " foods.");

        // Exercise plan for five times a week
        System.out.println("I plan to exercise five times a week for at least thirty minutes. I will do " + exercise + " exercises for cardio.");

        // Monitor progress
        System.out.println("I will monitor my progress and adjust my goals as needed.");

        // Consume enough water
        System.out.println("I will make sure I am consuming enough water throughout the day.");

        // Make healthy snacks available
        System.out.println("I will make sure that healthy snacks are readily available when needed.");

        // Have a reward system
        System.out.println("I will create a reward system for each milestone reached throughout the process.");

        // Get enough sleep
        System.out.println("I will make sure I am getting enough sleep each night.");

        // Avoid junk food
        System.out.println("I will avoid junk food and stay away from sugary drinks.");

        // Track calories
        System.out.println("I will track my calories and macro nutrients to make sure I'm meeting my goal.");

        // Take vitamins
        System.out.println("I will take vitamins and supplements to ensure my body is getting the right amount of nutrients.");

        // Look for nutritional information
        System.out.println("I will look for nutritional information when selecting food items.");

        // Talk to a dietician
        System.out.println("I will talk to a dietician to ensure I'm getting the right advice.");

        // Eat smaller meals throughout the day
        System.out.println("I will eat smaller meals throughout the day instead of one huge meal.");

        // Eat breakfast
        System.out.println("I will make sure I eat breakfast every day and make it a nutritious one.");

        // Cut out processed foods
        System.out.println("I will cut out processed foods and replace them with whole foods, such as fruits and vegetables.");

        // Cut out soda
        System.out.println("I will cut out soda and replace it with water and other healthy alternatives.");

        // Eat mindfully
        System.out.println("I will practice mindful eating and pay attention to my body's signals.");

        // Get support
        System.out.println("I will seek out support from family and friends to help keep me motivated.");

        // Get enough exercise
        System.out.println("I will get enough exercise to keep my body active and help maintain a healthy weight.");

        // Enjoy the process
        System.out.println("I will enjoy the process and take the time to celebrate my successes.");
    }

}