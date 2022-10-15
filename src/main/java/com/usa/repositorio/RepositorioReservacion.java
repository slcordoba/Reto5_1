/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usa.repositorio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.usa.interfaces.InterfaceReservacion;
import com.usa.modelo.Cliente;
import com.usa.modelo.Reservacion;
import com.usa.reportes.ContadorClientes;

/**
 *
 * @author USUARIO
 */
@Repository
public class RepositorioReservacion {
     @Autowired
    private InterfaceReservacion crud4;
    
    public List<Reservacion> getAll(){
        return (List<Reservacion>) crud4.findAll();
    }
    public Optional<Reservacion> getReservation(int id){
        return crud4.findById(id);
    }
    public Reservacion save(Reservacion reservacion){
        return crud4.save(reservacion);
    }
     public void delete(Reservacion reservacion){
        crud4.delete(reservacion);
    }
     
     public List<Reservacion> ReservacionStatus (String status){
         return crud4.findAllByStatus(status);
     }
     
     public List<Reservacion> ReservacionTiempo (Date a, Date b){
         return crud4.findAllByStartDateAfterAndStartDateBefore(a, b);
     }
   
     public List<ContadorClientes> getTopClientes(){
         List<ContadorClientes> res=new ArrayList<>();
         List<Object[]>report = crud4.countTotalReservationsByClient();
         for(int i=0; i<report.size();i++){
             res.add(new ContadorClientes((Long)report.get(i)[1],(Cliente) report.get(i)[0]));
         
         }
         return res;
     }
}
