package com.ciclo.ciclo.Models;

import java.util.Date;

public class Empresa {

    //Atributos
    private Long idEmpresa;
    private String nombreEmpresa;
    private String NITEmpresa;
    private String telefonoEmpresa;
    private String direccionEmpresa;
    private Date createAtEmpresa;
    private Date updateAtEmpresa;

    //Constructor Vacío

    public Empresa() {

    }

    //Constructor

    public Empresa(Long idEmpresa, String nombreEmpresa, String NITEmpresa, String telefonoEmpresa, String direccionEmpresa, Date createAtEmpresa, Date updateAtEmpresa) {
        this.idEmpresa = idEmpresa;
        this.nombreEmpresa = nombreEmpresa;
        this.NITEmpresa = NITEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.createAtEmpresa = createAtEmpresa;
        this.updateAtEmpresa = updateAtEmpresa;
    }


    //Getter y Setter

    public Long getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Long idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNITEmpresa() {
        return NITEmpresa;
    }

    public void setNITEmpresa(String NITEmpresa) {
        this.NITEmpresa = NITEmpresa;
    }

    public String getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(String telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    public Date getCreateAtEmpresa() {
        return createAtEmpresa;
    }

    public void setCreateAtEmpresa(Date createAtEmpresa) {
        this.createAtEmpresa = createAtEmpresa;
    }

    public Date getUpdateAtEmpresa() {
        return updateAtEmpresa;
    }

    public void setUpdateAtEmpresa(Date updateAtEmpresa) {
        this.updateAtEmpresa = updateAtEmpresa;
    }
}
