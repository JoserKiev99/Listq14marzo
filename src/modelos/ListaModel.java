package modelos;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

public class ListaModel {
    Queue <Clientes> ListaClientes = new LinkedList();
   
    
    
    public void EncolarCliente(String Apellidos, String Nombres){
        Clientes nuevoCliente = new Clientes(Apellidos, Nombres);
        this.ListaClientes.add(nuevoCliente);
        JOptionPane.showMessageDialog(null,"Cliente agreagado a la lista");
        
    }
    public Queue ListarClientes(){
        return this.ListarClientes();
        
        
    }
    public void DesEncolar(){
        this.ListaClientes.poll();
        
    }
}
