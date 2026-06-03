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
import ua.pp.salnikov.financeledger.dto.AccountDTO;
import ua.pp.salnikov.financeledger.service.AccountService;

@RestController
@RequestMapping("/accounts")
public class AccountController {

  private static final Logger LOGGER = LoggerFactory.getLogger(AccountController.class);

  private final AccountService accountService;

  public AccountController(AccountService accountService) {
    this.accountService = accountService;
  }

  @GetMapping
  public ResponseEntity<List<AccountDTO>> getAllAccounts() {
    LOGGER.info(Messages.TRY_GET_ALL_ACCOUNTS);
    List<AccountDTO> accountDTOs = accountService.getAllAccountsDTOs();
    LOGGER.info(Messages.OK_GET_ALL_ACCOUNTS, accountDTOs);
    return new ResponseEntity<>(accountDTOs, HttpStatus.OK);
  }

}
