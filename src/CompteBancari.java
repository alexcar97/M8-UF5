/**
 * Aquesta classe genera un objectes del tipus CompteBancari 
 * @author alex
 * @version 2.1_ACT09
 */
public class CompteBancari {

    /**
     * Els atribut que tindra aquesta clase
     */
    private String nom;
    private int numSecret;
    private static float saldoInicial = (float) 100.0;
    private float saldo;
    /**
     * Constructor de CompteBancari amb els dos valors necesaris per crerar l'objecte 
     * @param nom
     * @param numSecret 
     */
    public CompteBancari(String nom, int numSecret) {
        this.nom = nom;
        this.numSecret = numSecret;
        this.saldo = CompteBancari.saldoInicial;
    }
    /**
     * Metode per obtenir el valor de l'atribut nom
     * @return retorna el valor de l'atribut nom
     */
    public String getNom() {
        return this.nom;
    }
    /**
     * Metode per obtenir el valor de l'atribut numeroSecret
     * @return retorna el valor de l'atribut numeroSecret
     */
    public int getNumSecret() {
        return this.numSecret;
    }
    /**
     * Metode per obtenir el valor de l'atribut saldo
     * @return retorna el valor de l'atribut saldo
     */
    public float consultarSaldo() {
        return this.saldo;
    }
    /**
     * Metode per obtenir el valor de l'atribut saldoInicial
     * @return retorna el valor de l'atribut saldoInicial
     */

    public static float getSaldoInicial() {
        return CompteBancari.saldoInicial;
    }
    /**
     * Metode per donar un nou valor a l'atribut saldoInicial
     * @param saldoIncial nou valor de l'atribut saldoinicial
     */

    public static void setSaldoInicial(float saldoIncial) {
        CompteBancari.saldoInicial = saldoIncial;
    }
    /**
     * Motode que retorna un string amb les dades de nom, numSecret, saldo
     * @return string amb les dades de nom, numSecret, saldo
     */

    public String mostrarDades() {
        return ("El propietari es diu: " + this.nom + " amb número secret: "
                + this.numSecret + ". El saldo actual es: " + this.saldo);
    }
    /**
     * Metode per augmenar el valor de saldo, sempre que la quantitat sigui mes gran que 0
     * @param quantitat valor per sumar a saldo
     * @return retorna true si l'operacio s'ha pogut realitzar, si no retorna false
     */
    public boolean ingressar(float quantitat) {
        boolean resultat = false;
        if (quantitat >= 0) {
            this.saldo = this.saldo + quantitat;
            resultat = true;
        }
        return resultat;
    }
    /**
     * Metode per disminuir el valor de saldo, sempre que la quantitat sigui mes gran que 0
     * @param quantitat valor per restar a saldo
     * @return retorna true si l'operacio s'ha pogut realitzar, si no retorna false
     */

    public boolean extreure(float quantitat) {
        boolean resultat = false;
        if (quantitat >= 0) {
            this.saldo = this.saldo - quantitat;
            resultat = true;
        }
        return resultat;
    }
    public void saludo2(){
        System.out.println("Hola");
    }
}
