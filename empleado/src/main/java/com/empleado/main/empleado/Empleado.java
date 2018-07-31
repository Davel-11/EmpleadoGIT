package com.empleado.main.empleado;

import javax.persistence.Column;

import java.time.ZonedDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "empleado")
public class Empleado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	
	@Column(name= "nombre" )
	String nombre;
	
	@Column(name= "salario" )
	float salario;
	
	@Column(name= "creacion" )
	ZonedDateTime creacion;
	
	public Empleado() {
		
	}
	

	public Empleado(Long id, String nombre, float salario, ZonedDateTime creacion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.salario = salario;
		this.creacion = creacion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public ZonedDateTime getCreacion() {
		return creacion;
	}

	public void setCreacion(ZonedDateTime creacion) {
		this.creacion = creacion;
	}
	
	
	
	
	
	

}
