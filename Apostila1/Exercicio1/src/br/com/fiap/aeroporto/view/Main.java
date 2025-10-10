package br.com.fiap.aeroporto.view;

import br.com.fiap.aeroporto.model.Aviao;
import br.com.fiap.aeroporto.model.Piloto;
import br.com.fiap.aeroporto.model.Voo;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Seja BEM VINDE ao Sistema do Aeroporto de BAGULHOS ===");

        Aviao queda = new Aviao("Boeing 777", "Malasya Airlines", 2002, false);
        Piloto doido = new Piloto("Zaharie Ahmad Shah", 53, "25/07/1999");
        Voo voo = new Voo("370MH", "17/07/2014", "Thailand", "China", 4, doido, queda);

        voo.exibirInfo();
    }
}