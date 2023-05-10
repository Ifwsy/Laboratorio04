package laboratorio04;
public class Enano extends Personaje{
    private String clan;

    public Enano(String clan, String nombre, String raza, String arma, int vida, int daño, int bonificacion) {
        super(nombre, raza, arma, vida, daño, bonificacion);
        this.clan = clan;
    }

    public String getClan() {
        return clan;
    }

    public void setClan(String clan) {
        this.clan = clan;
    }
    
    public String VictoriaEN(Enano ena){
        return Victoria() + "\n" + ena.toString() + "\n" + ena.getNombre() + " a luchado valerosamente en esta contienda.";
    }
    
    public String DerrotaEN(Enano ena){
        return Derrota() + "\n" + "El enano " + ena.getNombre() + " despues de numerosos intentos a sido derrotado por su rival.";
    }
    
    public String HistoriaEN(Enano ena){
        return Historia() + "\n" + "La historia del enano comienza en su clan llamado " + ena.getClan() + " donde su leyenda como herrero y luchador nace.";
    }
    
    public int aumentaVida(Enano ena, int aum_vida){
        return ena.getVida() + aum_vida;
    }

    @Override
    public String toString() {
        return super.toString() + " y su clan es " + clan + ".";
    }
}
