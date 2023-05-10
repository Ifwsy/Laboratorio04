package laboratorio04;
public class Personaje {
    private String nombre;
    private String raza;
    private String arma;
    private int vida;
    private int daño;
    private int bonificacion;

    public Personaje(String nombre, String raza, String arma, int vida, int daño, int bonificacion) {
        this.nombre = nombre;
        this.raza = raza;
        this.arma = arma;
        this.vida = vida;
        this.daño = daño;
        this.bonificacion = bonificacion;
    }

    @Override
    public String toString() {
        return "El personaje " + nombre + " de la raza " + raza + " utiliza una " + arma + ", tiene " + vida + " de vida, hace un daño de " + daño + ", su bonificacion es " + bonificacion;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public int getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(int bonificacion) {
        this.bonificacion = bonificacion;
    }
    
    public String Historia(){
        return "***HISTORIA***";
    }
    
    public String Victoria(){
        return "***VICTORIA***";
    }
    
    public String Derrota(){
        return "***DERROTA***";
    }
    
    
    public int Combate(Enano en,Elfo el,Humano hu) {
        System.out.println("***COMBATE***");
        int int_daño = 0;
        int_daño = (int)(Math.random()*33);
        int dañoF = int_daño;
        Enano enemigoEN = new Enano("Huldra","Sindri","Enano","Espada",140,dañoF,0);
        Elfo enemigoEL = new Elfo("Alfheim","Byggvir","Elfo","Arco",140,dañoF,0);
        Humano enemigoHU = new Humano("De Esparta","Alexios","Humano","Lanza",140,dañoF,0);
        int numero = (int)(Math.random()*2);
        int vida_player = 0, vida_enemy = 0, daño_player = 0, daño_enemy = 0;
        if("Enano".equals(raza)){
            System.out.println("La raza que usted eligio es " + en.getRaza());
            if(numero == 0){
                System.out.println("Y su enemigo sera " + enemigoEL.getNombre() + " el elfo guerrero perteneciente al reino de " + enemigoEL.getReino());
                vida_player = en.getVida(); vida_enemy = enemigoEL.getVida(); daño_player = en.getDaño(); daño_enemy = enemigoEL.getDaño();
                for(int i = 1;i < 11; i++){
                    System.out.println("***RONDA " + i + "***");
                    vida_enemy = vida_enemy - daño_player;
                    vida_player = vida_player - daño_enemy;
                    System.out.println(en.getNombre() + " a atacado a " + enemigoEL.getNombre() + " y a hecho " + daño_player);
                    System.out.println("La vida de " + enemigoEL.getNombre() + " es de " + vida_enemy);
                    System.out.println(enemigoEL.getNombre() + " a atacado a " + en.getNombre() + " y a hecho " + daño_enemy);
                    System.out.println("La vida de " + en.getNombre() + " es de " + vida_player);
                    if(vida_enemy < 0){
                        System.out.println("El ganador es " + en.getNombre());
                        return 1;
                    }else if(vida_player < 0){
                        System.out.println("El ganador es " + enemigoEL.getNombre());
                        return 2;
                    }
                }
            }else if(numero == 1){
                System.out.println("Y su enemigo sera " + enemigoHU.getNombre() + " el misthios de " + enemigoHU.getCasta());
                vida_player = en.getVida(); vida_enemy = enemigoHU.getVida(); daño_player = en.getDaño(); daño_enemy = enemigoHU.getDaño();
                for(int i = 1;i < 11; i++){
                    System.out.println("***RONDA " + i + "***");
                    vida_enemy = vida_enemy - daño_player;
                    vida_player = vida_player - daño_enemy;
                    System.out.println(en.getNombre() + " a atacado a " + enemigoHU.getNombre() + " y a hecho " + daño_player);
                    System.out.println("La vida de " + enemigoHU.getNombre() + " es de " + vida_enemy);
                    System.out.println(enemigoHU.getNombre() + " a atacado a " + en.getNombre() + " y a hecho " + daño_enemy);
                    System.out.println("La vida de " + en.getNombre() + " es de " + vida_player);
                    if(vida_enemy < 0){
                        System.out.println("El ganador es " + en.getNombre());
                        return 1;
                    }else if(vida_player < 0){
                        System.out.println("El ganador es " + enemigoHU.getNombre());
                        return 2;
                    }
                }
            }
        }else if("Elfo".equals(raza)){
            System.out.println("La raza que usted elijio es " + el.getRaza());
            if(numero == 0){
                System.out.println("Y su enemigo sera " + enemigoEN.getNombre() + " el enano herrero y guerrero del clan " + enemigoEN.getClan());
                vida_player = el.getVida(); vida_enemy = enemigoEN.getVida(); daño_player = el.getDaño(); daño_enemy = enemigoEN.getDaño();
                for(int i = 1;i < 11; i++){
                    System.out.println("***RONDA " + i + "***");
                    vida_enemy = vida_enemy - daño_player;
                    vida_player = vida_player - daño_enemy;
                    System.out.println(el.getNombre() + " a atacado a " + enemigoEN.getNombre() + " y a hecho " + daño_player);
                    System.out.println("La vida de " + enemigoEN.getNombre() + " es de " + vida_enemy);
                    System.out.println(enemigoEN.getNombre() + " a atacado a " + el.getNombre() + " y a hecho " + daño_enemy);
                    System.out.println("La vida de " + el.getNombre() + " es de " + vida_player);
                    if(vida_enemy < 0){
                        System.out.println("El ganador es " + el.getNombre());
                        return 1;
                    }else if(vida_player < 0){
                        System.out.println("El ganador es " + enemigoEN.getNombre());
                        return 2;
                    }
                }
            }else if(numero == 1){
                System.out.println("Y su enemigo sera " + enemigoHU.getNombre() + " el misthios de " + enemigoHU.getCasta());
                vida_player = el.getVida(); vida_enemy = enemigoHU.getVida(); daño_player = el.getDaño(); daño_enemy = enemigoHU.getDaño();
                for(int i = 1;i < 11; i++){
                    System.out.println("***RONDA " + i + "***");
                    vida_enemy = vida_enemy - daño_player;
                    vida_player = vida_player - daño_enemy;
                    System.out.println(el.getNombre() + " a atacado a " + enemigoHU.getNombre() + " y a hecho " + daño_player);
                    System.out.println("La vida de " + enemigoHU.getNombre() + " es de " + vida_enemy);
                    System.out.println(enemigoHU.getNombre() + " a atacado a " + el.getNombre() + " y a hecho " + daño_enemy);
                    System.out.println("La vida de " + el.getNombre() + " es de " + vida_player);
                    if(vida_enemy < 0){
                        System.out.println("El ganador es " + el.getNombre());
                        return 1;
                    }else if(vida_player < 0){
                        System.out.println("El ganador es " + enemigoHU.getNombre());
                        return 2;
                    }
                }
            }
        }else if("Humano".equals(raza)){
            System.out.println("La raza que usted elijio es " + hu.getRaza());
            if(numero == 0){
                System.out.println("Y su enemigo sera " + enemigoEN.getNombre() + " el enano herrero y guerrero del clan " + enemigoEN.getClan());
                vida_player = hu.getVida(); vida_enemy = enemigoEN.getVida(); daño_player = hu.getDaño(); daño_enemy = enemigoEN.getDaño();
                for(int i = 1;i < 11; i++){
                    System.out.println("***RONDA " + i + "***");
                    vida_enemy = vida_enemy - daño_player;
                    vida_player = vida_player - daño_enemy;
                    daño_player = daño_player - 1;
                    System.out.println("El daño a sido reducido en 1");
                    System.out.println(hu.getNombre() + " a atacado a " + enemigoEN.getNombre() + " y a hecho " + daño_player);
                    System.out.println("La vida de " + enemigoEN.getNombre() + " es de " + vida_enemy);
                    System.out.println(enemigoEN.getNombre() + " a atacado a " + hu.getNombre() + " y a hecho " + daño_enemy);
                    System.out.println("La vida de " + hu.getNombre() + " es de " + vida_player);
                    if(vida_enemy < 0){
                        System.out.println("El ganador es " + hu.getNombre());
                        return 1;
                    }else if(vida_player < 0){
                        System.out.println("El ganador es " + enemigoEN.getNombre());
                        return 2;
                    }
                }
            }else if(numero == 1){
                System.out.println("Y su enemigo sera " + enemigoEL.getNombre() + " el elfo guerrero perteneciente al reino de " + enemigoEL.getReino());
                vida_player = hu.getVida(); vida_enemy = enemigoEL.getVida(); daño_player = hu.getDaño(); daño_enemy = enemigoEL.getDaño();
                for(int i = 1;i < 11; i++){
                    System.out.println("***RONDA " + i + "***");
                    vida_enemy = vida_enemy - daño_player;
                    vida_player = vida_player - daño_enemy;
                    daño_player = daño_player - 1;
                    System.out.println("El daño a sido reducido en 1");
                    System.out.println(hu.getNombre() + " a atacado a " + enemigoEL.getNombre() + " y a hecho " + daño_player);
                    System.out.println("La vida de " + enemigoEL.getNombre() + " es de " + vida_enemy);
                    System.out.println(enemigoEL.getNombre() + " a atacado a " + hu.getNombre() + " y a hecho " + daño_enemy);
                    System.out.println("La vida de " + hu.getNombre() + " es de " + vida_player);
                    if(vida_enemy < 0){
                        System.out.println("El ganador es " + hu.getNombre());
                        return 1;
                    }else if(vida_player < 0){
                        System.out.println("El ganador es " + enemigoEL.getNombre());
                        return 2;
                    }
                }
            }
        }
        return 0;
    }
}
