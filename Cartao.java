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
public class Cartao extends Pagamento {
    
     private String bandeira, tipocartao;

    /**
     * @return the bandeira
     */
    public String getBandeira() {
        return bandeira;
    }

    /**
     * @param numero the bandeira to set
     */
    public void setBandeira(String numero) {
        this.bandeira = bandeira;
    }

    /**
     * @return the tipocartao
     */
    public String getTipocartao() {
        return tipocartao;
    }

    /**
     * @param tipocartao the tipocartao to set
     */
    public void setTipocartao(String tipocartao) {
        this.tipocartao = tipocartao;
    }
    
}
