
package multitienda;


public class MultiTienda {

  public static void main(String[] args) {
        // Crear un objeto de la clase Refrigerador con valores lógicos
Refrigerador refrigerador = new Refrigerador(
      "", "", 0, 0, 0, 0, 0, 0, 0, 0, 0
);

        
        CalculosUtiles calculosUtiles = new CalculosUtiles();

        refrigerador.ingresarDatos();
        refrigerador.mostrarDatos(calculosUtiles);
    }
    
}
