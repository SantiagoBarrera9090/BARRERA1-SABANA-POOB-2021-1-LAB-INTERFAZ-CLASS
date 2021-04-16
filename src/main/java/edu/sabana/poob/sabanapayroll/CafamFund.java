package edu.sabana.poob.sabanapayroll;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CafamFund implements IFamilyCompensationFund {

    private static List<UUID> registeredEmployees = new ArrayList<>() {
    };



    public CafamFund() {

    }

    /**
     * No permite registrar empleados de tipo EmployeeByCommission.
     *
     * @param
     * @return
     */
    @Override
    public boolean registerEmployee(Employee employee) {
        boolean instance = employee instanceof EmployeeByCommission;

        if(!(registeredEmployees.contains(employee.id))&& !(employee.getClass().getSimpleName().equals("EmployeeByHours"))) {
            instance = true;
            registeredEmployees.add(employee.id);

        }
        return instance;
    }
    @Override
    public boolean isEmployeeRegistered(UUID id){
        boolean instance = true;
        if(registeredEmployees.contains(id)){
            registeredEmployees.equals(id);
            instance=true;


        }
        return instance;
    }

    /**
     * Elimina a un empleado de la caja de compensación
     *
     * @param
     * @return false- si no pudo eliminar al empleado, de otro modo, true.
     */

    public boolean deleteEmployee(UUID id) {
        boolean instance = false;
        if(registeredEmployees.contains(id)){
            registeredEmployees.remove(id);
            instance=true;

        }
        return instance;
    }


    @Override
    public String printBenefits() {
        return "PEpa pig";
    }
}
