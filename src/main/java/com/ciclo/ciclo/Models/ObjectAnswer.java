package com.ciclo.ciclo.Models;

public class ObjectAnswer {

    //Atributos
    private Object objeto;
    private String mensaje;

    //Constructor Vacío

    public ObjectAnswer() {

    }

    //Constructor

    public ObjectAnswer(Object objeto, String mensaje) {
        this.objeto = objeto;
        this.mensaje = mensaje;
    }

    //Getter y Setter

    public Object getObjeto() {
        return objeto;
    }

    public void setObjeto(Object objeto) {
        this.objeto = objeto;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
