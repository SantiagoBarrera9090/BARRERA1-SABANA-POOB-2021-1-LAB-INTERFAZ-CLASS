package edu.sabana.poob.sabanapayroll;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SabanaPayrollTest {

    private static Faker faker;
    private static List<Employee> employees;
    private static Department department;
    private static EmployeeBySalary employeeBySalary;
    private static EmployeeByHours employeeByHours;
    private static EmployeeByCommission employeeByCommission;
    private static SabanaPayroll sabanaPayroll;

    @BeforeAll
    public static void setUp() {
        faker = new Faker(new Locale("en-US"));

        department = new Department("Engineering", UUID.randomUUID());

        employeeBySalary = new EmployeeBySalary(faker.name().firstName(), faker.name().lastName(), department, 500);
        employeeByHours = new EmployeeByHours(faker.name().firstName(), faker.name().lastName(), department, 20);
        employeeByCommission = new EmployeeByCommission(faker.name().firstName(), faker.name().lastName(), department, 100);

        employees = new ArrayList<>();
        employees.add(employeeBySalary);
        employees.add(employeeByHours);
        employees.add(employeeByCommission);
    }


    public static SabanaPayroll s1 = new SabanaPayroll();
    public static Department d1 = new Department("FINANZAS", UUID.randomUUID());
    public static Department d2 = new Department("VENTAS", UUID.randomUUID());
    public static Department d3 = new Department("INGENIERIA", UUID.randomUUID());
    public static EmployeeByCommission ec1 = new EmployeeByCommission("Juan", "Perez", d1, 1);
    public static EmployeeByHours eh1 = new EmployeeByHours("Jorge", "Gomez", d2, 5);
    public static EmployeeBySalary es1 = new EmployeeBySalary("Laura", "beltran", d3, 1);
    public List<Department> departments = new ArrayList<>();

    @Test
    @DisplayName("GIVEN the ID of an employee by salary WHEN trying to calculate his salary THEN should calculate it")
    public void shouldCalculateEmployeeSalaryBySalary() {
        assertTrue(Double.compare(0.92, es1.calculateSalary()) == 0);
    }

    @Test
    @DisplayName("GIVEN the ID of an employee by hours WHEN trying to calculate his salary THEN should calculate it")
    public void shouldCalculateEmployeeSalaryByHours() {
        assertTrue(Double.compare(15, eh1.calculateSalary()) == 0);
    }

    @Test
    @DisplayName("GIVEN the ID of an employee by comission WHEN trying to calculate his salary THEN should calculate it")
    public void shouldCalculateEmployeeSalaryByComission() {
        assertEquals(0, Double.compare(2, ec1.calculateSalary()));
    }

    @Test
    @DisplayName("GIVEN the ID of an employee WHEN trying to calculate his salary THEN should calculate it")
    public void shouldCalculateEmployeeSalary() {
        departments.add(d1);
        departments.add(d2);
        departments.add(d3);
        employees.add(ec1);
        employees.add(eh1);
        employees.add(es1);
        s1.setDepartments(departments);
        d1.setEmployees(employees);
        d2.setEmployees(employees);
        d3.setEmployees(employees);

        List<Employee> employees = new ArrayList<>();
        employees.add(ec1);
        employees.add(eh1);
        employees.add(es1);
        assertTrue(Double.compare(2, s1.calculateEmployeeSalary(ec1.getId())) == 0);
        assertTrue(Double.compare(15, s1.calculateEmployeeSalary(eh1.getId())) == 0);
        assertTrue(Double.compare(0.92, s1.calculateEmployeeSalary(es1.getId())) == 0);
    }


    @Test
    @DisplayName("GIVEN a university WHEN trying to calculate his salary THEN should calculate it")
    public void shouldCalculateUniversitytSalary() {

        departments.add(d1);
        departments.add(d2);
        departments.add(d3);
        employees.add(ec1);
        employees.add(eh1);
        employees.add(es1);
        s1.setDepartments(departments);
        d1.setEmployees(employees);
        d2.setEmployees(employees);
        d3.setEmployees(employees);
        assertTrue(Double.compare(17.92, s1.calculateUniversitySalaries()) == 0);

    }

    @Test
    @DisplayName("GIVEN the payrolls of each employee WHEN trying to print it THEN print it")
    public void shouldPrintPayroll() {
        departments.add(d1);
        departments.add(d2);
        departments.add(d3);
        employees.add(ec1);
        employees.add(eh1);
        employees.add(es1);
        s1.setDepartments(departments);
        d1.setEmployees(employees);
        d2.setEmployees(employees);
        d3.setEmployees(employees);
        s1.printPayroll();
    }

    @Test
    public void shouldCalculateEmployeeBalance() {
        SabanaPayroll sa1 = new SabanaPayroll();
        BankAccount b1;
        Checking c1 = new Checking();
        Savings s1 = new Savings();
        Department d1 = new Department("Mc donalds", UUID.randomUUID());
        EmployeeBySalary e1 = new EmployeeBySalary("uribe", "Paraco", d1, 10, c1 = new Checking());
        EmployeeByHours e2 = new EmployeeByHours("Petro", "Guerrillo", d1, 10, s1);
        departments.add(d1);
        employees.add(e1);
        employees.add(e2);
        d1.setEmployees(employees);
        sa1.setDepartments(departments);

        c1.deposit(10000);
        Assertions.assertEquals(5000, sa1.calculateEmployeeBalance(e1.getId()));

        s1.deposit(10000);
        Assertions.assertEquals(8000, sa1.calculateEmployeeBalance(e2.getId()));
    }

    @Test
    public void shouldDepositToEmployee() {
        SabanaPayroll sa1 = new SabanaPayroll();
        BankAccount b1;
        Checking c1 = new Checking();
        Savings s1 = new Savings();
        Department d1 = new Department("Santa fe", UUID.randomUUID());
        EmployeeBySalary e1 = new EmployeeBySalary("Bill", "Gates", d1, 10, c1 = new Checking());
        EmployeeByHours e2 = new EmployeeByHours("Jorge", "Eliecer", d1, 10, s1);
        departments.add(d1);
        employees.add(e1);
        employees.add(e2);
        d1.setEmployees(employees);
        sa1.setDepartments(departments);

        assertTrue(sa1.depositToEmployee(e1.getId(), 6000));
        assertTrue(sa1.depositToEmployee(e2.getId(), 3000));
    }

    @Test
    public void shouldNotDepositToEmployee() {
        SabanaPayroll sa1 = new SabanaPayroll();
        BankAccount b1;
        Checking c1 = new Checking();
        Savings s1 = new Savings();
        Department d1 = new Department("Ferrari", UUID.randomUUID());
        EmployeeBySalary e1 = new EmployeeBySalary("Messi", "rve", d1, 10, c1 = new Checking());
        EmployeeByHours e2 = new EmployeeByHours("El", "Bichocr7", d1, 10, s1);
        departments.add(d1);
        employees.add(e1);
        employees.add(e2);
        d1.setEmployees(employees);
        sa1.setDepartments(departments);

        assertFalse(sa1.depositToEmployee(e1.getId(), 5000));
        assertFalse(sa1.depositToEmployee(e2.getId(), 2000));
    }
    


    @Test
    public void assigneColsubsidioFamilyCompensation() {

        boolean result = sabanaPayroll.assigneFamilyCompensation(ColsubsidioFund.class.getSimpleName(), employeeByCommission.getId());
        assertTrue(result);
    }

    @Test
    public void assigneCompensarFamilyCompensation() {

        boolean result = sabanaPayroll.assigneFamilyCompensation(CompensarFund.class.getSimpleName(), employeeBySalary.getId());

    }
}
