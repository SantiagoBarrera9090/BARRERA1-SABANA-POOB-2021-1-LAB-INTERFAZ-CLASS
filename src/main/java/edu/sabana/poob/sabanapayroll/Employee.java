package edu.sabana.poob.sabanapayroll;

import java.util.UUID;

public abstract class Employee
{
    public UUID id;
    public String name;
    public String lastName;
    public Department department;
    private BankAccount account;
    
    public Employee(String name, String lastName, Department department)
    {
        this.name=name;
        this.lastName=lastName;
        this.id=UUID.randomUUID();
        this.department=department;
    }
    public Employee(String name, String lastName, Department department,BankAccount account)
    {
        this.name=name;
        this.lastName=lastName;
        this.id=UUID.randomUUID();
        this.department=department;
        this.account=account;
    }
    @Override
    public abstract String toString();

    public UUID getId()
    {
        return this.id;
    }
    public abstract double calculateSalary();

    public BankAccount getAccount() {
        return account;
    }

}
