package com.knoldus.request
import com.knoldus.models.Company
import com.knoldus.validator.CompanyValidator
import org.mockito.MockitoSugar.{mock, when}
import org.scalatest.flatspec.AnyFlatSpec

class CompanyImplUnitTest extends AnyFlatSpec {
  val mockedCompanyValidator: CompanyValidator = mock[CompanyValidator]
  val knoldusCompany: Company = Company("Knoldus", "knoldus@gmail.com", "Noida")

  "Company" should "be created" in {
    val companyImpl = new CompanyImpl(mockedCompanyValidator)

    when(mockedCompanyValidator.companyIsValid(knoldusCompany)) thenReturn true
    val result = companyImpl.createCompany(knoldusCompany)
    assert(!result.isEmpty)
  }

  "Company" should "not be created" in {
    val companyImpl = new CompanyImpl(mockedCompanyValidator)

    when(mockedCompanyValidator.companyIsValid(knoldusCompany)) thenReturn false
    val result = companyImpl.createCompany(knoldusCompany)
    assert(result.isEmpty)
  }
}