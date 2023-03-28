package lesson3;

import lesson3.drugs.Component;
import lesson3.drugs.Drug;
import lesson3.drugs.impl.CAtDrug;
import lesson3.drugs.impl.components.Azitromicin;
import lesson3.drugs.impl.components.Penicillin;
import lesson3.drugs.impl.components.Water;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        List<Component> catComponets = List.of(new Azitromicin("Azitromocin", "500 mg", 4),
                new Water("Water", "3", 2));
        CAtDrug drug = new CAtDrug(catComponets, "Tablets");
        for (Component c: drug             ) {
            System.out.println(c);
        }

        List<Component>componentsCat2 = List.of(new Azitromicin("Azitromicin","250",2),
                new Water("Water", "100", 2),
                new Penicillin("Penicillin", "1mln",1));
        List<Component>componentCat3 = List.of(new Azitromicin("Azitromicin","250",2),
                new Water("Water", "100", 4),
                new Penicillin("Penicillin", "3mln",3));
        CAtDrug drug1 = new CAtDrug(catComponets, "Antibiotic");
        CAtDrug drug2 = new CAtDrug(componentsCat2, "Bravecto");
        CAtDrug drug3 = new CAtDrug(componentCat3, "Syrop");
        CAtDrug drug4 = new CAtDrug(componentCat3, "Liniment");

        List<CAtDrug> drugs = new ArrayList<>();
        drugs.add(drug);
        drugs.add(drug1);
        drugs.add(drug2);
        drugs.add(drug3);
        drugs.add(drug4);


        Collections.sort(drugs);
        System.out.println("Список лекарств");
        for (CAtDrug item: drugs) {
            System.out.println(item);
        }


    }
}
