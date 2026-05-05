package com.miempresa.app;

/**
 * Clase que encapsula la información de un empleado.
 * Esta refactorización mejora la cohesión del diseño.
 * 
 * @author irenemacarro
 * @version 1.0
 */
public class Employee {
    private String name;
    private int years;

    /**
     * Constructor para crear un nuevo empleado.
     * @param name Nombre del empleado.
     * @param years Años de antigüedad en la empresa.
     */
    public Employee(String name, int years) {
        this.name = name;
        this.years = years;
    }

    // Métodos Getter para acceder a los datos
    public String getName() {
        return name;
    }

    public int getYears() {
        return years;
    }
}
