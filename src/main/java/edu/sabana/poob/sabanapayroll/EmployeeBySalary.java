package edu.sabana.poob.sabanapayroll;

import java.util.UUID;

public class EmployeeBySalary extends Employee {
    private static final double HEALTH_DISCOUNT = 0.04;
    private static final double SOCIAL_EQUITY_DISCOUNT = 0.04;
    private double salary;
    public EmployeeBySalary(String name, String lastName, Department department,double salary) {
        super(name, lastName, department);
        this.salary = salary;
    }
    public EmployeeBySalary(String name, String lastName, Department department,double salary, BankAccount account) {
        super(name, lastName, department, account);
        this.salary = salary;
    }
    @Override
    public double calculateSalary()
    {
        return this.salary*(1.0-(EmployeeBySalary.HEALTH_DISCOUNT+EmployeeBySalary.SOCIAL_EQUITY_DISCOUNT));
    }

    @Override
    public String toString() {

        return String.format("%s %s, departamento %s, ", this.name, this.lastName, this.department.getName() )+String.format(" salario %s $, pago por salario", this.calculateSalary());
    }
}
