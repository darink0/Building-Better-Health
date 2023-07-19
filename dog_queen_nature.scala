object BuildingBetterHealth {

  // Util class for storing data
  class DataStorage {
    var data: List[(String, Float, Float)] = List()

    def addData(name: String, health: Float, fitness: Float): Unit = {
      data :+= (name, health, fitness)
    }

    def printData(): Unit = {
      data.foreach { d =>
        println(s"Name: ${d._1} | Health: ${d._2} | Fitness: ${d._3}")
      }
    }
  }

  // Util class for calculating health score
  class HealthScoreCalculator {
    def calcHealthScore(health: Float, fitness: Float): Float = {
      health + fitness
    }
  }

  // Util class for formatting data
  class DataFormatter {
    def formatData(name: String, health: Float, fitness: Float): String = {
      s"Name: $name | Health: $health | Fitness: $fitness | Health Score: ${health + fitness}"
    }
  }

  // Controller class
  class HealthDataController(val dataStorage: DataStorage,
                            val healthScoreCalculator: HealthScoreCalculator,
                            val dataFormatter: DataFormatter) {
    def addHealthData(name: String, health: Float, fitness: Float): Unit = {
      dataStorage.addData(name, health, fitness)
    }

    def showStoredData(): Unit = {
      dataStorage.printData()
    }

    def processData(): Unit = {
      dataStorage.data.foreach { d =>
        println(
          dataFormatter.formatData(
            d._1,
            d._2,
            d._3
          )
        )
      }
    }
  }

  // Trait for data processors
  trait DataProcessor {
    def process(data: (String, Float, Float)): Unit
  }

  // Gets the health score of a person
  class HealthScoreProcessor(val healthScoreCalculator: HealthScoreCalculator)
      extends DataProcessor {
    def process(data: (String, Float, Float)): Unit = {
      val (name, health, fitness) = data
      println(s"$name - ${healthScoreCalculator.calcHealthScore(health, fitness)}")
    }
  }

  // Gets the total health score of the stored data
  class TotalHealthScoreProcessor(val healthScoreCalculator: HealthScoreCalculator)
      extends DataProcessor {
    var total: Float = 0.0

    def process(data: (String, Float, Float)): Unit = {
      val (name, health, fitness) = data
      total += healthScoreCalculator.calcHealthScore(health, fitness)
    }

    def printTotalHealthScore(): Unit = {
      println(s"Total Health Score: $total")
    }
  }

  // Main class
  object HealthDataApp {
    def main(args: Array[String]): Unit = {
      val dataStorage = new DataStorage
      val healthScoreCalculator = new HealthScoreCalculator
      val dataFormatter = new DataFormatter
      val healthDataController = new HealthDataController(
        dataStorage,
        healthScoreCalculator,
        dataFormatter
      )

      // Add data
      healthDataController.addHealthData("John", 10.0f, 8.0f)
      healthDataController.addHealthData("Kate", 9.0f, 7.0f)
      healthDataController.addHealthData("Tom", 8.0f, 6.0f)

      // Show stored data
      healthDataController.showStoredData()

      // Process data
      healthDataController.processData()

      // Get health score of a person
      println("Individual Health Score:")
      val healthScoreProcessor =
        new HealthScoreProcessor(healthScoreCalculator)
      dataStorage.data.foreach(healthScoreProcessor.process)

      // Get total health score
      println("Total Health Score:")
      val totalHealthScoreProcessor =
        new TotalHealthScoreProcessor(healthScoreCalculator)
      dataStorage.data.foreach(totalHealthScoreProcessor.process)
      totalHealthScoreProcessor.printTotalHealthScore()
    }
  }

}