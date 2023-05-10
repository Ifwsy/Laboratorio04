package laboratorio04;

public class Humano extends Personaje{
    private String casta;

    public Humano(String casta, String nombre, String raza, String arma, int vida, int daño, int bonificacion) {
        super(nombre, raza, arma, vida, daño, bonificacion);
        this.casta = casta;
    }

    public String getCasta() {
        return casta;
    }

    public void setCasta(String casta) {
        this.casta = casta;
    }
    
    public String VictoriaHU(Humano hum){
        return Victoria() + "\n" + hum.toString() + "\n" + hum.getNombre() + " a luchado valerosamente en esta contienda.";
    }
    
    public String DerrotaHU(Humano hum){
        return Derrota() + "\n" + "El hombre " + hum.getNombre() + " lucho agresivamente hasta su ultimo aliento, pero esa misma agresividad no lo dejo pensar claramente y su enemigo tomo ventaje de el.";
    }
    
    public String HistoriaHU(Humano hum){
        return Historia() + "\n" + "La historia del humano comienza con su casta llamada " + hum.getCasta() + " donde se forjo en sus primeros años como luchador.";
    }
    
    public int superBono(Humano hum, int aum_daño){
        return hum.getDaño() + aum_daño;
    }
    
    @Override
    public String toString() {
        return super.toString() + " y su familia es " + casta + ".";
    }
    
}
