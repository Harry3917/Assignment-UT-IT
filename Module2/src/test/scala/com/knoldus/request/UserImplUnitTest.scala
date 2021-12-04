package com.knoldus.request
import com.knoldus.models.User
import com.knoldus.validator.UserValidator
import org.mockito.MockitoSugar.{mock, when}
import org.scalatest.flatspec.AnyFlatSpec

class UserImplUnitTest extends AnyFlatSpec {

  val mockedUserValidator = mock[UserValidator]
  val harshalUser: User = User("Harshal","Dubey",22,"knoldus","harshal.dubey@knoldus.com")

  "User" should "be created" in {
    val userImpl = new UserImpl(mockedUserValidator)

    when(mockedUserValidator.userIsValid(harshalUser)) thenReturn(true)
    val result = userImpl.createUser(harshalUser)
    assert(!result.isEmpty)
  }

  "User" should "not be created" in {
    val userImpl = new UserImpl(mockedUserValidator)

    when(mockedUserValidator.userIsValid(harshalUser)) thenReturn(false)
    val result = userImpl.createUser(harshalUser)
    assert(result.isEmpty)
  }

}