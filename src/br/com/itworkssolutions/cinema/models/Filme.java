package br.com.itworkssolutions.cinema.models;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ITWorksSolutions
 *
 */
public class Filme implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String nomePortugues;
    private String nomeEstrangeiro;
    private Diretor diretor;
    private Date anoLancamento;
    private String tipoFilme;
    private String sinopseFilme;
    private String premiacoesFilme;
    private String indicacoesPremiacoesFilme;
    private Integer classificacaoFilme;
    private Boolean filmeCartaz;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomePortugues() {
        return nomePortugues;
    }

    public void setNomePortugues(String nomePortugues) {
        this.nomePortugues = nomePortugues;
    }

    public String getNomeEstrangeiro() {
        return nomeEstrangeiro;
    }

    public void setNomeEstrangeiro(String nomeEstrangeiro) {
        this.nomeEstrangeiro = nomeEstrangeiro;
    }

    public Date getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(Date anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getTipoFilme() {
        return tipoFilme;
    }

    public void setTipoFilme(String tipoFilme) {
        this.tipoFilme = tipoFilme;
    }

    public String getSinopseFilme() {
        return sinopseFilme;
    }

    public void setSinopseFilme(String sinopseFilme) {
        this.sinopseFilme = sinopseFilme;
    }

    public String getPremiacoesFilme() {
        return premiacoesFilme;
    }

    public void setPremiacoesFilme(String premiacoesFilme) {
        this.premiacoesFilme = premiacoesFilme;
    }

    public String getIndicacoesPremiacoesFilme() {
        return indicacoesPremiacoesFilme;
    }

    public void setIndicacoesPremiacoesFilme(String indicacoesPremiacoesFilme) {
        this.indicacoesPremiacoesFilme = indicacoesPremiacoesFilme;
    }

    public Integer getClassificacaoFilme() {
        return classificacaoFilme;
    }

    public void setClassificacaoFilme(Integer classificacaoFilme) {
        this.classificacaoFilme = classificacaoFilme;
    }

    public Boolean getFilmeCartaz() {
        return filmeCartaz;
    }

    public void setFilmeCartaz(Boolean filmeCartaz) {
        this.filmeCartaz = filmeCartaz;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    @Override
    public String toString() {
        return "Filme{" + "id=" + id + ", nomePortugues=" + nomePortugues + ", nomeEstrangeiro=" + nomeEstrangeiro + ", diretor=" + diretor + ", anoLancamento=" + anoLancamento + ", tipoFilme=" + tipoFilme + ", sinopseFilme=" + sinopseFilme + ", premiacoesFilme=" + premiacoesFilme + ", indicacoesPremiacoesFilme=" + indicacoesPremiacoesFilme + ", classificacaoFilme=" + classificacaoFilme + ", filmeCartaz=" + filmeCartaz + '}';
    }



}
