package com.miempresa.app;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase refactorizada para gestionar empleados mediante colecciones dinámicas.
 * Sustituye los arrays fijos por una lista de objetos Employee.
 * 
 * @author irenemacarro
 * @version 1.1
 */
public class EmployeeManager {
    // REFACTORIZACIÓN: Uso de List en lugar de String[] e int[]
    private List<Employee> employees = new ArrayList<>();

    /**
     * Añade un empleado a la lista dinámica.
     * @param name Nombre del empleado.
     * @param years Años en la empresa.
     */
    public void addEmployee(String name, int years) {
        employees.add(new Employee(name, years));
        System.out.println(name + " added to the system.");
    }

    /**
     * Imprime la lista completa de empleados usando un bucle for-each.
     */
    public void printEmployees() {
        System.out.println("List of employees:");
        for (Employee emp : employees) {
            System.out.println(emp.getName() + ", Years in company: " + emp.getYears());
        }
    }

    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        manager.addEmployee("John Doe", 5);
        manager.addEmployee("Jane Smith", 2);
        manager.printEmployees();
    }
}