package it.zeneli.gestionale_logistico.model;

import javax.persistence.*;
import java.util.Objects;

@Entity(name = "clienti")
public class Clienti {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String cognome;

    @Column(nullable = false)
    private String partiva_iva;

    @Column(nullable = false)
    private String indirizzo;

    @Column(nullable = false)
    private Long numero_telefono;

    @OneToOne
    @JoinColumn(name = "id_commerciale")
    private Commerciale referente;

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

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getPartiva_iva() {
        return partiva_iva;
    }

    public void setPartiva_iva(String partiva_iva) {
        this.partiva_iva = partiva_iva;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public Long getNumero_telefono() {
        return numero_telefono;
    }

    public void setNumero_telefono(Long numero_telefono) {
        this.numero_telefono = numero_telefono;
    }

    public Commerciale getReferente() {
        return referente;
    }

    public void setReferente(Commerciale referente) {
        this.referente = referente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clienti clienti = (Clienti) o;
        return Objects.equals(id, clienti.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
