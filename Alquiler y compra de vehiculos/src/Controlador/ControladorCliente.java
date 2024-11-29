package Controlador;

import BD.Conexion;
import Controller.HelperController;
import Modelo.Cliente;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

public class ControladorCliente {

    HelperController controller = new HelperController();
    Conexion cx;
    public ControladorCliente() {
        cx = new Conexion();
        cx.conectar();
    }
    
    public List<Cliente> obtenerClientes(){
        List<Cliente> clientes = new ArrayList<>();
        String query = "SELECT * FROM CLIENTE";
        try {
            ResultSet rs = cx.EjecutarQuery(query);
            while(rs.next()){
                clientes.add(new Cliente(
                        rs.getString("rut"),
                        rs.getString("nombre"),
                        rs.getString("numeroContacto"),
                        rs.getString("direccion"),
                        rs.getString("tipoCliente")
                ));
            }
        } catch (Exception e) {
            System.out.println("Error al obtener clientes: " + e.getMessage());
        }
        return clientes;
    }
    
    
    public Cliente clienteBuscado(String rutBuscado){
        Cliente clienteEncontrado = null;
        String query = "SELECT * FROM CLIENTE WHERE RUT = " + rutBuscado + ";";
        Conexion cx = new Conexion();
        cx.conectar();
        try {
            ResultSet st = cx.EjecutarQuery(query);
            if(st.next()){
                clienteEncontrado = new Cliente();
                clienteEncontrado.setRut(st.getString("rut"));
                clienteEncontrado.setNombre(st.getString("nombre"));
                clienteEncontrado.setNumeroContacto(st.getString("numeroContacto"));
                clienteEncontrado.setDireccion(st.getString("direccion"));
                clienteEncontrado.setTipoCliente(st.getString("tipoCliente"));
                controller.showInformation("Cliente encontrado");
            }else{
                controller.showInformation("El Cliente no se encontro");
            }
        } catch (Exception e) {
            System.out.println("Error al buscar por id: " + e.getMessage());
        }
        return clienteEncontrado;
    }
    
    
}
