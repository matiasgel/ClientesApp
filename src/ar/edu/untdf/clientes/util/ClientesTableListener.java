/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.clientes.util;

import ar.edu.untdf.clientes.vista.Clientes;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Matias
 */
    public class ClientesTableListener implements ListSelectionListener {
    Clientes form;
    int rowSelected=0;

    // It is necessary to keep the table since it is not possible
    // to determine the table from the event's source
    public ClientesTableListener(Clientes form) {
        this.form = form;
    }
    public void valueChanged(ListSelectionEvent e) {
        
        
        // If cell selection is enabled, both row and column change events are fired
        if ( this.rowSelected!=form.getTableClientes().getSelectedRow() && form.getTableClientes().getSelectedRow()>0)
        { 
            System.out.println(form.getTableClientes().getSelectedRow());
          this.rowSelected=form.getTableClientes().getSelectedRow();
        }
 
        if (e.getValueIsAdjusting()) {
            // The mouse button has not yet been released
        }
    }
}

