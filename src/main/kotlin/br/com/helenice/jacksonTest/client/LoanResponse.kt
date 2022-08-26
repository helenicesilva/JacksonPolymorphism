package br.com.helenice.jacksonTest.client

import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY, property = "instanceOf",
    defaultImpl = LoanResponse.BasicLoan::class)
@JsonSubTypes(
    JsonSubTypes.Type(LoanResponse.BasicLoan::class, name = "BasicLoan"),
    JsonSubTypes.Type(LoanResponse.GroupedLoan::class, name = "CompleteGroupedLoans")
)
sealed interface LoanResponse {
    val id: String
    val name: String
    data class BasicLoan(
        override val id: String,
        override val name: String,
        val status: String,
    ) : LoanResponse

    data class GroupedLoan(
        override val id: String,
        override val name: String,
        val number: String,
    ) : LoanResponse
}


