package abctech.interview.tasks.service;

import abctech.interview.tasks.entity.Account;

import java.sql.Date;
import java.util.List;

public interface AccountService {

    List<Account> findAll();

    List<Account> findByDatumZatvaranjaBefore(Date closingDate);

    Account findById(int theId);

    void save(Account theEmployee);

    void deleteById(int theId);
}
