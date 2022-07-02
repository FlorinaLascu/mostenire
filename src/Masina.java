public class Masina extends Vehicul{
    int numar_locuri;

    public Masina(String marca, int viteza, int numar_locuri)
    {
        super(marca, viteza);
        this.numar_locuri=numar_locuri;
    }

    int getNumar_locuri()
    {
        return this.numar_locuri;
    }

    public String toString()
    {
        return (super.toString() + " Numar de locuri: " + this.numar_locuri);
    }

}
