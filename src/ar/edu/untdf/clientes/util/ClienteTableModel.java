/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.clientes.util;

import ar.edu.untdf.clientes.ClientesApp;
import ar.edu.untdf.clientes.controller.ClienteJpaController;
import ar.edu.untdf.clientes.modelo.Cliente;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Matias
 */
public class ClienteTableModel extends AbstractTableModel{
    ClienteJpaController clienteC;
    Object[] clientes;
    public ClienteTableModel(){ 
        super();
       clienteC=ClientesApp.getClienteC();
        this.clientes= clienteC.findClienteEntities().toArray();
    }
    @Override
  public int getRowCount(){
      return clienteC.getClienteCount();
  };
  
    @Override
  public int getColumnCount(){
  return 4;
  };
    @Override
  public Object getValueAt(int row, int column){
    switch(column){
        case 1:return ((Cliente)clientes[row]).getId();
        case 2:return ((Cliente)clientes[row]).getNombre();
        case 3:return ((Cliente)clientes[row]).getApellido();
        case 4:return ((Cliente)clientes[row]).getCuit();
        default:return null;
    }};
  public   String getColumnName(int columnIndex) {
    switch(columnIndex){
        case 1:return "id";
        case 2:return "nombre";
        case 3:return "apellido";
        case 4:return "cuit";
        default:return null;
    }}     

}
