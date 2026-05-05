package com.miempresa.app;

/**
 * Clase que representa a un empleado de la empresa.
 * Almacena información básica como el nombre y los años de experiencia.
 * 
 * @author irenemacarro
 * @version 1.0
 */
public class Employee {
    private String name;
    private int years;

    /**
     * Constructor de la clase Employee.
     * @param name Nombre completo del empleado.
     * @param years Años de antigüedad en la empresa.
     */
    public Employee(String name, int years) {
        this.name = name;
        this.years = years;
    }

    /**
     * Obtiene el nombre del empleado.
     * @return El nombre del empleado.
     */
    public String getName() {
        return name;
    }

    /**
     * Obtiene los años de experiencia del empleado.
     * @return Los años de antigüedad.
     */
    public int getYears() {
        return years;
    }
}