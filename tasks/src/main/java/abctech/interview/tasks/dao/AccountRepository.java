package abctech.interview.tasks.dao;

import abctech.interview.tasks.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Integer> {

    public List<Account> findByDatumZatvaranjaBefore(LocalDate closingDate);
}
