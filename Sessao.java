package cinemalib;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amandacarvalho
 */
public class Sessao {

 
    
    private String tiposessao, dia, idioma, horario, preco, sala, filme;
    
       /**
     * @return the filme
     */
    public String getFilme() {
        return filme;
    }

    /**
     * @param filme the filme to set
     */
    public void setFilme(String filme) {
        this.filme = filme;
    }
       /**
     * @return the sala
     */
    public String getSala() {
        return sala;
    }

    /**
     * @param sala the sala to set
     */
    public void setSala(String sala) {
        this.sala = sala;
    }
    
    Sala room;
    Filme movie;
   
    /**
     * @return the tipoessao
     */
    public String getTipoSessao() {
        return tiposessao;
    }

    /**
     * @param tiposessao the tiposessao to set
     */
    public void setTipoSessao(String tiposessao) {
        this.tiposessao = tiposessao;
    }

    /**
     * @return the dia
     */
    public String getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(String dia) {
        this.dia = dia;
    }

    /**
     * @return the idioma
     */
    public String getIdioma() {
        return idioma;
    }

    /**
     * @param idioma the idioma to set
     */
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    /**
     * @return the horario
     */
    public String getHorario() {
        return horario;
    }

    /**
     * @param horario the horario to set
     */
    public void setHorario(String horario) {
        this.horario = horario;
    }

    /**
     * @return the preco
     */
    public String getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(String preco) {
        this.preco = preco;
    }
    
    /**
     *
     * @param tipo
     * @param dia
     * @param horario
     * @param idioma
     * @param preco
     */
    public void cadastroSessao(String tipo, String dia, String horario,String idioma, String preco, String sala, String filme) {
        Sessao sessao = new Sessao();
        sessao.setTipoSessao(tipo);
        sessao.setDia(dia);
        sessao.setHorario(horario);
        sessao.setIdioma(idioma);
        sessao.setPreco(preco);
        sessao.setSala(sala);
    }
}