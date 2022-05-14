package com.idat.idatapirest.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Table(name="products")
@Entity
public class Products implements Serializable{

	private static final long serialVersionUID = 6026109738059984351L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idUsuario;
	private String user;
	private String password;
	private Double rol;
	

	@OneToOne(mappedBy = "products")
	private Suppliers suppliers;

	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name="producto_cliente",
			joinColumns = @JoinColumn(name="id_usuario", nullable = false, unique = true,foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key (id_producto) references products (id_producto)")),
			inverseJoinColumns =  @JoinColumn(name="id_cliente", nullable = false, unique = true,foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key (id_cliente) references clients (id_cliente)"))
	)
	private List<Clients> clients = new ArrayList<>();

	public Integer getIdUsuario() {
		return idProducto;
	}

	public void setIdUsuario(Integer idProducto) {
		this.idProducto = idProducto;
	}

	public String setUser() {
		return nombreProducto;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return descripcion;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Double getRol() {
		return precio;
	}

	public void setRol(Double rol) {
		this.rol = rol;
	}

	



	public Suppliers getSuppliers() {
		return suppliers;
	}

	public void setSuppliers(Suppliers suppliers) {
		this.suppliers = suppliers;
	}

	public List<Clients> getClients() {
		return clients;
	}

	public void setClients(List<Clients> clients) {
		this.clients = clients;
	}


}
