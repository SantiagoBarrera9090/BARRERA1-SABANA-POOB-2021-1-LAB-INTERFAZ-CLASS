package edu.sabana.poob.sabanapayroll;

import java.util.*;

public class SabanaPayroll {
    public static String a = "";
    double salary=0;
    private List<Department> departments=new ArrayList<>();
    private double employeeBalance;
    private ColsubsidioFund colsubsidioFund = new ColsubsidioFund();
    private CompensarFund compensarFund = new CompensarFund();
    private CafamFund cafamFund = new CafamFund();


    private Collection<Employee> employees;
    private Map<String, IFamilyCompensationFund> compensationFunds;

    public SabanaPayroll(Collection<Employee> employees) {
        this.employees = employees;
        this.compensationFunds = new HashMap<>();

        this.compensationFunds.put(ColsubsidioFund.class.getSimpleName(), new ColsubsidioFund());
    }

    public SabanaPayroll() {

    }

    /**
     * Calculates the salary of an specific employee
     * @param employeeId
     * @return The employee salary
     */
    public double calculateEmployeeSalary(UUID employeeId)
    {
        double salary = 0;
        for (Department d:this.departments)
        {
            salary=d.findEmployee(employeeId);
        }
        return salary;
    }

    /**
     * Calculates the salary of an specific department
     * @param departmentId
     * @return the department salary
     */
    public double calculateDeparmentSalaries(UUID departmentId)
    {
        double salary = 0;
        for (Department d:this.departments)
        {
            if (d.getId().equals(departmentId))
            {
                salary=d.calculateSalary();
            }
        }
        return salary;
    }

    /**
     * Calculate the whole university salary
     * @return The university salary
     */
    public double calculateUniversitySalaries()
    {

        for (Department d : this.departments)
        {
            salary+=d.calculateSalary();
        }
        return salary;
    }

    /**
     * Prints each employee payroll
     */
    public void printPayroll()
    {

        for (Department d:this.departments)
        {
            a=d.findRealEmployee();
        }
        System.out.println(a);

    }
    public void setDepartments( List<Department> departments )
    {
        this.departments=departments;
    }
    public boolean depositToEmployee(UUID employeeId, double amount)
    {
        boolean result=false;
        for (Department d : this.departments)
        {
            if(employeeId.equals(d.findEmployeeId(employeeId).getId()))
            {
                result=d.findEmployeeId(employeeId).getAccount().deposit(amount);
            }
        }
        return result;
    }
    public double calculateEmployeeBalance(UUID employeeId)
    {
        double result=0;
        for (Department d : this.departments)
        {
            if(employeeId.equals(d.findEmployeeId(employeeId).getId()))
            {
                result=d.findEmployeeId(employeeId).getAccount().getBalance();
            }
        }
        return result;
    }


    public boolean assigneFamilyCompensation(String IFamilyCompensationFund, UUID employeeId)
    {

        boolean resutl = false;
        for (Department d : this.departments)
        {
            for (Employee e: d.getEmployees())
            {
                if (IFamilyCompensationFund.equals("ColsubsidioFund"))
                {
                    colsubsidioFund.registerEmployee(e);
                    resutl=true;
                }
                if (IFamilyCompensationFund.equals("CompensarFund"))
                {
                    compensarFund.registerEmployee(e);
                    resutl=true;
                }
                if (IFamilyCompensationFund.equals("CafamFund"))
                {
                    cafamFund.registerEmployee(e);
                    resutl=true;
                }

            }
        }
        return resutl;

    }
}