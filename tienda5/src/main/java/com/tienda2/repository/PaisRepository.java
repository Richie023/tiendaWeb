/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda2.repository;


import com.tienda2.entity.Pais;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author ricar_t6uqtj3
 */
public interface PaisRepository  extends CrudRepository<Pais,Long>{
  /*El extends sirve para heredar, Java generics  */  
    /*Sirve como un metodo de seguridad y evitar un plagio una clase Interface*/
}
