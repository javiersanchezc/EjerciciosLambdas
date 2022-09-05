package com.jscoder.PracticeStreams.models;

import java.util.Arrays;
import java.util.List;

public class Empleado {

    private  Long   id;
    private String  name;
    private Double indresos;
    private int edad;
    private Genero genero;

    public Empleado(Long id, String name, Double indresos, int edad, Genero genero) {
        this.id = id;
        this.name = name;
        this.indresos = indresos;
        this.edad = edad;
        this.genero = genero;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getIndresos() {
        return indresos;
    }

    public void setIndresos(Double indresos) {
        this.indresos = indresos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

public Boolean esHombres() {
        return  this.genero== Genero.HOMBRE;

}
    public Boolean esMujer() {
        return  this.genero== Genero.MUJER;

    }

    public static List<Empleado> enpmeados(){

        Empleado empleado = new Empleado(1L,"javier",23.4,23,Genero.HOMBRE);
        Empleado empleado2 = new Empleado(1L,"alana",23.4,23,Genero.MUJER);
        Empleado empleado3 = new Empleado(1L,"sofia",23.4,23,Genero.MUJER);
        Empleado empleado4 = new Empleado(1L,"viviana",23.4,23,Genero.MUJER);
        Empleado empleado5 = new Empleado(1L,"andrea",23.4,23,Genero.MUJER);
        Empleado empleado6 = new Empleado(1L,"antonio",23.4,23,Genero.HOMBRE);
        Empleado empleado7 = new Empleado(1L,"jared",23.4,23,Genero.HOMBRE);
        Empleado empleado8 = new Empleado(1L,"david",23.4,23,Genero.HOMBRE);
        Empleado empleado9 = new Empleado(1L,"pablo",23.4,23,Genero.HOMBRE);
        Empleado empleado0 = new Empleado(1L,"anita",23.4,23,Genero.MUJER);
        return Arrays.asList(empleado, empleado2, empleado3, empleado4, empleado5, empleado6, empleado7, empleado8, empleado9,empleado0);

    }
}
