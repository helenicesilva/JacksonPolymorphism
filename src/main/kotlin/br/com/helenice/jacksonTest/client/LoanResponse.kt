package br.com.helenice.jacksonTest.client

import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY, property = "instanceOf",
    defaultImpl = BasicLoan::class)
@JsonSubTypes(
    JsonSubTypes.Type(BasicLoan::class, name = "BasicLoan"),
    JsonSubTypes.Type(GroupedLoan::class, name = "CompleteGroupedLoans")
)
sealed class LoanResponse(
    open val id: String,
    open val name: String
    )

    data class BasicLoan(
        override val id: String,
        override val name: String,
        val status: String,
    ): LoanResponse(id, name)

    data class GroupedLoan(
        override val id: String,
        override val name: String,
        val number: String,
    ): LoanResponse(id, name)


