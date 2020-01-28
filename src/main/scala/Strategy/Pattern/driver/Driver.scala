package Strategy.Pattern.driver

import Strategy.Pattern.duck.{grandDuck, rubberDuck}

object Driver {
  def main(args: Array[String]): Unit ={
    val grandDuck1 = new grandDuck()
    val rubberDuck1 = new rubberDuck()
    println(grandDuck1.flyBehaviour.fly, grandDuck1.quackBehaviour.quack)
    println(rubberDuck1.flyBehaviour.fly, rubberDuck1.quackBehaviour.quack)
  }
}
