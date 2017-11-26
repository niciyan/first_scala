import scala.math._

object Sample1 {
  def main(args: Array[String]): Unit = {
    println("Hello, World")
    println(args.length)
    val u = new User("name", 1)
    User.printUser(u)

    var i = 0
    val randLetters = "ASFDGHJ"
    for (i <- 0 until randLetters.length) {
      println(randLetters(i))
    }

    val aList = List(1,2,4,5)
    for(i <- aList) {
      println(i)
    }

    var evenList = for { i <-1 to 20 } yield i

    for ( i <- 1 to 5; j <- 6 to 10) {
      println("i:" + i)
      println("j:" + j)
    }
  }
}

class User(val name: String, val age: Int)

object User {
  def printUser(user: User) = println(user.name + user.age)
}