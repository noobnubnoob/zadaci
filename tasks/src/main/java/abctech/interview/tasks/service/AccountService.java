package abctech.interview.tasks.service;

import abctech.interview.tasks.entity.Account;

import java.util.List;

public interface AccountService {

    List<Account> findAll();

    Account findById(int theId);

    void save(Account theEmployee);

    void deleteById(int theId);
}
