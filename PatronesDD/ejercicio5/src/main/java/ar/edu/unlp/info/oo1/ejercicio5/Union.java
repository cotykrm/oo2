package ar.edu.unlp.info.oo1.ejercicio5;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Union implements Sustancia{

    private List<Sustancia> sustancias;

    public Union(){
        this.sustancias = new LinkedList<>();
    }

    public boolean agregar(Sustancia sustanciaNueva){
        if(sustanciaNueva.esValida()){
            this.sustancias.add(sustanciaNueva);
            return true;
        }
        return false;
    }

    @Override
    public String formula() {
        return this.sustancias.stream()
        .map(sustancia -> sustancia.formula())
        .collect(Collectors.joining());
    }

    @Override
    public int pesoMolecular() {
        return this.sustancias.stream()
        .mapToInt(sustancia -> sustancia.pesoMolecular())
        .sum();
    }

    @Override
    public int carga() {
        return this.sustancias.stream()
        .mapToInt(sustancia -> sustancia.carga())
        .sum();
    }

    @Override
    public boolean esValida() {
        return true;
    }

    public boolean soyMetal(){
        long metales = this.sustancias.stream()
        .filter(sustancia -> sustancia.soyMetal())
        .count();
        return true ? metales<=1 : false;         
    }

    public boolean soyNoMetal(){
        return !this.soyMetal();
    }

}
