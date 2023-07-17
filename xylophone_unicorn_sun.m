%% "Building Better Health" Program

% This program aims to improve the overall health of users by 
    % providing dietary and exercise recommendations.

%% Set up Global Variables

global age; % user's age
global weight; % user's weight
global height; % user's height
global targetWeight; % user's target weight
global activityLevel; % user's activity level

%% User Input

prompt1 = 'What is your age? ';
age = input(prompt1); % ask user for their age

prompt2 = 'What is your current weight (in kg)? ';
weight = input(prompt2); % ask user for their current weight

prompt3 = 'What is your current height (in cm)? ';
height = input(prompt3); % ask user for their current height

prompt4 = 'What is your target weight (in kg)? ';
targetWeight = input(prompt4); % ask user for their target weight

prompt5 = 'What is your activity level on a scale of 1 to 10? ';
activityLevel = input(prompt5); % ask user for their activity level

%% Calculate daily calorie needs

% Calculate BMR using the Harris-Benedict Equation 
bmrMale = 88.362 + (13.397 * weight) + (4.799 * height) - (5.677 * age); 
bmrFemale = 447.593 + (9.247 * weight) + (3.098 * height) - (4.330 * age);

% Set BMR based on user's gender
if age < 50
    bmr = bmrMale;
else
    bmr = bmrFemale;
end

% Calculate Activity Level Multiplier
levelMultiplier = 1.2 + (activityLevel/10);

% Calculate daily calorie needs
dailyCalories = bmr * levelMultiplier;

%% Calculate Macronutrient Intake

% Define Macronutrients
protein = 0.8 * weight;
fats = 0.3 * weight;
carbs = dailyCalories - (protein * 4) - (fats * 9);

%% Calculate Daily Exercise

% Calculate daily calorie deficit for weight loss
calorieDeficit = dailyCalories - (targetWeight * 3500);

% Calculate daily exercise
dailyExercise = calorieDeficit / 7;

%% Recommending Exercise

% Create array of possible exercises
exercises = ["Walking", "Jogging", "Yoga", "Swimming", "Strength Training", "HIIT"];

% Recommend exercise
[~, exerciseIndex] = min(abs(dailyExercise - [200, 400, 500, 600, 800, 1000]));
exerciseRecommendation = exercises(exerciseIndex);

%% Recommending Diet

% Determine protein sources
proteinFoods = ["Eggs", "Beans", "Cottage Cheese", "Lean Meats"];

% Determine healthy fat sources
fatsFoods = ["Avocado", "Nuts", "Olive Oil", "Fatty Fish"];

% Determine healthy carb sources
carbsFoods = ["Oats", "Fruit", "Whole Grains", "Sweet Potatoes"];

%% Output

% Provide output to user
fprintf("Your daily calorie needs are: %d\n", dailyCalories);
fprintf("Your macronutrient intake is %dg of protein, %dg of fats, and %dg of carbs\n", protein, fats, carbs);
fprintf("Your recommended daily exercise is %s for %d calories\n", exerciseRecommendation, dailyExercise);
fprintf("Healthy protein sources include: %s\n", strjoin(proteinFoods,", "));
fprintf("Healthy fat sources include: %s\n", strjoin(fatsFoods,", "));
fprintf("Healthy carb sources include: %s\n", strjoin(carbsFoods,", "));