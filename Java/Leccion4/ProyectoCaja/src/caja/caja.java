package caja;

public class caja {
    //Atributos (caracteristicas)
    int ancho;
    int alto;
    int profundo;
    //Metodos y constructores (acciones)
    public  caja() { //Constructor 1 = vacio    
    }
    //Constructor con parametros
    public caja(int ancho, int alto, int profundo) { //Constructor 2
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    
    public int calcularVolumen() {//Metodo para calcular
        return ancho * alto * profundo;
    }
}
