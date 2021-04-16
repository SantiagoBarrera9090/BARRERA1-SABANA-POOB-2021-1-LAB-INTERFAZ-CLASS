package edu.sabana.poob.sabanapayroll;

import java.util.*;

public class ColsubsidioFund implements IFamilyCompensationFund {

    private static Map<UUID, Employee> registeredEmployees = new HashMap<>();

    public ColsubsidioFund() {
    }

    @Override
    public boolean registerEmployee(Employee employee) {
        boolean instance = employee instanceof EmployeeByCommission;
        boolean respuesta = false;
        if (!instance) {
            respuesta = true;
          //  registeredEmployees.put(employee.getId(), employee);
        }

        return respuesta;
    }

    @Override
    public boolean deleteEmployee(UUID id) {
        boolean respuesta = false;
        if (registeredEmployees.containsKey(id)) {
            registeredEmployees.remove(id);
            respuesta = true;
        }
        return respuesta;
    }

    @Override
    public boolean isEmployeeRegistered(UUID id) {
        boolean respuesta = false;
        if (registeredEmployees.containsKey(id)) {
            respuesta = true;
        }

        return respuesta;
    }

    @Override
    public String printBenefits() {
        return "Buenas practicas";
    }
}