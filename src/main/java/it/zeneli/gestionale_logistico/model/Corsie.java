package it.zeneli.gestionale_logistico.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity(name = "corsie")
public class Corsie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Integer numero;

    @ManyToOne
    @JoinColumn(name = "magazzino_id")
    private Magazzino magazzino;

    @ManyToMany
    @JoinTable(name = "corsia_colonna_pari", joinColumns = @JoinColumn(name = "corsia_id"), inverseJoinColumns = @JoinColumn(name = "colonna_pari_id"))
    private List<ColonnePari> colonnePari = new ArrayList();

    @ManyToMany
    @JoinTable(name = "corsia_colonna_dispari", joinColumns = @JoinColumn(name = "corsia_id"), inverseJoinColumns = @JoinColumn(name = "colonna_dispari_id"))
    private List<ColonneDispari> colonneDispari = new ArrayList();

    public Magazzino getMagazzino() {
        return magazzino;
    }

    public void setMagazzino(Magazzino magazzino) {
        this.magazzino = magazzino;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public List<ColonnePari> getColonnePari() {
        return colonnePari;
    }

    public void setColonnePari(List<ColonnePari> colonnePari) {
        this.colonnePari = colonnePari;
    }

    public List<ColonneDispari> getColonneDispari() {
        return colonneDispari;
    }

    public void setColonneDispari(List<ColonneDispari> colonneDispari) {
        this.colonneDispari = colonneDispari;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Corsie corsie = (Corsie) o;
        return Objects.equals(id, corsie.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
