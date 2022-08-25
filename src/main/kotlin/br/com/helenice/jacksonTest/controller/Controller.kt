package br.com.helenice.jacksonTest.controller

import br.com.helenice.jacksonTest.client.LoanResponse
import br.com.helenice.jacksonTest.service.LoanService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller(private val loanService: LoanService) {

   @GetMapping("/test")
   fun teste(): ResponseEntity<LoanResponse>{
       val loan = loanService.getLoan()
       return ResponseEntity.ok(loan)
   }

}