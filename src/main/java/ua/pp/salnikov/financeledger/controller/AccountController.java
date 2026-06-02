package ua.pp.salnikov.financeledger.controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.pp.salnikov.financeledger.constants.Messages;

@RestController
@RequestMapping("/accounts")
public class AccountController {

  private static final Logger LOGGER = LoggerFactory.getLogger(AccountController.class);

  @GetMapping
  public ResponseEntity<List<String>> getAllAccounts() {
    LOGGER.info(Messages.TRY_GET_ALL_ACCOUNTS);
    List<String> accountDTOs = List.of("One", "Two", "Three");
    LOGGER.info(Messages.OK_GET_ALL_ACCOUNTS, accountDTOs);
    return new ResponseEntity<>(accountDTOs, HttpStatus.OK);
  }

}
