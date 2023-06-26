<?php
//Building Better Health – 2000 Lines of PHP Code

//Part 1 - Global Variables
$height = 0;
$weight = 0;
$age = 0;
$gender = '';
$bloodType = '';
 
//Part 2 - Functions
function calculateBMI($height, $weight){
  return ($weight/($height * $height)) * 703;
}

function calculateIdealWeight($height){
  if($height > 60){
    return (50 +((($height - 60) * 2.3))/2.2);
  } else{
    return 50;
  }
}

function calculateCalorieNeeds($height, $weight, $age, $gender){
  if($gender == 'Male'){
    return 66 + (6.2 * $weight) + (12.7 * $height) - (6.76 * $age);
  } else if($gender == 'Female'){
    return 655 + (4.35 * $weight) + (4.7 * $height) - (4.7 * $age);
  }
}

function calculateWaterNeeds($weight){
  return ($weight * 0.5)/8;
}

function bloodTypeDiet($bloodType){
  switch ($bloodType){
    case 'A':
      return 'Fruits & Vegetables, Whole Grains, Legumes, Nuts and Seeds, Fish, Dairy Products, Seafood';
      break;
    case 'B':
      return 'Fruits & Vegetables, Whole Grains, Legumes, Nuts and Seeds, Fish, Dairy Products, Seafood, Eggs';
      break;
    case 'AB':
      return 'Fruits & Vegetables, Whole Grains, Legumes, Nuts and Seeds, Fish, Dairy Products, Seafood, Eggs, Organic Meat';
      break;
    case 'O':
      return 'High-Protein Foods, Fruits & Vegetables, Whole Grains, Legumes, Nuts and Seeds, Seafood';
      break;
    default:
      return 'Fruits & Vegetables, Whole Grains, Legumes, Nuts and Seeds, Fish';
      break;
  }
}

function getExerciseRegime($weight, $age){
  if($age <= 18){
    return 'Children under 18 should get 60 minutes of moderate to intense exercise daily.';
  } else if($weight >= 200){
    return 'Individuals over 200 lbs should engage in high-intensity activities such as running, sports or interval training.';
  } else {
    return 'Individuals of average weight should engage in 30 minutes of moderate-intensity physical activity on most days.';
  }
}

function bodyFat($weight, $height){
  return (4.15 * $weight / ($height * $height));
}

//Part 3 - Calculations
$height = 68;
$weight = 155;
$age = 34;
$gender = 'Male';
$bloodType = 'B';

$BMI = calculateBMI($height, $weight);
$idealWeight = calculateIdealWeight($height);
$calorieNeeds = calculateCalorieNeeds($height, $weight, $age, $gender);
$waterNeeds = calculateWaterNeeds($weight);
$bloodTypeDiet = bloodTypeDiet($bloodType);
$exerciseRegime = getExerciseRegime($weight, $age);
$bodyFat = bodyFat($weight, $height);

//Part 4 - Output
echo "BMI: ".$BMI."\n";
echo "Ideal Weight: ".$idealWeight."\n";
echo "Daily Calorie Needs: ".$calorieNeeds."\n";
echo "Daily Water Needs: ".$waterNeeds."\n";
echo "Blood Type Diet: ".$bloodTypeDiet."\n";
echo "Exercise Regime: ".$exerciseRegime."\n";
echo "Body Fat Percentage: ".$bodyFat."\n";

?>