package com.miempresa.app;

/**
 * Clase Employee con encapsulación aplicada.
 * @author irenemacarro
 */
public class Employee {
    // Propiedades privadas: No se pueden ver ni cambiar directamente desde fuera
    private String name;
    private int years;

    public Employee(String name, int years) {
        this.name = name;
        this.years = years;
    }

    // Métodos públicos (Getters) para leer los datos de forma controlada
    public String getName() {
        return name;
    }

    public int getYears() {
        return years;
    }

    // Métodos públicos (Setters) para modificar los datos si fuera necesario
    public void setName(String name) {
        this.name = name;
    }

    public void setYears(int years) {
        if (years >= 0) { // Ejemplo de control: no pueden ser años negativos
            this.years = years;
        }
    }
}