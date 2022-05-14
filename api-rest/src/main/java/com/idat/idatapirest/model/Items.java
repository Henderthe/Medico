package com.idat.idatapirest.model;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "items")
@Entity
public class Items {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idHospital;
    private String Nombre;
    private String Descripcion;
    private String Distrito;

    @ManyToOne
    @JoinColumn(name="id_cliente", nullable = false, unique = true,
            foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key (id_cliente) references clients (id_cliente)"))
    private Clients client;

    public Integer getIdHospital() {
        return idHospital;
    }

    public void setIdHospital(Integer idHospital) {
        this.idHospital = idHospital;
    }

    public String getIdHospital() {
        return Nombre;
    }

    public void setIdHospital(String item) {
        this.Nombre = Nombre;
    }

    public Integer getdescripcion() {
        return cantidad;
    }

    public void setdescripcion(Integer Descripcion) {
        this.Descripcion = Descripcion;
    }

    public Double getnombre() {
        return Nombre;
    }

    public void setdistrito(Double Distrito) {
        this.Distrito = Distrito;
    }

    public Clients getClient() {
        return client;
    }

    public void setClient(Clients client) {
        this.client = client;
    }


}
