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
    
    Sala room;
    Filme movie;
    
    private String tipo, dia, idioma, horario, preco;
   
    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
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
    public void cadastroSessao(String tipo, String dia, String horario,String idioma, String preco) {
        Sessao sessao = new Sessao();
        sessao.setTipo(tipo);
        sessao.setDia(dia);
        sessao.setHorario(horario);
        sessao.setIdioma(idioma);
        sessao.setPreco(preco);
    }
}
