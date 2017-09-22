
package com.iesvirgendelcarmen.acceso.pojo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Juangu
 */
@XmlRootElement(name = "direccion")
@XmlAccessorType (XmlAccessType.FIELD)
public class Direccion {
    private Integer codPos;
    private String tipoVia;
    private String nombreVia;
    private String numVia;
    private String planta;
    private String portal;
    private String puerta;

    public Direccion(Integer codPos, String tipoVia, String nombreVia, String numVia, String planta, String portal, String puerta) {
        this.codPos = codPos;
        this.tipoVia = tipoVia;
        this.nombreVia = nombreVia;
        this.numVia = numVia;
        this.planta = planta;
        this.portal = portal;
        this.puerta = puerta;
    }

    public Direccion() {
    }

    public Integer getCodPos() {
        return codPos;
    }

    public void setCodPos(Integer codPos) {
        this.codPos = codPos;
    }

    public String getTipoVia() {
        return tipoVia;
    }

    public void setTipoVia(String tipoVia) {
        this.tipoVia = tipoVia;
    }

    public String getNombreVia() {
        return nombreVia;
    }

    public void setNombreVia(String nombreVia) {
        this.nombreVia = nombreVia;
    }

    public String getNumVia() {
        return numVia;
    }

    public void setNumVia(String numVia) {
        this.numVia = numVia;
    }

    public String getPlanta() {
        return planta;
    }

    public void setPlanta(String planta) {
        this.planta = planta;
    }

    public String getPortal() {
        return portal;
    }

    public void setPortal(String portal) {
        this.portal = portal;
    }

    public String getPuerta() {
        return puerta;
    }

    public void setPuerta(String puerta) {
        this.puerta = puerta;
    }
    
    
}

