package it.zeneli.gestionale_logistico.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "ordine")
public class Ordine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private Clienti cliente;

    @OneToMany
    @JoinTable(name = "ordine_articolo" , joinColumns = @JoinColumn(name = "ordine_id"), inverseJoinColumns = @JoinColumn(name = "articolo_id"))
    private List<Articolo> articoli = new ArrayList<>();

    @Column(name = "quantità", nullable = false)
    private Long quantità;

    @Column(nullable = false)
    private LocalDateTime orario;


}
