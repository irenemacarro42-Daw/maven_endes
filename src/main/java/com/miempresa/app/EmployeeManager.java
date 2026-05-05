package com.miempresa.app;

import java.util.ArrayList;
import java.util.List;

/**
 * Gestión de empleados mejorada mediante colecciones dinámicas.
 * @author irenemacarro
 */
public class EmployeeManager {
    // REFACTORIZACIÓN: Se eliminan los arrays String[] e int[] de tamaño 10
    // Ahora usamos una lista de objetos Employee que crece automáticamente
    private List<Employee> employees = new ArrayList<>();

    /**
     * Añade un empleado sin restricción de capacidad máxima.
     * @param name Nombre del empleado
     * @param years Años en la empresa
     */
    public void addEmployee(String name, int years) {
        // Se crea el objeto y se añade a la lista
        employees.add(new Employee(name, years));
        System.out.println(name + " añadido correctamente.");
    }

    /**
     * Imprime los empleados de la lista.
     */
    public void printEmployees() {
        System.out.println("List of employees:");
        // Uso de bucle for-each para mayor claridad
        for (Employee emp : employees) {
            System.out.println(emp.getName() + ", Years: " + emp.getYears());
        }
    }

    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        // Ahora puedes añadir más de 10 empleados si quisieras
        manager.addEmployee("John Doe", 5);
        manager.addEmployee("Jane Smith", 2);
        manager.printEmployees();
    }
}