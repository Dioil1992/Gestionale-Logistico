package it.zeneli.gestionale_logistico;

import it.zeneli.gestionale_logistico.model.ColonneDispari;
import it.zeneli.gestionale_logistico.model.ColonnePari;
import it.zeneli.gestionale_logistico.model.Corsie;
import it.zeneli.gestionale_logistico.model.Magazzino;
import net.datafaker.Faker;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class MainMagazzino {
    public static void main(String[]args){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("DefaultPersistenceUnit");
        EntityManager entityManager = factory.createEntityManager();

        entityManager.getTransaction().begin();

        Magazzino magazzino = new Magazzino();
        magazzino.setNome("Magazzino Prova");

        Faker faker = new Faker();



        for(int i = 1; i < 10; i++){
            Corsie corsie = new Corsie();
            corsie.setNumero(i);
            corsie.setMagazzino(magazzino);
            entityManager.persist(corsie);

            for(int x = 1; x < 100; x++){
                ColonneDispari colonnedispari = new ColonneDispari();
                ColonnePari colonnePari = new ColonnePari();
                if(x % 2 == 0){
                    colonnePari.setNumero(x);
                    entityManager.persist(colonnePari);
                    corsie.getColonnePari().add(colonnePari);
                }
                else {
                    colonnedispari.setNumero(x);
                    entityManager.persist(colonnedispari);
                    corsie.getColonneDispari().add(colonnedispari);

                }


            }
            magazzino.getCorsie().add(corsie);
        }

        entityManager.persist(magazzino);

        entityManager.getTransaction().commit();

        entityManager.close();
        factory.close();

    }

}

