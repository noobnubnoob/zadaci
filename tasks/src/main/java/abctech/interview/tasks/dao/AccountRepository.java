package abctech.interview.tasks.dao;

import abctech.interview.tasks.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Integer> {
}
