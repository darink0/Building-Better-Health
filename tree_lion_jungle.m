%This program is created to calculate a person's BMI and advise on ways to improve health 

%Author: John Smith

%Created: November 18, 2020

%Purpose: Provide health advice for an individual 

%Start Code

%Create variables to store user information
height = 0; 
weight = 0;
bmi = 0;

%Prompt user for their height in inches
height = input('Please enter your height in inches: ');

%Prompt user for their weight in pounds
weight = input('Please enter your weight in pounds: ');

%Calculate BMI
bmi = (weight/height^2)*703;

%Print out BMI 
disp(sprintf('Your BMI is %f',bmi));

%Create if-else statement to provide advice based on BMI
if bmi < 18.5
    disp('According to your BMI, you are underweight. Eat more and exercise for better health.');

elseif bmi >= 18.5 && bmi < 25
    disp('Your BMI is in normal range. Keep up with healthy eating and regular physical activity to maintain your health.');

elseif bmi >= 25 && bmi < 30
    disp('Your BMI is in overweight range. Follow a healthy diet and increase physical activity to promote better health.');

elseif bmi >= 30
    disp('Your BMI is in obese range. Eat healthy and exercise regularly for better health.');
end

%Suggest healthy food items
disp('Here is a list of healthy food items to eat: ');

disp('1. Fruits and vegetables');
disp('2. Whole grains');
disp('3. Lean proteins');
disp('4. Low-fat dairy products');
disp('5. Healthy fats');

%Suggest physical activities
disp('Here is a list of physical activities to do: ');

disp('1. Swimming');
disp('2. Hiking');
disp('3. Cycling');
disp('4. Jogging');
disp('5. Weight Training');

%End Code