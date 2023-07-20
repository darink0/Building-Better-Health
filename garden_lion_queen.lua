--Building Better Health

--define functions
 
local calculateBmi = function(height, weight)
	return round(weight / height ^ 2, 2)
end

local calculateBmr = function(weight, height, age, sex)
	local bmr
	if sex == "m" then
		bmr = 66 + (13.7 * weight) + (5 * height) - (6.8 * age)
	elseif sex == "f" then
		bmr = 665 + (9.6 * weight) + (1.8 * height) - (4.7 * age)
	end
	return bmr
end

local calculateWaistHipRatio = function(waist, hip)
	return round(waist / hip, 2)
end

local calculateBloodPressure = function(systolic, diastolic)
	return systolic .. "/" .. diastolic
end

local getSuitableWeight = function(height, age, sex)
	local suitable weight
	if sex == "m" then
		suitableWeight = (height - 80) * 0.7 + 50;
	elseif sex == "f" then
		suitableWeight = (height - 70) * 0.6 + 50;
	end
	return suitableWeight
end

local calculateIdealBmi = function(height, sex)
	local idealBmi
	if sex == "m" then
		idealBmi = 22;
	elseif sex == "f" then
		idealBmi = 21;
	end
	return idealBmi
end

local calculateIdealWaistHipRatio = function(sex)
	local idealRatio
	if sex == "m" then
		idealRatio = 0.85
	elseif sex == "f" then
		idealRatio = 0.8
	end
	return idealRatio
end
 
--main program
local height = io.read("*n", "Enter your height (in meters): ")
local weight = io.read("*n", "Enter your weight (in kg): ")
local age = io.read("*n", "Enter your age: ")
local sex = io.read("*l", "Enter your gender (m or f): ")
local waist = io.read("*n", "Enter your waist circumference (in cm): ")
local hip = io.read("*n", "Enter your hip circumference (in cm): ")
local systolic = io.read("*n", "Enter your systolic blood pressure (top number): ")
local diastolic = io.read("*n", "Enter your diastolic blood pressure (bottom number): ")

--calculate
local bmi = calculateBmi(height, weight)
local bmr = calculateBmr(weight, height, age, sex)
local waistHipRatio = calculateWaistHipRatio(waist, hip)
local bloodPressure = calculateBloodPressure(systolic, diastolic)
local suitableWeight = getSuitableWeight(height, age, sex)
local idealBmi = calculateIdealBmi(height, sex)
local idealWaistHipRatio = calculateIdealWaistHipRatio(sex)

--display
print("BMI:", bmi)
print("BMR:", bmr)
print("Waist-Hip Ratio:", waistHipRatio)
print("Blood Pressure:", bloodPressure)
print("Your suitable weight is: ", suitableWeight)
print("Your ideal BMI is: ", idealBmi)
print("Your ideal waist-hip ratio is: ", idealWaistHipRatio)

--end