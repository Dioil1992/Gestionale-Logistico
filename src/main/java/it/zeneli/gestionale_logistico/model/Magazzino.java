package it.zeneli.gestionale_logistico.model;

import javax.persistence.*;
import java.util.Objects;

@Entity(name = "magazzino")
public class Magazzino {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Magazzino magazzino = (Magazzino) o;
        return Objects.equals(id, magazzino.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
