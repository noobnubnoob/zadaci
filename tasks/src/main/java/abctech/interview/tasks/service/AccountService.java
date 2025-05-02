package abctech.interview.tasks.service;

import abctech.interview.tasks.entity.Account;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

public interface AccountService {

    List<Account> findAll();

    List<Account> findByDatumZatvaranjaBefore(LocalDate closingDate);

    Account findById(int theId);

    void save(Account theEmployee);

    void deleteById(int theId);
}
