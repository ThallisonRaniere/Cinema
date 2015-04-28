package br.com.itworkssolutions.cinema.models;

import java.io.Serializable;

/**
 **@author ITWorksSolutions
 */
public class Diretor implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer iddiretor;
    private String nomeDiretor;


    public String getNomeDiretor() {
        return nomeDiretor;
    }

    public void setNomeDiretor(String nomeDiretor) {
        this.nomeDiretor = nomeDiretor;
    }

    public Integer getIddiretor() {
        return iddiretor;
    }

    public void setIddiretor(Integer iddiretor) {
        this.iddiretor = iddiretor;
    }
}
