/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.clientes;

import ar.edu.untdf.clientes.controller.ClienteJpaController;
import ar.edu.untdf.clientes.controller.DireccionJpaController;
import ar.edu.untdf.clientes.modelo.Cliente;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author Matias
 */
public class ClientesApp {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("ClientesAppPU");
    private static ClienteJpaController clienteC=new ClienteJpaController(emf);;
    private static DireccionJpaController direccionC=new DireccionJpaController(emf);

    public static ClienteJpaController getClienteC() {
        return clienteC;
    }

    public static void setClienteC(ClienteJpaController clienteC) {
        ClientesApp.clienteC = clienteC;
    }

    public static DireccionJpaController getDireccionC() {
        return direccionC;
    }

    public static void setDireccionC(DireccionJpaController direccionC) {
        ClientesApp.direccionC = direccionC;
    }

    public static EntityManagerFactory getEmf() {
        return emf;
    }

    public static void setEmf(EntityManagerFactory emf) {
        ClientesApp.emf = emf;
    }

    public static void main(String args[]) {
        //TypedQuery<Cliente> q=ClientesApp.getClienteC().getEntityManager().createQuery("select e from Cliente as e where e.apellido='gel'",Cliente.class);
        //List<Cliente> l =q.getResultList();
        //for(Cliente c:l) System.out.println(c.getNombre());
        Cliente c= ClientesApp.clienteC.findCliente(new Long(53));
        System.out.println(c.getApellido());
    }
   
}
