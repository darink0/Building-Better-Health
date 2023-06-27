// Building Better Health with Javascript
// By James Smith

//Variables 
var meals = [breakfast, lunch, dinner];
var physicalActivities = [running, walking, biking, swimming];
var waterIntake = 0;

// Functions 
// Calculate and return the total number of ounces of water consumed in a day
function totalOuncesOfWater(ounces) {
	waterIntake += ounces;
	return waterIntake;
}

// Helper Functions 
function prepareMeal(meal) {
	switch(meal){
		case breakfast:
			console.log("Prepare a nutritious breakfast.");
			break;
		case lunch:
			console.log("Prepare a nutritious lunch.");
			break;
		case dinner:
			console.log("Prepare a nutritious dinner.");
			break;
		default: 
			console.log("Invalid meal option specified.");
	}
}

function increaseWaterIntake(ounces) {
	if (ounces > 0){
		totalOuncesOfWater(ounces);
		console.log("You have increased your water intake by " + ounces + " ounces today.");
	}
}

// Main Code
console.log("Good morning! Let's start with a healthy breakfast.");

prepareMeal(breakfast);

console.log("Now let's get moving with some physical activity.");

for (var i = 0; i < physicalActivities.length; i++) {
	console.log("Let's go " + physicalActivities[i] + " today!");
}

console.log("Now that you've gotten some exercise, let's have lunch.");

prepareMeal(lunch);

console.log("Let's finish the day with a healthy dinner.");

prepareMeal(dinner);

console.log("Remember to drink lots of water throughout the day.");

increaseWaterIntake(12);