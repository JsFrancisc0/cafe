package modelo;

import java.util.ArrayList;

public class Cafeteria {

    private String nombre, direccion, redesSociales;

    ArrayList<Cafe> listaCafes;

    public Cafeteria() {
        this.nombre = "nombre";
        this.direccion = "direccion";
        this.redesSociales = "redesSociales";
        this.listaCafes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRedesSociales() {
        return redesSociales;
    }

    public void setRedesSociales(String redesSociales) {
        this.redesSociales = redesSociales;
    }

    public ArrayList<Cafe> getListaCafes() {
        return listaCafes;
    }

    public void setListaCafes(ArrayList<Cafe> listaCafes) {
        this.listaCafes = listaCafes;
    }

    public void agregarCafe(Cafe cafe){
        getListaCafes().add(cafe);
    }

    public void eliminarCafe(Cafe cafe){
        getListaCafes().remove(cafe);
    }
}
