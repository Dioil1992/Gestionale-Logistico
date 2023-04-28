package it.zeneli.gestionale_logistico.model;

import javax.persistence.*;
import java.util.Objects;

@Entity(name = "fornitore")
public class Fornitore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String indirizzo;

    @Column(nullable = false)
    private String partita_iva;

    @Column(nullable = false)
    private Long numero_di_telefono;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getPartita_iva() {
        return partita_iva;
    }

    public void setPartita_iva(String partita_iva) {
        this.partita_iva = partita_iva;
    }

    public Long getNumero_di_telefono() {
        return numero_di_telefono;
    }

    public void setNumero_di_telefono(Long numero_di_telefono) {
        this.numero_di_telefono = numero_di_telefono;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fornitore fornitore = (Fornitore) o;
        return Objects.equals(id, fornitore.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
