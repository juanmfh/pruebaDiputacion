/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TAWproject.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author JuanM
 */
@Entity
@Table(name = "llamadamovil")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Llamadamovil.findAll", query = "SELECT l FROM Llamadamovil l"),
    @NamedQuery(name = "Llamadamovil.findByIdllamadaMovil", query = "SELECT l FROM Llamadamovil l WHERE l.idllamadaMovil = :idllamadaMovil"),
    @NamedQuery(name = "Llamadamovil.findByDuracion", query = "SELECT l FROM Llamadamovil l WHERE l.duracion = :duracion"),
    @NamedQuery(name = "Llamadamovil.findByDestino", query = "SELECT l FROM Llamadamovil l WHERE l.destino = :destino")})
public class Llamadamovil implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idllamadaMovil")
    private Integer idllamadaMovil;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "duracion")
    private Double duracion;
    @Column(name = "destino")
    private Integer destino;
    @JoinColumn(name = "lineaMovil_idlineaMovil", referencedColumnName = "idlineaMovil")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Lineamovil lineaMovilidlineaMovil;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "llamadaMovilidllamadaMovil", fetch = FetchType.LAZY)
    private Collection<Lineafactura> lineafacturaCollection;

    public Llamadamovil() {
    }

    public Llamadamovil(Integer idllamadaMovil) {
        this.idllamadaMovil = idllamadaMovil;
    }

    public Integer getIdllamadaMovil() {
        return idllamadaMovil;
    }

    public void setIdllamadaMovil(Integer idllamadaMovil) {
        this.idllamadaMovil = idllamadaMovil;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    public Integer getDestino() {
        return destino;
    }

    public void setDestino(Integer destino) {
        this.destino = destino;
    }

    public Lineamovil getLineaMovilidlineaMovil() {
        return lineaMovilidlineaMovil;
    }

    public void setLineaMovilidlineaMovil(Lineamovil lineaMovilidlineaMovil) {
        this.lineaMovilidlineaMovil = lineaMovilidlineaMovil;
    }

    @XmlTransient
    public Collection<Lineafactura> getLineafacturaCollection() {
        return lineafacturaCollection;
    }

    public void setLineafacturaCollection(Collection<Lineafactura> lineafacturaCollection) {
        this.lineafacturaCollection = lineafacturaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idllamadaMovil != null ? idllamadaMovil.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Llamadamovil)) {
            return false;
        }
        Llamadamovil other = (Llamadamovil) object;
        if ((this.idllamadaMovil == null && other.idllamadaMovil != null) || (this.idllamadaMovil != null && !this.idllamadaMovil.equals(other.idllamadaMovil))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TAWproject.entity.Llamadamovil[ idllamadaMovil=" + idllamadaMovil + " ]";
    }
    
}
