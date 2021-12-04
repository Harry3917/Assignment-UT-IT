package com.knoldus.calculations

import org.scalatest.flatspec.AnyFlatSpec

class PalindromeAndFactorialTest extends AnyFlatSpec {

  //test cases for palindrome
  "A number" should "not be palindrome" in {
    val obj = new PalindromeFactorial()
    assert(!obj.isPalindrome(8126))
   }

  "A number" should "be palindrome" in {
    val obj = new PalindromeFactorial()
    assert(obj.isPalindrome(6556))
  }

  "A number" should "be palindrome as 0 is palindrome" in {
    val obj = new PalindromeFactorial()
    assert(obj.isPalindrome(0))
  }

  "A number" should "not be palindrome as it is negative" in {
    val obj = new PalindromeFactorial()
    assert(!obj.isPalindrome(-277987))
  }

  //test cases for factorial
  "A condition" should "be valid as 3 will return 6" in {
    val obj = new PalindromeFactorial()
    assert(6==obj.isFactorial(3))
  }

    "A condition" should "be invalid as 5 will return 120" in {
    val obj = new PalindromeFactorial()
    assert(!(121==obj.isFactorial(5)))
  }

  "A condition" should "be valid as 0 will return 1" in {
    val obj = new PalindromeFactorial()
    assert(1==obj.isFactorial(0))
  }
}
