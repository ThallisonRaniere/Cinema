package br.com.itworkssolutions.cinema.models;

import java.io.Serializable;

/**
 * @author ITWorksSolutions
 */
public class Horario implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String Hora;
    private EnumHorario enumHorario;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public EnumHorario getEnumHorario() {
        return enumHorario;
    }

    public void setEnumHorario(EnumHorario enumHorario) {
        this.enumHorario = enumHorario;
    }

}
