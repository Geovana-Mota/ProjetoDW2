/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Geovana Izabela Mota
 */
@Entity
@Table(name = "tecnicos")
@NamedQueries({
    @NamedQuery(name = "Tecnicos.findAll", query = "SELECT t FROM Tecnicos t")})
public class Tecnicos implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TecnicosPK tecnicosPK;
    @Column(name = "nome_tecnicos")
    private String nomeTecnicos;

    public Tecnicos() {
    }

    public Tecnicos(TecnicosPK tecnicosPK) {
        this.tecnicosPK = tecnicosPK;
    }

    public Tecnicos(int idTecnicos, int laboratorioidLaboratorio) {
        this.tecnicosPK = new TecnicosPK(idTecnicos, laboratorioidLaboratorio);
    }

    public TecnicosPK getTecnicosPK() {
        return tecnicosPK;
    }

    public void setTecnicosPK(TecnicosPK tecnicosPK) {
        this.tecnicosPK = tecnicosPK;
    }

    public String getNomeTecnicos() {
        return nomeTecnicos;
    }

    public void setNomeTecnicos(String nomeTecnicos) {
        this.nomeTecnicos = nomeTecnicos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tecnicosPK != null ? tecnicosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tecnicos)) {
            return false;
        }
        Tecnicos other = (Tecnicos) object;
        if ((this.tecnicosPK == null && other.tecnicosPK != null) || (this.tecnicosPK != null && !this.tecnicosPK.equals(other.tecnicosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Tecnicos[ tecnicosPK=" + tecnicosPK + " ]";
    }
    
}
