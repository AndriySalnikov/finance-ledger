package ua.pp.salnikov.financeledger.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.pp.salnikov.financeledger.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

}
