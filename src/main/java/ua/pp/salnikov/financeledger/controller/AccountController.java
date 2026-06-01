package ua.pp.salnikov.financeledger.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class AccountController {

  @GetMapping
  public ResponseEntity<String> getAllAccounts() {
    return new ResponseEntity<>("Hello from controller!", HttpStatus.OK);
  }

}
