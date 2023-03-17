
package modelos;


public class Clientes {
    String Apellidos;
    String nombres;

    public Clientes(String Apellidos, String nombres) {
        this.Apellidos = Apellidos;
        this.nombres = nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    
    
    

}
