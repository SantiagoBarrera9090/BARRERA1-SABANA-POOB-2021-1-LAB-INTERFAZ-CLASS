package edu.sabana.poob.sabanapayroll;

import java.util.UUID;

public class EmployeeByHours extends Employee {
    private double hours = 0;
    public static final double CONSHORA = 3;
    public EmployeeByHours(String name, String lastName, Department department,double hours) {
        super(name, lastName, department);
        this.hours=hours;
    }
    public EmployeeByHours(String name, String lastName, Department department,double hours,BankAccount account) {
        super(name, lastName, department,account);
        this.hours=hours;
    }
    @Override
    public double calculateSalary()
    {
        return this.hours*CONSHORA;
    }

    @Override
    public String toString() {

        return String.format("%s %s, departamento %s, ", this.name, this.lastName, this.department.getName() )+String.format(" salario %s $, pago por horas", this.calculateSalary());    }
}
