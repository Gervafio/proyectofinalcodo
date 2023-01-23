package com.mycompany.web.models;

import java.io.Serializable;

public class Inscripto implements Serializable {
        private int nro,cantidad;
        private String nombre,apellido,correo,categoria;

        public Inscripto(){
    
        }
    
        public int getNro(){
            return nro;
        }
    
        public void setNro(int nuevoNro){
            this.nro = nuevoNro;
        }

        public int getCantidad(){
            return cantidad;
        }
    
        public void setCantidad(int can){
            this.cantidad = can;
        }
    
    
        public String getNombre(){
            return nombre;
        }
    
        public void setNombre(String nuevoNombre){
            this.nombre = nuevoNombre;
        }
    
        public String getApellido(){
            return apellido;
        }
    
        public void setApellido(String nuevoApellido){
            this.apellido = nuevoApellido;
        }
    
        public String getCorreo(){
            return correo;
        }
    
        public void setCorreo(String nuevoCorreo){
            this.correo = nuevoCorreo;
        }

        public String getCategoria(){
            return categoria;
        }
    
        public void setCategoria(String nuevaCategoria){
            this.categoria = nuevaCategoria;
        }
    }

