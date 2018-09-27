package net.netasystems.clietems.persistence.entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "identificacion_oficial", schema = "neta_schema", catalog = "neta_db")
public class IdentificacionOficial {
    private int idIdentificacion;
    private int idTipoIdentificacion;
    private String valIdentificacion;
    private String anversoIdentificacion;
    private String reversoIdentificacion;
    private String usrCrea;
    private Date fchCrea;
    private String usrModi;
    private Date fchModi;
    private CatalogoGeneral catalogoGeneralByIdEstatus;

    @Id
    @Column(name = "id_identificacion")
    public int getIdIdentificacion() {
        return idIdentificacion;
    }

    public void setIdIdentificacion(int idIdentificacion) {
        this.idIdentificacion = idIdentificacion;
    }

    @Basic
    @Column(name = "id_tipo_identificacion")
    public int getIdTipoIdentificacion() {
        return idTipoIdentificacion;
    }

    public void setIdTipoIdentificacion(int idTipoIdentificacion) {
        this.idTipoIdentificacion = idTipoIdentificacion;
    }

    @Basic
    @Column(name = "val_identificacion")
    public String getValIdentificacion() {
        return valIdentificacion;
    }

    public void setValIdentificacion(String valIdentificacion) {
        this.valIdentificacion = valIdentificacion;
    }

    @Basic
    @Column(name = "anverso_identificacion")
    public String getAnversoIdentificacion() {
        return anversoIdentificacion;
    }

    public void setAnversoIdentificacion(String anversoIdentificacion) {
        this.anversoIdentificacion = anversoIdentificacion;
    }

    @Basic
    @Column(name = "reverso_identificacion")
    public String getReversoIdentificacion() {
        return reversoIdentificacion;
    }

    public void setReversoIdentificacion(String reversoIdentificacion) {
        this.reversoIdentificacion = reversoIdentificacion;
    }

    @Basic
    @Column(name = "usr_crea")
    public String getUsrCrea() {
        return usrCrea;
    }

    public void setUsrCrea(String usrCrea) {
        this.usrCrea = usrCrea;
    }

    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fch_crea")
    public Date getFchCrea() {
        return fchCrea;
    }

    public void setFchCrea(Date fchCrea) {
        this.fchCrea = fchCrea;
    }

    @Basic
    @Column(name = "usr_modi")
    public String getUsrModi() {
        return usrModi;
    }

    public void setUsrModi(String usrModi) {
        this.usrModi = usrModi;
    }

    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fch_modi")
    public Date getFchModi() {
        return fchModi;
    }

    public void setFchModi(Date fchModi) {
        this.fchModi = fchModi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IdentificacionOficial that = (IdentificacionOficial) o;
        return idIdentificacion == that.idIdentificacion &&
                idTipoIdentificacion == that.idTipoIdentificacion &&
                Objects.equals(valIdentificacion, that.valIdentificacion) &&
                Objects.equals(anversoIdentificacion, that.anversoIdentificacion) &&
                Objects.equals(reversoIdentificacion, that.reversoIdentificacion) &&
                Objects.equals(usrCrea, that.usrCrea) &&
                Objects.equals(fchCrea, that.fchCrea) &&
                Objects.equals(usrModi, that.usrModi) &&
                Objects.equals(fchModi, that.fchModi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idIdentificacion, idTipoIdentificacion, valIdentificacion, anversoIdentificacion, reversoIdentificacion, usrCrea, fchCrea, usrModi, fchModi);
    }

    @ManyToOne
    @JoinColumn(name = "id_estatus", referencedColumnName = "id_catalogo")
    public CatalogoGeneral getCatalogoGeneralByIdEstatus() {
        return catalogoGeneralByIdEstatus;
    }

    public void setCatalogoGeneralByIdEstatus(CatalogoGeneral catalogoGeneralByIdEstatus) {
        this.catalogoGeneralByIdEstatus = catalogoGeneralByIdEstatus;
    }

}
