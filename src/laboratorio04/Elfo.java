package laboratorio04;
public class Elfo extends Personaje{
    private String reino;

    public Elfo(String reino, String nombre, String raza, String arma, int vida, int daño, int bonificacion) {
        super(nombre, raza, arma, vida, daño, bonificacion);
        this.reino = reino;
    }

    public String getReino() {
        return reino;
    }

    public void setReino(String reino) {
        this.reino = reino;
    }
    
    public String VictoriaEL(Elfo e){
        return Victoria() + "\n" + e.toString() + "\n" + e.getNombre() + " a luchado valerosamente en esta contienda.";
    }
    
    public String HistoriaEL(Elfo e){
        return Historia() + "\n" + "La historia del elfo comienza en el reino de " + e.getReino() + " donde el nacio.";
    }
    
    public String DerrotaEL(Elfo e){
        return Derrota() + "\n" + "El elfo " + e.getNombre() + " ha sido derrotado en combate";
    }
    
    public int quitaVida(Elfo e){
        return e.getVida() - ((e.getVida() * 10) / 100);
    }

    @Override
    public String toString() {
        return super.toString() + " y su reino es " + reino + ".";
    }
    
}
