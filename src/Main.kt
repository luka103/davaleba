//ლექციაზე გაკეთებულ Fraction-ს დამატებული 3 მეთოდი,მეორე ქვემოთაა
//fun main() {
//
//    var f1 = Fraction(2.0, 4.0)
//
//
//    var f2 = Fraction(3.0, 6.0)
//
//
//
//    println(f1 == f2)
//    println(f1.equals(f2))
//    println(f2.toString())
//    println("${f1.calculateSum(f2)}")
//    println("${f1.calculateProduct(f2)}")
//    println("${f1.calculateReduction()}")
//    println("${f2.calculateReduction()}")
//
//
//
//
//    }
//
//
//open class Fraction(private val n: Double, private val d: Double) {
//
//    private var numerator: Double = n
//    private var denominator: Double = d
//
//    fun calculateSum(f2: Fraction): Double {
//        return numerator/denominator + numerator/denominator
//    }
//
//    fun calculateProduct(f2: Fraction): Double {
//        return numerator/denominator * numerator/denominator
//    }
//
//    fun calculateReduction(): Double {
//        return (numerator/numerator) / (denominator/numerator)
//    }
//
//
//
//
//
//    override fun equals(other: Any?): Boolean {
//        if(other is Fraction) {
//            if(numerator*other.denominator/denominator == other.numerator)
//                return true
//        }
//        return false
//    }
//
//    override fun toString(): String {
//        return "$numerator / $denominator"
//    }
//
//
//
//    }


//Point კლასის შექმნის დავალება
//fun main() {
//
//    var c1 = Point(3, 4)
//
//    var c2 = Point(-3, 5)
//
//
//    println(c1)
//    println(c2)
//    println(c1.toString())
//    println(c1.equals(c2))
//    println(c1.calculateSymmetry())
//    println(c2.calculateSymmetry())
//
//
//
//}
//
//
//class Point(private val x: Int, private val y: Int) {
//
//    private var coordinate1stP: Int = x
//    private var coordinate2ndP: Int = y
//
//    fun calculateSymmetry(): Pair<Int, Int> {
//        return Pair(coordinate1stP * -1, coordinate2ndP * -1)
//
//    }
//
//
//
//
//
//
//    override fun toString(): String {
//        return ("$coordinate1stP;$coordinate2ndP")
//    }
//
//    override fun equals(other: Any?): Boolean {
//        if (other is Point) {
//            if(coordinate1stP / other.coordinate1stP == coordinate2ndP / other.coordinate2ndP)
//                return true
//        }
//        return false
//
//    }
//
//
//}

