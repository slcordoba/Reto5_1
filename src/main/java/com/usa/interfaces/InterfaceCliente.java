/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.usa.interfaces;

import org.springframework.data.repository.CrudRepository;
import com.usa.modelo.Cliente;

/**
 *
 * @author USUARIO
 */
public interface InterfaceCliente extends CrudRepository<Cliente,Integer>{
    
}
