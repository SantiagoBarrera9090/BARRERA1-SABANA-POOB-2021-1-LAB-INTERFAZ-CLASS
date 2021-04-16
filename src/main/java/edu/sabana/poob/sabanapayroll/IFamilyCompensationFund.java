package edu.sabana.poob.sabanapayroll;

import java.util.UUID;

/**
 * Abstracción para los fondos de compensación familiar.
 */
public interface IFamilyCompensationFund {

    /**
     * Registra un empleado dentro de una caja de compensación.
     *
     * @param employee
     * @return false - si no pudo registrar al empleado, de otro modo, true.
     */
    boolean registerEmployee(Employee employee);

    /**
     * Elimina a un empleado de la caja de compensación
     *
     * @param employee
     * @return false- si no pudo eliminar al empleado, de otro modo, true.
     */
    boolean deleteEmployee(UUID id);

    /**
     * Indica si el empleado esta o no registrado en la caja de compensación.
     *
     * @param employee
     * @return true - si el empleado existe, false de otro modo.
     */
    boolean isEmployeeRegistered(UUID id);

    /**
     * Imprime los beneficios de la caja de compensación.
     *
     * @return
     */
    String printBenefits();

}
