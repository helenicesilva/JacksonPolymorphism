package br.com.helenice.jacksonTest.service

import br.com.helenice.jacksonTest.client.LoanClient
import br.com.helenice.jacksonTest.client.LoanResponse
import org.springframework.stereotype.Service

@Service
class LoanService(
    private val client: LoanClient
) {
    fun getLoan(): LoanResponse {
        val loan = client.getLoan()
        println(loan)
        return loan
    }
}