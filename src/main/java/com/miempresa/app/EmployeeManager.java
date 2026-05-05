package com.miempresa.app;

import java.util.ArrayList;
import java.util.List;

/**
 * Gestor para la administración de la plantilla de empleados.
 * Permite añadir empleados a una lista dinámica y visualizar el listado completo.
 * 
 * @author irenemacarro
 */
public class EmployeeManager {
    private List<Employee> employees = new ArrayList<>();

    /**
     * Registra un nuevo empleado en el sistema.
     * @param name El nombre del empleado a añadir.
     * @param years Los años que el empleado lleva en la compañía.
     */
    public void addEmployee(String name, int years) {
        employees.add(new Employee(name, years));
    }

    /**
     * Imprime por consola la relación de todos los empleados registrados.
     * Utiliza un bucle for-each para recorrer la colección interna.
     */
    public void printEmployees() {
        for (Employee emp : employees) {
            System.out.println(emp.getName() + ", Years: " + emp.getYears());
        }
    }
}