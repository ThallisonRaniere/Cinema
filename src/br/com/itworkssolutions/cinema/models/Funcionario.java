package br.com.itworkssolutions.cinema.models;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ITWorksSolutions
 *
 */
public class Funcionario implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer idFuncionario;
    private String carteiraTrabalho;
    private String nomeFuncionario;
    private Double salarioFuncionario;
    private Date dataAdmissao;

    public Funcionario() {
    }

    public Funcionario(Integer idFuncionario, String carteiraTrabalho, String nomeFuncionario, Double salarioFuncionario, Date dataAdmissao) {
        this.idFuncionario = idFuncionario;
        this.carteiraTrabalho = carteiraTrabalho;
        this.nomeFuncionario = nomeFuncionario;
        this.salarioFuncionario = salarioFuncionario;
        this.dataAdmissao = dataAdmissao;
    }

    public String getCarteiraTrabalho() {
        return carteiraTrabalho;
    }

    public void setCarteiraTrabalho(String carteiraTrabalho) {
        this.carteiraTrabalho = carteiraTrabalho;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public Double getSalarioFuncionario() {
        return salarioFuncionario;
    }

    public void setSalarioFuncionario(Double salarioFuncionario) {
        this.salarioFuncionario = salarioFuncionario;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public Integer getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Integer idFuncionario) {
        this.idFuncionario = idFuncionario;
    }
}
