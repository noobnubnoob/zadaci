package abctech.interview.tasks.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.sql.Date;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="racun")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="racun_id")
    private Integer racunId;

    @Column(name="iban")
    @NotNull(message="is required")
    @Pattern(regexp = "^[A-Z]{2}\\d+$", message = "IBAN format")
    private String iban;

    @Column(name="tip_racuna")
    @Pattern(regexp = "^[0-9]{5}", message = "Must be a number")
    private Integer tipRacuna;

    @Column(name="valuta")
    @Pattern(regexp = "^[A-Z]{5}", message = "Must be 3 letter currency value")
    private String valuta;

    @Column(name="klijent_id")
    private Integer klijentId;

    @Column(name="datum_otvaranja")
    @NotNull(message="is required")
    private Date datumOtvaranja;

    @Column(name="datum_zatvaranja")
    private LocalDate datumZatvaranja;

    public Integer getRacunId() {
        return racunId;
    }

    public void setRacunId(Integer racunId) {
        this.racunId = racunId;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public Integer getTipRacuna() {
        return tipRacuna;
    }

    public void setTipRacuna(Integer tipRacuna) {
        this.tipRacuna = tipRacuna;
    }

    public String getValuta() {
        return valuta;
    }

    public void setValuta(String valuta) {
        this.valuta = valuta;
    }

    public Integer getKlijentId() {
        return klijentId;
    }

    public void setKlijentId(Integer klijentId) {
        this.klijentId = klijentId;
    }

    public Date getDatumOtvaranja() {
        return datumOtvaranja;
    }

    public void setDatumOtvaranja(Date datumOtvaranja) {
        this.datumOtvaranja = datumOtvaranja;
    }

    public LocalDate getDatumZatvaranja() {
        return datumZatvaranja;
    }

    public void setDatumZatvaranja(LocalDate datumZatvaranja) {
        this.datumZatvaranja = datumZatvaranja;
    }

    public void setDatumZatvaranja(Date datumZatvaranja) {
        this.datumZatvaranja = datumZatvaranja.toLocalDate();
    }
}
