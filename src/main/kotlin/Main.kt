import java.math.RoundingMode
import kotlin.math.abs

fun main(args: Array<String>) {
    println("enter dAlpha ")
    val d = readln().toDouble()
    println("how many number you have to test")
    val n = readln().toInt()
    val numbers :MutableList<Double> = MutableList(n){0.0}
    val diff :MutableList<Double> = MutableList(n){0.0}
    for (i in numbers.indices){
        println("enter number")
        numbers[i] = readln().toDouble()
    }
    numbers.sort()
    var i =1
    while (i <= numbers.size){

        diff[i-1] = abs((i.toDouble()/n)-numbers[i-1]).toBigDecimal().setScale(2,RoundingMode.HALF_EVEN).toDouble()
        i++
    }
    println(diff.max())
    if (diff.max() < d){
        println("the hypothesis not rejected")
    }else{
        println("the hypothesis is rejected.")
    }
}