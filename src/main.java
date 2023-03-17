
import Controladores.ListaController;
import modelos.ListaModel;
import vistas.frmVistas;


public class main {

    public static void main(String[] args) {
       frmVistas VistaListas = new frmVistas(null,true);
       ListaModel ModeloLista = new ListaModel();
       ListaController ControladorLista = new ListaController(VistaListas, ModeloLista);
        
       
       
    }
    
}
