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
public class Pagamento {
    
     Ingresso ticket;
     private double valor;
   
    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }
    public void calculaValor(){
        Ingresso ingresso = new Ingresso();
        switch(ingresso.getTipoIngresso()){
            case "Meia":
        }
    }    
}

