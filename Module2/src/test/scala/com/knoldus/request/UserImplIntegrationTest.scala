package com.knoldus.request

import com.knoldus.db.CompanyReadDto
import com.knoldus.models.User
import com.knoldus.validator.{EmailValidator, UserValidator}
import org.scalatest.flatspec.AnyFlatSpec

class UserImplIntegrationTest extends AnyFlatSpec {

  val companyName = new CompanyReadDto
  val validateEmail = new EmailValidator
  val userValidator = new UserValidator(companyName,validateEmail)

  val userImpl = new UserImpl(userValidator)

  "User" should "not be created as company does not exists in DB" in {
    val ramUser: User = User("Ram","Raj",22,"Google","ram.raju@gmail.com")

    val result = userImpl.createUser(ramUser)
    assert(result.isEmpty)
  }

  "User" should "not be created as email id is not valid" in {
    val balwantUser: User = User("Balwant","Rai",65,"Knoldus","balwant.rai@knoldus")

    val result = userImpl.createUser(balwantUser)
    assert(result.isEmpty)
  }

  "User" should "not be created as company does not exists in DB and email id is not valid" in {
    val tejaUser: User = User("Teja","Gujjar",80,"Microsoft","teja.gujjar@microsoft")

    val result = userImpl.createUser(tejaUser)
    assert(result.isEmpty)
  }

  "User" should "be created" in {
    val harshalUser: User = User("Harshal","Dubey",22,"Knoldus","harshal.dubey@knoldus.com")

    val result = userImpl.createUser(harshalUser)
    assert(!result.isEmpty)
  }

}