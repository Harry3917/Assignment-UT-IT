package com.knoldus.validator

import org.scalatest.flatspec.AnyFlatSpec

class PasswordValidatorTest extends AnyFlatSpec {

  //test cases for password validator
  "A password" should "be invalid as it does not contain a digit" in {
    val pass = new PasswordValidator()
    assert(!pass.isPasswordValid("Harshal@"))
  }

  "A password" should "be invalid as contains more than 15 characters" in {
    val pass = new PasswordValidator()
    assert(!pass.isPasswordValid("HarshalDubey@aeiou123"))
  }

  "A password" should "be invalid as it does not contain any lower case character" in {
    val pass = new PasswordValidator()
    assert(!pass.isPasswordValid("HARSHALDUBEY@27"))
  }

  "A password" should "be valid as it has all necessary features" in {
    val pass = new PasswordValidator()
    assert(pass.isPasswordValid("HarshalDubey@27"))
  }

  "A password" should "be invalid as it contains a blank space" in {
    val pass = new PasswordValidator()
    assert(!pass.isPasswordValid("SBT Scala"))
  }

  "A password" should "be invalid as it does not contain any upper case character" in {
    val pass = new PasswordValidator()
    assert(!pass.isPasswordValid("harshaldubey@27"))
  }

  "A password" should "be invalid as it contains less than 8 characters" in {
    val pass = new PasswordValidator()
    assert(!pass.isPasswordValid("Dubey@"))
  }

  "A password" should "be invalid as it does not contain any special character" in {
    val pass = new PasswordValidator()
    assert(!pass.isPasswordValid("Harshal27"))
  }



}