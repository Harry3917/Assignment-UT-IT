package com.knoldus.db

import org.scalatest.flatspec.AnyFlatSpec

class CompanyReadDtoTest extends AnyFlatSpec {

  "Company" should "exist" in {
    val companyReadDto = new CompanyReadDto
    val result = companyReadDto.getCompanyByName("Knoldus")
    assert(!result.isEmpty)
  }
  "Company" should "not exist" in {
    val companyReadDto = new CompanyReadDto
    val result = companyReadDto.getCompanyByName("HarshalDubeyInc.")
    assert(result.isEmpty)
  }

}
