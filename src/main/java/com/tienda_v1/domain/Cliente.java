package com.tienda_v1.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity /* Es una entidad que va a asociar una tabla de la base de datos pero no se le dice cuál tabla*/
@Table(name="cliente")
public class Cliente implements Serializable{
    private static final long serialVersionUID=1L;
    @Id   /* para indicar que el campo que sigue es la clave primaria*/
    @GeneratedValue(strategy = GenerationType.IDENTITY) /*qué valor se le va a asignar? el mismo de la base de datos*/
    private Long idCliente;
    private String nombre;
    private String apellidos;
    private String correo;
    private String telefono;

    public Cliente() {
    }

    public Cliente(String nombre, String apellidos, String correo, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
    }
}
