/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iesvirgendelcarmen.acceso;

import com.iesvirgendelcarmen.acceso.pojo.Cliente;
import com.iesvirgendelcarmen.acceso.pojo.Clientes;
import com.iesvirgendelcarmen.acceso.pojo.Direccion;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
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
        InputStream is = null;
        try {
            is = new FileInputStream("clientes.xml");
            JAXBContext jc = JAXBContext.newInstance( "com.iesvirgendelcarmen.acceso.pojo" );
            Unmarshaller u = jc.createUnmarshaller();
            Clientes clientes = (Clientes)u.unmarshal( is );
            Unmarshaller um ;
        } catch (Exception ex) {
            System.out.println(ex.getLocalizedMessage());
        } finally {
            try {
                is.close();
            } catch (IOException ex) {
               System.out.println(ex.getLocalizedMessage());
            }
        }
    }
}
