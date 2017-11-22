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
    
    private String tipoingresso, fileirapoltrona, quantidade, numeropoltrona;

    /**
     * @return the quantidade
     */
    public String getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the numeropoltrona
     */
    public String getNumeropoltrona() {
        return numeropoltrona;
    }

    /**
     * @param numeropoltrona the numeropoltrona to set
     */
    public void setNumeropoltrona(String numeropoltrona) {
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
    public void verificaPoltrona(String sala) {
        Ingresso ingresso = new Ingresso();
        int[][] lugar = new int[15][10];
        switch(ingresso.getFileirapoltrona()){
            case "A":
                ingresso.setFileirapoltrona("0");
                break;
            case "B":
                ingresso.setFileirapoltrona("1");
                break;
            case "C":
                ingresso.setFileirapoltrona("2");
                break;
            case "D":
                ingresso.setFileirapoltrona("3");
                break;
            case "E":
                ingresso.setFileirapoltrona("4");
                break;
            case "F":
                ingresso.setFileirapoltrona("5");
                break;
            case "G":
                ingresso.setFileirapoltrona("6");
                break;
            case "H":
                ingresso.setFileirapoltrona("7");
                break;
            case "I":
                ingresso.setFileirapoltrona("8");
                break;
            case "J":
                ingresso.setFileirapoltrona("9");
                break;
            case "K":
                ingresso.setFileirapoltrona("10");
                break;
            case "L":
                ingresso.setFileirapoltrona("11");
                break;
            case "M":
                ingresso.setFileirapoltrona("12");
                break; 
            case "N":
                ingresso.setFileirapoltrona("13");
                break;
            case "O":
                ingresso.setFileirapoltrona("14");
                break;    
                
        }
        switch(sala){
            case "1":
                if(lugar[Integer.parseInt(ingresso.getFileirapoltrona())][ingresso.getNumeropoltrona()]==1) {
                    //Informar ao usuário que o lugar está ocupado!
                }
                else
                    lugar[Integer.parseInt(ingresso.getFileirapoltrona())][ingresso.getNumeropoltrona()]=1;
                break;
            case "2":
                if(lugar[Integer.parseInt(ingresso.getFileirapoltrona())][ingresso.getNumeropoltrona()]==1) {
                    //Informar ao usuário que o lugar está ocupado!
                }
                else
                    lugar[Integer.parseInt(ingresso.getFileirapoltrona())][ingresso.getNumeropoltrona()]=1;
                break;
            case "3":
                if(lugar[Integer.parseInt(ingresso.getFileirapoltrona())][ingresso.getNumeropoltrona()]==1) {
                    //Informar ao usuário que o lugar está ocupado!
                }
                else
                    lugar[Integer.parseInt(ingresso.getFileirapoltrona())][ingresso.getNumeropoltrona()]=1;
                break;
            case "4":
                if(lugar[Integer.parseInt(ingresso.getFileirapoltrona())][ingresso.getNumeropoltrona()]==1) {
                    //Informar ao usuário que o lugar está ocupado!
                }
                else
                    lugar[Integer.parseInt(ingresso.getFileirapoltrona())][ingresso.getNumeropoltrona()]=1;
                break;
        }
        
    }
    public void comprarIngresso(){
        
    }
    
}