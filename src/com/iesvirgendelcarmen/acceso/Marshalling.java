/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iesvirgendelcarmen.acceso;

import com.iesvirgendelcarmen.acceso.pojo.Cliente;
import com.iesvirgendelcarmen.acceso.pojo.Clientes;
import com.iesvirgendelcarmen.acceso.pojo.Direccion;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 *
 * @author juangu
 */
public class Marshalling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          try {
            Cliente c1 = new Cliente(12345678, "Pepe", "Pérez Martínez",
                    "pepe@sincorreo.es", "+1555123456",
                    new Direccion(23008, "Calle", "Virgen de la Capilla", "1", "2º", "Izquierda", "A"));
            
            Cliente c2 = new Cliente(87654321, "Juan", "García Pérez",
                    "juan@sincorreo.es", "+1555654321",
                    new Direccion(23008, "Paseo", "de la Estación", "44", "", "", ""));
            
            Cliente c3 = new Cliente(11223344, "Antonio", "Martínez García",
                    "juan@sincorreo.es", "+1555654321",
                    new Direccion(23008, "Paseo", "de la Estación", "44", "2", "A", "Izquierda"));
                            
            Clientes clientes = new Clientes();
            clientes.addCliente(c1);
            clientes.addCliente(c2);
            clientes.addCliente(c3);
            
            
            JAXBContext jaxbContext = JAXBContext.newInstance(clientes.getClass());
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            
            //Marshal the employees list in file
            jaxbMarshaller.marshal(clientes, new File("clientes.xml"));
        } catch (JAXBException ex) {
            Logger.getLogger(Marshalling.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
