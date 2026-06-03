package ua.pp.salnikov.financeledger.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import ua.pp.salnikov.financeledger.constants.Messages;
import ua.pp.salnikov.financeledger.dto.AccountDTO;
import ua.pp.salnikov.financeledger.entity.Account;
import ua.pp.salnikov.financeledger.service.AccountService;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

  private static final Logger LOGGER = LoggerFactory.getLogger(AccountServiceImpl.class);

  @Override
  public List<Account> getAllAccounts() {

    LOGGER.info(Messages.TRY_GET_ALL_ACCOUNTS);

    Account account1 = new Account(1L,"Home", 10000L, "USD");
    Account account2 = new Account(2L,"Work", 25238L, "Hryvna");
    Account account3 = new Account(3L,"Bank", 2520L, "Euro");
    List<Account> accounts = List.of(account1, account2, account3);

    LOGGER.info(Messages.OK_GET_ALL_ACCOUNTS, accounts);

    return accounts;
  }

  public  List<AccountDTO> getAllAccountsDTOs() {
    return getAllAccounts()
        .stream()
        .map(this::mapToDTO)
        .toList();
  }

  private AccountDTO mapToDTO(Account account) {
    return new AccountDTO(
        account.getId().toString(),
        account.getName(),
        String.format("%.2f", account.getBalance() / 100.0),
        account.getCurrency());
  }

}