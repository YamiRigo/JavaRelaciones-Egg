/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author yamila
 */
public class Butaca {
    
    private Boolean vacante = true;
    private Espectador client;

    public Butaca() {
    }

    public Butaca(Espectador client) {
        this.client = client;
    }

    public Boolean getVacante() {
        return vacante;
    }

    public void setVacante(Boolean vacante) {
        this.vacante = vacante;
    }

    public Espectador getClient() {
        return client;
    }

    public void setClient(Espectador client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Butaca{ " + "vacante: " + vacante + ", client: " + client + " }";
    }
    
    
    
}
