/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemalib;

/**
 *
 * @author amandacarvalho
 */
public class Sala {
    
    private String tiposala, numero, capacidade;

    /**
     * @return the capacidade
     */
    public String getCapacidade() {
        return capacidade;
    }

    /**
     * @param capacidade the capacidade to set
     */
    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }

    /**
     * @return the tiposala
     */
    public String getTipoSala() {
        return tiposala;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipoSala(String tiposala) {
        this.tiposala = tiposala;
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    
}
