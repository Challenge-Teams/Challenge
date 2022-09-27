package com.ciclo.ciclo.Models;

import java.util.Date;
import java.util.List;

public class Empleado {

    //Atributos
    private long idEmpleado;
    private String nombreEmpleado;
    private String telefonoEmpleado;
    private String emailEmpleado;

    private List<Roles> rolesEmpleado;
    private List<Transaccion> transaccionEmpleado;
    private Empresa empresaEmpleado;
    private Date updateAtEmpleado;
    private Date createAtEmpleado;

    //Constructor Vacío

    public Empleado() {

    }

    //Constructor

    public Empleado(long idEmpleado, String nombreEmpleado, String telefonoEmpleado, String emailEmpleado, Date updateAtEmpleado, Date createAtEmpleado) {
        this.idEmpleado = idEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.telefonoEmpleado = telefonoEmpleado;
        this.emailEmpleado = emailEmpleado;
        this.updateAtEmpleado = updateAtEmpleado;
        this.createAtEmpleado = createAtEmpleado;
    }

    //Setter y Getter

    public long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getTelefonoEmpleado() {
        return telefonoEmpleado;
    }

    public void setTelefonoEmpleado(String telefonoEmpleado) {
        this.telefonoEmpleado = telefonoEmpleado;
    }

    public String getEmailEmpleado() {
        return emailEmpleado;
    }

    public void setEmailEmpleado(String emailEmpleado) {
        this.emailEmpleado = emailEmpleado;
    }

    public List<Roles> getRolesEmpleado() {
        return rolesEmpleado;
    }

    public void setRolesEmpleado(List<Roles> rolesEmpleado) {
        this.rolesEmpleado = rolesEmpleado;
    }

    public List<Transaccion> getTransaccionEmpleado() {
        return transaccionEmpleado;
    }

    public void setTransaccionEmpleado(List<Transaccion> transaccionEmpleado) {
        this.transaccionEmpleado = transaccionEmpleado;
    }

    public Empresa getEmpresaEmpleado() {
        return empresaEmpleado;
    }

    public void setEmpresaEmpleado(Empresa empresaEmpleado) {
        this.empresaEmpleado = empresaEmpleado;
    }

    public Date getUpdateAtEmpleado() {
        return updateAtEmpleado;
    }

    public void setUpdateAtEmpleado(Date updateAtEmpleado) {
        this.updateAtEmpleado = updateAtEmpleado;
    }

    public Date getCreateAtEmpleado() {
        return createAtEmpleado;
    }

    public void setCreateAtEmpleado(Date createAtEmpleado) {
        this.createAtEmpleado = createAtEmpleado;
    }
}
