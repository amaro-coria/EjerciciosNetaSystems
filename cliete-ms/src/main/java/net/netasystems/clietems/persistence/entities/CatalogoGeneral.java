package net.netasystems.clietems.persistence.entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "catalogo_general", schema = "neta_schema", catalog = "neta_db")
public class CatalogoGeneral {
    private int idCatalogo;
    private Integer idTipoCatalogo;
    private String valCatalogo;
    private String descCatalogo;
    private int idEstatus;
    private String usrCrea;
    private Date fchCrea;
    private String usrModi;
    private Date fchModi;
    private Collection<Cliente> clientesByIdCatalogo;
    private Collection<IdentificacionOficial> identificacionOficialsByIdCatalogo;

    @Id
    @Column(name = "id_catalogo")
    public int getIdCatalogo() {
        return idCatalogo;
    }

    public void setIdCatalogo(int idCatalogo) {
        this.idCatalogo = idCatalogo;
    }

    @Basic
    @Column(name = "id_tipo_catalogo")
    public Integer getIdTipoCatalogo() {
        return idTipoCatalogo;
    }

    public void setIdTipoCatalogo(Integer idTipoCatalogo) {
        this.idTipoCatalogo = idTipoCatalogo;
    }

    @Basic
    @Column(name = "val_catalogo")
    public String getValCatalogo() {
        return valCatalogo;
    }

    public void setValCatalogo(String valCatalogo) {
        this.valCatalogo = valCatalogo;
    }

    @Basic
    @Column(name = "desc_catalogo")
    public String getDescCatalogo() {
        return descCatalogo;
    }

    public void setDescCatalogo(String descCatalogo) {
        this.descCatalogo = descCatalogo;
    }

    @Basic
    @Column(name = "id_estatus")
    public int getIdEstatus() {
        return idEstatus;
    }

    public void setIdEstatus(int idEstatus) {
        this.idEstatus = idEstatus;
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
        CatalogoGeneral that = (CatalogoGeneral) o;
        return idCatalogo == that.idCatalogo &&
                idEstatus == that.idEstatus &&
                Objects.equals(idTipoCatalogo, that.idTipoCatalogo) &&
                Objects.equals(valCatalogo, that.valCatalogo) &&
                Objects.equals(descCatalogo, that.descCatalogo) &&
                Objects.equals(usrCrea, that.usrCrea) &&
                Objects.equals(fchCrea, that.fchCrea) &&
                Objects.equals(usrModi, that.usrModi) &&
                Objects.equals(fchModi, that.fchModi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCatalogo, idTipoCatalogo, valCatalogo, descCatalogo, idEstatus, usrCrea, fchCrea, usrModi, fchModi);
    }

    @OneToMany(mappedBy = "catalogoGeneralByIdEstatus")
    public Collection<Cliente> getClientesByIdCatalogo() {
        return clientesByIdCatalogo;
    }

    public void setClientesByIdCatalogo(Collection<Cliente> clientesByIdCatalogo) {
        this.clientesByIdCatalogo = clientesByIdCatalogo;
    }

    @OneToMany(mappedBy = "catalogoGeneralByIdEstatus")
    public Collection<IdentificacionOficial> getIdentificacionOficialsByIdCatalogo() {
        return identificacionOficialsByIdCatalogo;
    }

    public void setIdentificacionOficialsByIdCatalogo(Collection<IdentificacionOficial> identificacionOficialsByIdCatalogo) {
        this.identificacionOficialsByIdCatalogo = identificacionOficialsByIdCatalogo;
    }

}
