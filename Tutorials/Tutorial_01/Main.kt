package Tutorials.Tutorial_01

fun main(args: Array<String>) {
//    moduleArray()

//    val circumference = calcCircumference(10.0)
//    println(circumference)


//    var mark = arrayOf(30, 55, 70, 101, -1, 76, 75)
//    var grade = calcGrade(mark)
//    for (i in grade) {
//        println(i)


//    val res = checkPrimeNumbers(5)
//    println(res)


//    list()
}

//1. Create an array that contains the module names, that you’ll learn in this semester.
fun moduleArray() {
    var modules = arrayOf("MAD", "DSA", "ITP", "PnS", "PS", "ESD")

    for (i in 0..(modules.size - 1)) {
        println(modules[i])
    }
}

//2. Write a Kotlin function to calculate the circumference of a circle for a given radius value.
fun calcCircumference(r: Double): Double {
    return 2.0 * (22 / 7.0) * r
}

//3. Write a Kotlin function to calculate the grades of a student for a given mark according to the following criteria.
    //100-75 A
    //74-65 B
    //64-50 C
    //49-35 D
    //34-00 F
fun calcGrade(marks: Array<Int>): Array<Char> {
    val length = marks.size
    val grades = Array<Char>(length) { 'n' }

    for (i in 0 until length) {
        if (marks[i] > 100) {
            grades[i] = 'E'
        } else if (marks[i] < 0) {
            grades[i] = 'E'
        } else if (marks[i] >= 75) {
            grades[i] = 'A'
        } else if (marks[i] >= 65) {
            grades[i] = 'B'
        } else if (marks[i] >= 50) {
            grades[i] = 'C'
        } else if (marks[i] >= 35) {
            grades[i] = 'D'
        } else {
            grades[i] = 'F'
        }
    }
    return grades
}


//4. Write a Kotlin function to determine whether a given integer number is prime.
fun checkPrimeNumbers(num:Int): Boolean {
    var i = 1
    var count = 0
    while (i <= num) {
        if((num % i) == 0) {
            count++
        }

        if(count > 2) {
            break
        }
        i++
    }

    if (count <= 2) {
        return true
    }

    return false
}

//5.  a. Create a mutable list that contains multiplications of 3 from 0 to 100.
//    b. Replace all the even numbers of above list from 999.
fun list() {
    val mult = mutableListOf<Int>()
    var count = 1
    while(count <= 100) {
        if(count % 3 == 0) {
            mult.add(count)
        }
        count++
    }
    println("List is: " + mult)

    val SIZE = mult.size

    for(i in 0 until SIZE) {
        if(mult[i] %2 == 0) {
            mult[i] = 999
        }
    }

    println("Replaced list is: " + mult)
}