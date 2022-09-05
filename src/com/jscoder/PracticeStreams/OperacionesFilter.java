package com.jscoder.PracticeStreams;

import com.jscoder.PracticeStreams.models.Empleado;

import java.util.List;

public class OperacionesFilter {
    public static void main(String[] args) {
        List<Empleado> empleados = Empleado.enpmeados();
        empleados.stream()
                .filter(e ->e.esHombres())
                .forEach(empleado->System.out.println(empleado.getName()));
        System.out.println(" el valor cambia= ");

        empleados.stream()
                .filter(Empleado::esMujer)
                .filter(em-> em.getName().startsWith("a"))
                .forEach(emp -> System.out.println(emp.getName()));


        System.out.println(" doble condicioon ");

        empleados.stream()
                .filter(Emple ->Emple.esHombres() && Emple.getIndresos()>20)
                .forEach(emp-> System.out.println(emp.getName()));



    }
}
