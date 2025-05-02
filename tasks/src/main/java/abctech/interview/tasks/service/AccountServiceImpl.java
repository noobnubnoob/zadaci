package abctech.interview.tasks.service;

import abctech.interview.tasks.dao.AccountRepository;
import abctech.interview.tasks.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService{

    private AccountRepository accountRepository;

    @Autowired
    public AccountServiceImpl(AccountRepository theAccountRepository) {
        accountRepository = theAccountRepository;
    }
    @Override
    public List<Account> findAll() {
        System.out.println("FIND ALL");
        return accountRepository.findAll();
    }

    @Override
    public Account findById(int theId) {
        Optional<Account> result =  accountRepository.findById(theId);
        Account theAccount = null;

        if (result.isPresent()) {
            theAccount = result.get();
        }
        else {
            // we didn't find the employee
            throw new RuntimeException("Did not find employee id - " + theId);
        }

        return theAccount;
    }

    @Override
    public void save(Account theAccount) {
        accountRepository.save(theAccount);
    }

    @Override
    public void deleteById(int theId) {
        accountRepository.deleteById(theId);
    }
}
