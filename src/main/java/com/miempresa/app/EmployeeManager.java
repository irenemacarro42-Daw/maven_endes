/**
 * Imprime la lista completa de empleados.
 * REFACTORIZACIÓN: Se utiliza un bucle for-each para mejorar la legibilidad
 * y evitar el manejo manual de índices.
 */
public void printEmployees() {
    System.out.println("List of employees:");
    
    // Bucle for-each: "Por cada Employee (emp) en la lista (employees)..."
    for (Employee emp : employees) {
        // Accedemos a los datos usando los getters públicos
        System.out.println(emp.getName() + ", Years in company: " + emp.getYears());
    }
}