
package multitienda;


public class CalculosUtiles {

    int numero;
    
    public double calcularTemperaturaContenedor(double temperaturaCongelacionMaxima) {
        // Utilizamos la fórmula proporcionada
        double alpha = 10;
        double T1 = (temperaturaCongelacionMaxima - 32) * 5 / 9;
        double T2 = Math.sqrt(temperaturaCongelacionMaxima * temperaturaCongelacionMaxima) * Math.log(Math.abs(temperaturaCongelacionMaxima - (60 + 100) / 2));

        return temperaturaCongelacionMaxima - (T1 + T2);
    }

    public double calcularVolumenGas(double radioCilindroGas, double alturaCilindroGas) {
      
        return Math.PI * Math.pow(radioCilindroGas, 2) * alturaCilindroGas;
    }

    public double calcularPotenciaMorgan(int anosGarantia, double potencia) {
      
        return Math.pow(10, (double) anosGarantia / potencia * 10);
    }

    public double calcularCostoElectricidad(double potencia, double volumen) {
 
        return potencia * volumen * 0.00001;
    }

    public double calcularPrecioTotal(double precioNeto, double volumenGas, double costoElectricidad) {
     
        return precioNeto + volumenGas + costoElectricidad;
    }
}