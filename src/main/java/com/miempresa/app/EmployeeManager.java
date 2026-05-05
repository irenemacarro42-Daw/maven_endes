package com.miempresa.app;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    // Propiedad privada: Nadie desde fuera de esta clase puede tocar la lista directamente
    private List<Employee> employees = new ArrayList<>();

    // Método público: La única forma "legal" de añadir un empleado
    public void addEmployee(String name, int years) {
        employees.add(new Employee(name, years));
    }

    // Método público: La forma controlada de ver la información
    public void printEmployees() {
        for (Employee emp : employees) {
            // Accedemos a los datos de Employee mediante sus métodos públicos (getName/getYears)
            System.out.println("Empleado: " + emp.getName() + " | Años: " + emp.getYears());
        }
    }
}