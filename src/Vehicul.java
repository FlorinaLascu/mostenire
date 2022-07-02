public class Vehicul {

    String marca;
    int viteza;

    public Vehicul(){}
    public Vehicul(String marca, int viteza)
    {
        this.marca=marca;
        this.viteza=viteza;
    }

    String getMarca()
    {
        return this.marca;
    }

    int getViteza()
    {
        return this.viteza;
    }

    public String toString()
    {
        return "Marca: " + this.marca + " Viteza: " + this.viteza;
    }
}
