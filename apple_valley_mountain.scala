import scala.math.sqrt

//Generate random numbers for generating different health outcomes
def generateRandomNum(): Float =  {
    val r = scala.util.Random
    return r.nextFloat()
} 

//Create a new HealthProfile to represent a person's health
case class HealthProfile (height: Float, weight: Float, age: Float)

//Calculate BMI given a person's height and weight
def calculateBMI( HealthProfile : HealthProfile ) = {
    val bmi = (HealthProfile.weight) / sqrt( HealthProfile.height * HealthProfile.height ) 
    return bmi 
}

//Calculate BMI given a person's age, height, and weight
def calculateAthleteBMI( HealthProfile: HealthProfile ) = {
    val athleteBMI =  ( HealthProfile.weight ) / ( sqrt ( HealthProfile.height* HealthProfile.height * ( HealthProfile.age / 100 ) ) ) 
    return athleteBMI 
}

//Calculate the heart rate given a person's age 
def calculateMaxHeartRate(HealthProfile: HealthProfile) = {
    val heartRate = 220 - HealthProfile.age
    return heartRate
}

//Calculate optimal heart rate given a person's max heart rate
def calculateOptimalHeartRate( HealthProfile: HealthProfile ) = {
    val optimalHeartRate = (calculateMaxHeartRate(HealthProfile)*0.7).toInt
    return optimalHeartRate
}

//Create a new fitness plan given a person's health profile
def createFitnessPlan( HealthProfile: HealthProfile ) = {
    val bmi = calculateBMI(HealthProfile) 
    val athleteBMI = calculateAthleteBMI(HealthProfile)
    val maxHeartRate = calculateMaxHeartRate(HealthProfile)
    val optimalHeartRate = calculateOptimalHeartRate(HealthProfile)
    
    //If BMI is too high, recommend diet and exercise
    if ( bmi >= 25 ) {
        println(" We recommend following a balanced diet and regular exercise to improve your health profile.")
    }
    //If BMI is above average, recommend healthy eating
    else if ( bmi > 18.5 ) {
        println(" We recommend following a healthy eating plan to maintain your health.") 
    }
    //If BMI is below average, recommend eating more
    else {
        println(" We recommend increasing your caloric intake and eating a balanced diet to bring your weight into a healthy range.")
    }
    
    //If athlete BMI is too high, recommend diet and exercise 
    if ( athleteBMI >= 25 ) {
        println(" We recommend following a balanced diet and regular exercise to improve your health profile.")
    }
    //If athlete BMI is above average, recommend healthy eating
    else if ( athleteBMI > 18.5 ) {
        println(" We recommend following a healthy eating plan to maintain optimum performance.") 
    }
    //If athlete BMI is below average, recommend eating more
    else {
        println(" We recommend increasing your caloric intake and eating a balanced diet to bring your weight into a healthy range.")
    }
    
    //If max heart rate is above average, recommend regular exercise 
    if (maxHeartRate > 150) {
        println("We recommend regular exercise to improve your cardiovascular health.")
    } 
    //If max heart rate is below average, recommend walking 
    else {
        println("We recommend taking walks to improve your cardiovascular health.")
    }
    
    //If optimal heart rate is above average, recommend high intensity exercise
    if (optimalHeartRate > 120) {
        println("We recommend high intensity exercise to reach your peak performance.")
    } 
    //If optimal heart rate is below average, recommend moderate intensity exercise
    else {
        println("We recommend moderate intensity exercise to reach your peak performance.")
    }
} 

//Create a random health profile 
val h = HealthProfile(generateRandomNum(), generateRandomNum(), generateRandomNum())

//Generate a fitness plan
createFitnessPlan(h)