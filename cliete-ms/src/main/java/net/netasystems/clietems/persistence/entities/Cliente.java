package net.netasystems.clietems.persistence.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "cliente", schema = "public")
public class Cliente {
    private int idCliente;
    private String nombreCliente;
    private String apellidoPatCliente;
    private String apellidoMatCliente;
    private String emailCliente;
    private Date fnacCliente;
    private String celCliente;
    private String usrCrea;
    private java.util.Date fchCrea;
    private String usrModi;
    private java.util.Date fchModi;
    private CatalogoGeneral catalogoGeneralByIdEstatus;
    @Id
    @Column(name = "id_cliente")
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    @Basic
    @Column(name = "nombre_cliente")
    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    @Basic
    @Column(name = "apellido_pat_cliente")
    public String getApellidoPatCliente() {
        return apellidoPatCliente;
    }

    public void setApellidoPatCliente(String apellidoPatCliente) {
        this.apellidoPatCliente = apellidoPatCliente;
    }

    @Basic
    @Column(name = "apellido_mat_cliente")
    public String getApellidoMatCliente() {
        return apellidoMatCliente;
    }

    public void setApellidoMatCliente(String apellidoMatCliente) {
        this.apellidoMatCliente = apellidoMatCliente;
    }

    @Basic
    @Column(name = "email_cliente")
    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    @Basic
    @Column(name = "fnac_cliente")
    public Date getFnacCliente() {
        return fnacCliente;
    }

    public void setFnacCliente(Date fnacCliente) {
        this.fnacCliente = fnacCliente;
    }

    @Basic
    @Column(name = "cel_cliente")
    public String getCelCliente() {
        return celCliente;
    }

    public void setCelCliente(String celCliente) {
        this.celCliente = celCliente;
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
    public java.util.Date getFchCrea() {
        return fchCrea;
    }

    public void setFchCrea(java.util.Date fchCrea) {
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
    public java.util.Date getFchModi() {
        return fchModi;
    }

    public void setFchModi(java.util.Date fchModi) {
        this.fchModi = fchModi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return idCliente == cliente.idCliente &&
                Objects.equals(nombreCliente, cliente.nombreCliente) &&
                Objects.equals(apellidoPatCliente, cliente.apellidoPatCliente) &&
                Objects.equals(apellidoMatCliente, cliente.apellidoMatCliente) &&
                Objects.equals(emailCliente, cliente.emailCliente) &&
                Objects.equals(fnacCliente, cliente.fnacCliente) &&
                Objects.equals(celCliente, cliente.celCliente) &&
                Objects.equals(usrCrea, cliente.usrCrea) &&
                Objects.equals(fchCrea, cliente.fchCrea) &&
                Objects.equals(usrModi, cliente.usrModi) &&
                Objects.equals(fchModi, cliente.fchModi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCliente, nombreCliente, apellidoPatCliente, apellidoMatCliente, emailCliente, fnacCliente, celCliente, usrCrea, fchCrea, usrModi, fchModi);
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
