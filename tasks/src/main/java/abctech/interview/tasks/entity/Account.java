package abctech.interview.tasks.entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name="employee")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="racun_id")
    Integer racunId;
    String iban;
    Integer tipRacuna;
    String valuta;
    Integer klijentId;
    Date datumOtvaranja;
    Date datumZatvaranja;
}
