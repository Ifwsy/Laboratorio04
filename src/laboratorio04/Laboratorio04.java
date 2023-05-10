package laboratorio04;

import java.util.*;

public class Laboratorio04 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Metodos m = new Metodos();
        String nombre, opc_raza, raza = null, opc_arma, arma = null, reino = null, clan = null, casta = null;
        int daño = 0, vida = 0, bonificacion = 0, aumVida, aumDaño, kom;
        
        //NOMBRE
        System.out.println("Ingrese su nombre");
        nombre = leer.nextLine();
        
        //RAZA
        System.out.println("Ingrese su raza\n-Enano\n-Elfo\n-Humano");
        opc_raza = leer.nextLine();
        while(!opc_raza.equals("Enano") && !opc_raza.equals("Elfo") && !opc_raza.equals("Humano")){
            System.out.println("Opción incorrecta!!!");
            System.out.println("Ingrese su raza\n-Enano\n-Elfo\n-Humano");
            opc_raza = leer.nextLine();
        }
        if("Enano".equals(opc_raza)){
            raza = "Enano";
            vida = 150;
            System.out.println("Ingrese el nombre del clan al que pertenece: ");
            clan = leer.nextLine();
            System.out.println("Su raza sera enano");
        }else if("Elfo".equals(opc_raza)){
            raza = "Elfo";
            vida = 150;
            System.out.println("Ingrese el nombre de su reino: ");
            reino = leer.nextLine();
            System.out.println("Su raza sera elfo");
        }else if("Humano".equals(opc_raza)){
            raza = "Humano";
            vida = 150;
            System.out.println("Ingrese el nombre de su casta (familia): ");
            casta = leer.nextLine();
            System.out.println("Su raza sera humano");
        }
        
        //ARMA
        System.out.println("Elija su arma\n-Espada\n-Arco\n-Lanza");
        opc_arma = leer.nextLine();
        while(!opc_arma.equals("Espada") && !opc_arma.equals("Arco") && !opc_arma.equals("Lanza")){
            System.out.println("Opción incorrecta!!!");
            System.out.println("Elija su arma\n-Espada\n-Arco\n-Lanza");
            opc_arma = leer.nextLine();
        }
        if("Espada".equals(opc_arma)) {
            int numero = (int)(Math.random()*38);
            arma = "Espada";
            daño = numero;
            System.out.println("El daño sera de " + numero);
        }else if("Arco".equals(opc_arma)) {
            int numero = (int)(Math.random()*25);
            arma = "Arco";
            daño = numero;
            System.out.println("El daño sera de " + numero);
        }else if("Lanza".equals(opc_arma)) {
            int numero = (int)(Math.random()*33);
            arma = "Lanza";
            daño = numero;
            System.out.println("El daño sera de " + numero);
        }
        
        //OBJETOS (4 STRING Y 3 INT)
        Enano en = new Enano(clan,nombre,raza,arma,vida,daño,bonificacion);
        Elfo el = new Elfo(reino,nombre,raza,arma,vida,daño,bonificacion);
        Humano hu = new Humano(casta,nombre,raza,arma,vida,daño,bonificacion);
        
        if("Enano".equals(raza)){
            System.out.println("Ingrese el aumento de vida deseado (Este debe estar entre 50 y 100)");
            aumVida = leer.nextInt();
            while(aumVida <= 49 || aumVida >= 101){
                System.out.println("Ingrese el aumento de vida deseado (Este debe estar entre 50 y 100)");
                aumVida = leer.nextInt();
            }
            System.out.println("La vida del enano era de 150 pero quedo en " + en.aumentaVida(en,aumVida));
            en.setBonificacion(aumVida);
            en.setVida(en.aumentaVida(en,aumVida));
            
            //Metodos
            kom = en.Combate(en, el, hu);
            if(kom == 0){
                System.out.println("Empataron");
            }else if(kom == 1){
                System.out.println(en.VictoriaEN(en));  
            }else if(kom == 2){
                System.out.println(en.DerrotaEN(en));
            }
            
        }else if("Elfo".equals(raza)){
            System.out.println("La vida del elfo era de 150 pero quedo en " + el.quitaVida(el));
            
            el.setBonificacion(el.quitaVida(el));
            el.setVida(el.quitaVida(el));
            
            //Metodos
            kom = el.Combate(en, el, hu);
            if(kom == 0){
                System.out.println("Empataron");
            }else if(kom == 1){
                System.out.println(el.VictoriaEL(el));
            }else if(kom == 2){
                System.out.println(el.DerrotaEL(el) + "\n" + el.HistoriaEL(el));
            }
        }else if("Humano".equals(raza)){
            
            System.out.println("Ingrese el aumento de daño deseado (Este debe estar entre 5 y 15)");
            aumDaño = leer.nextInt();
            while(aumDaño <= 4 || aumDaño >= 16){
                System.out.println("Ingrese el aumento de daño deseado (Este debe estar entre 5 y 15)");
                aumDaño = leer.nextInt();
            }
            
            System.out.println("El daño del humano era de " + hu.getDaño() + " pero quedo de " + hu.superBono(hu, aumDaño));
            hu.setBonificacion(hu.superBono(hu, aumDaño));
            hu.setDaño(hu.superBono(hu, aumDaño));
            
            //Metodos
            kom = hu.Combate(en, el, hu);
            if(kom == 0){
                System.out.println("Empataron");
            }else if(kom == 1){
                System.out.println(hu.VictoriaHU(hu));
            }else if(kom == 2){
                System.out.println(hu.DerrotaHU(hu));
                System.out.println("Elija nuevamente su armamento");
                System.out.println("-Espada\n-Arco\n-Lanza");
                opc_arma = leer.nextLine();
                while(!opc_arma.equals("Espada") && !opc_arma.equals("Arco") && !opc_arma.equals("Lanza")){
                    System.out.println("Opción incorrecta!!!");
                    System.out.println("Elija su arma\n-Espada\n-Arco\n-Lanza");
                    opc_arma = leer.nextLine();
                }
            }
        }
        
    }//LLAVE DEL PSV MAIN
}//LLAVE DE PUBLIC CLASS
