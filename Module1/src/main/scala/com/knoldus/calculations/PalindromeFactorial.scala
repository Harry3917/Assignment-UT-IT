package com.knoldus.calculations

class PalindromeFactorial extends PalindromeFactorialTrait {

  def isPalindrome(num: Int): Boolean = {
    var rem: Int = 0
    var temp: Int = num
    var sum: Int = 0

    while (temp > 0) {
      rem = temp % 10
      sum = (sum * 10) + rem
      temp = temp / 10
    }
    if (num == sum)
      true
    else
      false
  }

  def isFactorial(Number: Int): Int = {
    var fact: Int = 1
    for (i <-2 to Number){
      fact *= i
    }
    fact
  }

}