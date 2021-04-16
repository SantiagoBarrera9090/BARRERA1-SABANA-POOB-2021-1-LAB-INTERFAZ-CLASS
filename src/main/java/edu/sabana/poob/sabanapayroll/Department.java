package edu.sabana.poob.sabanapayroll;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Department 
{
    
    public UUID id;
    public String name;
    private List<Employee> employees=new ArrayList<>();
    public Department (String name, UUID id)
    {
        this.id = id;
        this.name = name;
    }
    public double calculateSalary()
    {
        double salary = 0;
        for (Employee e : this.employees)
        {
            if (e.department.getId()==this.id)
            {
                salary+=e.calculateSalary();
            }
            
        }
        return salary;
    }
    public UUID getId()
    {
        return this.id;
    }
    public void setEmployees( List<Employee> emplo)
    {
        this.employees=emplo;
    }
    public double findEmployee(UUID id)
    {
        double salary=0;
        for (Employee e : employees)
        {
            if (e.id==id)
            {
                salary=e.calculateSalary();
            }
            
        }
        return salary;
    }
    
    public String findRealEmployee()
    {
        String es = "";
        for (Employee e: this.employees)
        {
            es=es+e.toString()+"\n";
        }
       
       return es;
    }
    public Employee findEmployeeId(UUID employeeId)
    {
        Employee e1 = null;
        for (Employee e:this.employees)
        {
            if (e.id==employeeId)
            {
                e1 = e;
            }

        }
        return e1;
    }
    public String getName() {
        return name;
    }
    public List<Employee> getEmployees()
    {
        return this.employees;
    }
}
