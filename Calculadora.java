package Calculadoras;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Calculadora {

    protected List(<Double> numeros){
        this.numeros = new ArrayList<>(numeros);
        this.numeros.sort(Collections.reverseOrder());
        System.out.println("Lista ordenada" + this.numeros);
    }

    public double somar() {
        double resultado = 0;
        for (double numero : numeros) {
            resultado += numero;
        }
        return resultado;
    }

}
