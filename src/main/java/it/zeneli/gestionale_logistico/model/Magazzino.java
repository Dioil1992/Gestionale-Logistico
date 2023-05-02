package it.zeneli.gestionale_logistico.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity(name = "magazzino")
public class Magazzino {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @OneToMany
    @JoinTable(name = "magazzino_corsie", joinColumns = @JoinColumn(name = "magazzino_id"), inverseJoinColumns = @JoinColumn(name = "corsia_id"))
    private List<Corsie> corsie = new ArrayList<>();

    public List<Corsie> getCorsie() {
        return corsie;
    }

    public void setCorsie(List<Corsie> corsie) {
        this.corsie = corsie;
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
