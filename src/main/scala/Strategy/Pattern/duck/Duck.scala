package Strategy.Pattern.duck

import Strategy.Pattern.fly.flyTrait
import Strategy.Pattern.quack.quackTrait


abstract class Duck {
  val quackBehaviour: quackTrait
  val flyBehaviour: flyTrait



}
