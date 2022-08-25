package br.com.helenice.jacksonTest.client

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod


@FeignClient( name = "Loan", url = "http://localhost:9001")
interface LoanClient {
    @RequestMapping(method = [RequestMethod.GET], value = ["/loans"])
    fun getLoan(): LoanResponse
}