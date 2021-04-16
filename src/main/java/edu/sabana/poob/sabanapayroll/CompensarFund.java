package edu.sabana.poob.sabanapayroll;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CompensarFund implements IFamilyCompensationFund {

    private static List<UUID> registeredEmployees = new ArrayList<>();

    public CompensarFund() {
    }

    @Override
    public boolean registerEmployee(Employee employee) {
        boolean instance = employee instanceof EmployeeByHours;
        boolean respuesta = false;
        if (!instance) {
            respuesta = true;
//            registeredEmployees.add(employee.getId(), employee);
        }

        return respuesta;
    }

    @Override
    public boolean deleteEmployee(UUID id) {
        boolean respuesta = false;
        if (registeredEmployees.contains(id)) {
            registeredEmployees.remove(id);
            respuesta = true;
        }
        return respuesta;
    }

    @Override
    public boolean isEmployeeRegistered(UUID id) {
        boolean respuesta = false;
        if (registeredEmployees.contains(id)) {
            respuesta = true;
        }
        return respuesta;
    }

    @Override
    public String printBenefits() {
        return "Buena EPS";
    }
}