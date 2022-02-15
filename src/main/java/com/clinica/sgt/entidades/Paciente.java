/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clinica.sgt.entidades;

import javax.persistence.Entity;

@Entity
public class Paciente extends Usuario {

    private String historiaClinica;

    public Paciente(String historiaClinica, String dni, String mail,
            String password, String nombreCompleto, String telefono,
            Genero genero, Boolean alta, UserType userType) {
        super(dni, mail, password, nombreCompleto, telefono, genero, alta, userType);
        this.historiaClinica = historiaClinica;
    }

    public String getHistoriaClinica() {
        return historiaClinica;
    }

    public void setHistoriaClinica(String historiaClinica) {
        this.historiaClinica = historiaClinica;
    }
    
    

}