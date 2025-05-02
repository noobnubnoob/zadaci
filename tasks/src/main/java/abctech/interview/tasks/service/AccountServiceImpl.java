package abctech.interview.tasks.service;

import abctech.interview.tasks.entity.Account;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService{
    @Override
    public List<Account> findAll() {
        return null;
    }

    @Override
    public Account findById(int theId) {
        return null;
    }

    @Override
    public void save(Account theEmployee) {

    }

    @Override
    public void deleteById(int theId) {

    }
}
