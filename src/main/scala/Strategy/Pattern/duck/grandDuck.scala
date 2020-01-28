package Strategy.Pattern.duck

import Strategy.Pattern.fly.{flyTrait, highFly}
import Strategy.Pattern.quack.{quackTrait, sharpQuack}

class grandDuck extends Duck {
  override val flyBehaviour: flyTrait = new highFly()
  override val quackBehaviour: quackTrait = new sharpQuack()
}
