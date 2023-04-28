package it.zeneli.gestionale_logistico.model;

import javax.persistence.*;
import java.util.Objects;

@Entity(name = "articolo")
public class Articolo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private Long giacenza;

    @ManyToOne
    @JoinColumn(name = "categoria_id", nullable = false)
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "fornitore_id",nullable = false)
    private Fornitore fornitore;

    @ManyToOne
    @JoinColumn(name = "magazzino_id")
    private Magazzino magazzino;

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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getGiacenza() {
        return giacenza;
    }

    public void setGiacenza(Long giacenza) {
        this.giacenza = giacenza;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Fornitore getFornitore() {
        return fornitore;
    }

    public void setFornitore(Fornitore fornitore) {
        this.fornitore = fornitore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Articolo articolo = (Articolo) o;
        return Objects.equals(id, articolo.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
