package ua.pp.salnikov.financeledger.service;

import ua.pp.salnikov.financeledger.dto.AccountDTO;
import ua.pp.salnikov.financeledger.entity.Account;
import java.util.List;

public interface AccountService {

  List<Account> getAllAccounts();
  List<AccountDTO> getAllAccountsDTOs();

}