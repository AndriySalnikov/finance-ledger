package ua.pp.salnikov.financeledger.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import ua.pp.salnikov.financeledger.constants.Messages;
import ua.pp.salnikov.financeledger.dto.AccountDTO;
import ua.pp.salnikov.financeledger.entity.Account;
import ua.pp.salnikov.financeledger.repository.AccountRepository;
import ua.pp.salnikov.financeledger.service.AccountService;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

  private static final Logger LOGGER = LoggerFactory.getLogger(AccountServiceImpl.class);
  private final AccountRepository accountRepository;

  @Autowired
  public AccountServiceImpl(AccountRepository accountRepository) {
    this.accountRepository = accountRepository;
  }

  @Override
  public List<Account> getAllAccounts() {
    LOGGER.info(Messages.TRY_GET_ALL_ACCOUNTS);
    List<Account> accounts = accountRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
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