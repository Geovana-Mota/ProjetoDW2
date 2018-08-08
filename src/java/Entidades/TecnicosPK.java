/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Geovana Izabela Mota
 */
@Embeddable
public class TecnicosPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id_tecnicos")
    private int idTecnicos;
    @Basic(optional = false)
    @Column(name = "laboratorio_idLaboratorio")
    private int laboratorioidLaboratorio;

    public TecnicosPK() {
    }

    public TecnicosPK(int idTecnicos, int laboratorioidLaboratorio) {
        this.idTecnicos = idTecnicos;
        this.laboratorioidLaboratorio = laboratorioidLaboratorio;
    }

    public int getIdTecnicos() {
        return idTecnicos;
    }

    public void setIdTecnicos(int idTecnicos) {
        this.idTecnicos = idTecnicos;
    }

    public int getLaboratorioidLaboratorio() {
        return laboratorioidLaboratorio;
    }

    public void setLaboratorioidLaboratorio(int laboratorioidLaboratorio) {
        this.laboratorioidLaboratorio = laboratorioidLaboratorio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idTecnicos;
        hash += (int) laboratorioidLaboratorio;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TecnicosPK)) {
            return false;
        }
        TecnicosPK other = (TecnicosPK) object;
        if (this.idTecnicos != other.idTecnicos) {
            return false;
        }
        if (this.laboratorioidLaboratorio != other.laboratorioidLaboratorio) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.TecnicosPK[ idTecnicos=" + idTecnicos + ", laboratorioidLaboratorio=" + laboratorioidLaboratorio + " ]";
    }
    
}
