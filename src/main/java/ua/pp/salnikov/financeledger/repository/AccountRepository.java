package ua.pp.salnikov.financeledger.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.pp.salnikov.financeledger.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
