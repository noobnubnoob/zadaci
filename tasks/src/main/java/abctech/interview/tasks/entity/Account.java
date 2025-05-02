package abctech.interview.tasks.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Entity
@Table(name="racun")
@Data
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="racun_id")
    Integer racunId;
    @Column(name="iban")
    String iban;
    @Column(name="tip_racuna")
    Integer tipRacuna;
    @Column(name="valuta")
    String valuta;
    @Column(name="klijent_id")
    Integer klijentId;
    @Column(name="datum_otvaranja")
    Date datumOtvaranja;
    @Column(name="datum_zatvaranja")
    Date datumZatvaranja;

    // define constructors
    public Account() {

    }

    public Account(String iban, Integer tipRacuna, String valuta, Integer klijentId) {
        this.iban = iban;
        this.tipRacuna = tipRacuna;
        this.valuta = valuta;
        this.klijentId = klijentId;

    }
}
