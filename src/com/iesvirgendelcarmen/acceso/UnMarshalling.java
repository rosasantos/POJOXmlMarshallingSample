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
import java.io.FileInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;


/**
 *
 * @author juangu
 */
public class UnMarshalling {
    public static void main(String[] args){
        InputStream is = new FileInputStream("clientes.xml");
                
        Unmarshaller um ;
    }
}
