package com.ciclo.ciclo.Models;

import javax.xml.crypto.Data;
import java.util.Date;

public class Transaccion {

    //Atributos
    private Long idTransaccion;
    private String conceptoTransaccion;
    private float montoTransaccion;
    private Empresa empresaTransaccion;
    private Empleado empleadoTransaccion;
    private Date createAtTransaccion;
    private Date updateAtTransaccion;

    //Constructor vacío

    public Transaccion() {

    }

    //Constructor

    public Transaccion(Long idTransaccion, String conceptoTransaccion, float montoTransaccion, Date createAtTransaccion, Date updateAtTransaccion) {
        this.idTransaccion = idTransaccion;
        this.conceptoTransaccion = conceptoTransaccion;
        this.montoTransaccion = montoTransaccion;
        this.createAtTransaccion = createAtTransaccion;
        this.updateAtTransaccion = updateAtTransaccion;
    }


    //Getter y Setter


    public Long getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(Long idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public String getConceptoTransaccion() {
        return conceptoTransaccion;
    }

    public void setConceptoTransaccion(String conceptoTransaccion) {
        this.conceptoTransaccion = conceptoTransaccion;
    }

    public float getMontoTransaccion() {
        return montoTransaccion;
    }

    public void setMontoTransaccion(float montoTransaccion) {
        this.montoTransaccion = montoTransaccion;
    }

    public Empresa getEmpresaTransaccion() {
        return empresaTransaccion;
    }

    public void setEmpresaTransaccion(Empresa empresaTransaccion) {
        this.empresaTransaccion = empresaTransaccion;
    }

    public Empleado getEmpleadoTransaccion() {
        return empleadoTransaccion;
    }

    public void setEmpleadoTransaccion(Empleado empleadoTransaccion) {
        this.empleadoTransaccion = empleadoTransaccion;
    }

    public Date getCreateAtTransaccion() {
        return createAtTransaccion;
    }

    public void setCreateAtTransaccion(Date createAtTransaccion) {
        this.createAtTransaccion = createAtTransaccion;
    }

    public Date getUpdateAtTransaccion() {
        return updateAtTransaccion;
    }

    public void setUpdateAtTransaccion(Date updateAtTransaccion) {
        this.updateAtTransaccion = updateAtTransaccion;
    }
}
