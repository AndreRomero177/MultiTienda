
package multitienda;


import java.util.Scanner;

public class Refrigerador {
    private String marca;
    private String modelo;
    private double alto;
    private double ancho;
    private double largo;
    private double temperaturaCongelacionMaxima;
    private int anosGarantia;
    private double potencia;
    private double radioCilindroGas;
    private double alturaCilindroGas;
    private double precioNeto;

    public Refrigerador(String marca, String modelo, double alto, double ancho, double largo, double temperaturaCongelacionMaxima, int anosGarantia, double potencia, double radioCilindroGas, double alturaCilindroGas, double precioNeto) {
        this.marca = marca;
        this.modelo = modelo;
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
        this.temperaturaCongelacionMaxima = temperaturaCongelacionMaxima;
        this.anosGarantia = anosGarantia;
        this.potencia = potencia;
        this.radioCilindroGas = radioCilindroGas;
        this.alturaCilindroGas = alturaCilindroGas;
        this.precioNeto = precioNeto;
    }

    public void ingresarDatos() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la marca: ");
        marca = scanner.nextLine();

        System.out.print("Ingrese el modelo: ");
        modelo = scanner.nextLine();

        System.out.print("Ingrese el alto (cms): ");
        alto = scanner.nextDouble();

        System.out.print("Ingrese el ancho (cms): ");
        ancho = scanner.nextDouble();

        System.out.print("Ingrese el largo (cms): ");
        largo = scanner.nextDouble();

        System.out.print("Ingrese la temperatura máxima de congelación (Celsius): ");
        temperaturaCongelacionMaxima = scanner.nextDouble();

        System.out.print("Ingrese la garantía (años): ");
        anosGarantia = scanner.nextInt();

        System.out.print("Ingrese la potencia (watts): ");
        potencia = scanner.nextDouble();

        System.out.print("Ingrese el radio del cilindro de gas (cms): ");
        radioCilindroGas = scanner.nextDouble();

        System.out.print("Ingrese la altura del cilindro de gas (cms): ");
        alturaCilindroGas = scanner.nextDouble();

        System.out.print("Ingrese el precio neto: ");
        precioNeto = scanner.nextDouble();
    }

    public void mostrarDatos(CalculosUtiles calculosUtiles) {
        double volumen = alto * ancho * largo;
        double temperaturaContenedor = calculosUtiles.calcularTemperaturaContenedor(temperaturaCongelacionMaxima);
        double volumenGas = calculosUtiles.calcularVolumenGas(radioCilindroGas, alturaCilindroGas);
        double potenciaMorgan = calculosUtiles.calcularPotenciaMorgan(anosGarantia, potencia);
        double precioTotal = calculosUtiles.calcularPrecioTotal(precioNeto, volumenGas, calculosUtiles.calcularCostoElectricidad(potencia, volumen));

        System.out.println("\nReporte de ingreso:");
        System.out.println("Marca: " + marca.toUpperCase());
        System.out.println("Modelo: " + modelo.toUpperCase());
        System.out.println("Alto: " + alto + " cms");
        System.out.println("Ancho: " + ancho + " cms");
        System.out.println("Largo: " + largo + " cms");
        System.out.println("Volumen: " + volumen + " cms³");
        System.out.println("Temperatura de congelación: " + temperaturaCongelacionMaxima + "°C / " + (temperaturaCongelacionMaxima * 1.8) + "°F / " + (temperaturaCongelacionMaxima + 273.15) + " K");
        System.out.println("Temperatura del contenedor: " + temperaturaContenedor + "°C / " + (temperaturaContenedor * 1.8) + "°F / " + (temperaturaContenedor + 273.15) + " K");
        System.out.println("Volumen de gas: " + volumenGas + " cms³");
        System.out.println("Potencia: " + potencia + " watts");
        System.out.println("Potencia de Morgan: " + potenciaMorgan);
        System.out.println("Precio neto: " + precioNeto);
        System.out.println("Precio total: " + precioTotal);
    }

   
}
