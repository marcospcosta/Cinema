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
public class Ingresso {
    
    Sessao session;
    
    private int quantidade, numeropoltrona;
    private String tipoingresso, fileirapoltrona;

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the numeropoltrona
     */
    public int getNumeropoltrona() {
        return numeropoltrona;
    }

    /**
     * @param numeropoltrona the numeropoltrona to set
     */
    public void setNumeropoltrona(int numeropoltrona) {
        this.numeropoltrona = numeropoltrona;
    }

    /**
     * @return the tipoingresso
     */
    public String getTipoIngresso() {
        return tipoingresso;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipoIngresso(String tipo) {
        this.tipoingresso = tipo;
    }

    /**
     * @return the fileirapoltrona
     */
    public String getFileirapoltrona() {
        return fileirapoltrona;
    }

    /**
     * @param fileirapoltrona the fileirapoltrona to set
     */
    public void setFileirapoltrona(String fileirapoltrona) {
        this.fileirapoltrona = fileirapoltrona;
    }
    
}
