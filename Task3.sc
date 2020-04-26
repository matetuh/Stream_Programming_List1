//Task_3

import java.lang.NumberFormatException
import java.lang.Integer
object Calc {
  def getDivisor(arg: Int): Int = return {
    var maxDiv = 0
    for(i <- 1 until (arg -1)) {
      if ( arg % i == 0 ){
        maxDiv = i
      }
    }
    return maxDiv
  }
}

object GreatestDivisor {
  def main(args: Array[String]): Unit = {
    for (i <- args) {
      try {
        {
          println(i.toInt + " : " + Calc.getDivisor((i.toInt).abs))
        }
      } catch {
        case e: NumberFormatException => println(i + " : the conversion is not possible")
      }
    }
  }
}

