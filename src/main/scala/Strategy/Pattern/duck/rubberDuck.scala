package Strategy.Pattern.duck

import Strategy.Pattern.fly.{flyTrait, noFly}
import Strategy.Pattern.quack.{dullQuack, quackTrait}
import Strategy.Pattern.fly.{flyTrait, noFly}
import Strategy.Pattern.quack.{dullQuack, quackTrait}

class rubberDuck extends Duck {
  override val flyBehaviour: flyTrait = new noFly()
  override val quackBehaviour: quackTrait = new dullQuack()
}
