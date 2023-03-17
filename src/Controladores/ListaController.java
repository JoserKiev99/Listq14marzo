
package Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Queue;
import modelos.ListaModel;
import vistas.frmVistas;

public class ListaController implements ActionListener {
    frmVistas VistaLista;
    ListaModel modeloLista; 

    public ListaController(frmVistas VistaLista, ListaModel modeloLista) {
        this.VistaLista = VistaLista;
        this.modeloLista = modeloLista;
    
    //escucha
    this.VistaLista.btnIngresar.addActionListener(this);
    this.VistaLista.btnAtenderCliente.addActionListener(this);
    this.VistaLista.btnAtenderTodos.addActionListener(this);
    
    this.VistaLista.setLocationRelativeTo(null);
    this.VistaLista.setVisible(true);
    
    
    }
    
    
    
    
    
    
    //Escucha los Botones
    
   
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.VistaLista.btnIngresar){
            this.modeloLista.EncolarCliente(this.VistaLista.txtApellidos.getText()
            ,this.VistaLista.txtNombre.getText());
            
                
            //Mostrar los datos en el text area
            Queue listaLocal = this.modeloLista.ListarClientes();
              this.VistaLista.txtListaClientes.setText(listaLocal.peek().toString());
            }
            
        }
    }
    
    

