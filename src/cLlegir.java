import java.io.*;
/**
 * Aquesta classe ens permet llegir dades introduides per l'usuari 
 * @author alex
 * @version 2.1_ACT09
 */
public class cLlegir
{
    /**
     * Metote que permet llegir dades en format String
     * @return retorna el String introduit per l'usuari
     */
  public static String dato()
  {
    String sdato = "";
    try
    {
      // Definir un flujo de caracteres de entrada: flujoE
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader flujoE = new BufferedReader(isr);
      // Leer. La entrada finaliza al pulsar la tecla Entrar
      sdato = flujoE.readLine();
    }
    catch(IOException e)
    {
      System.err.println("Error: " + e.getMessage());
    }
    return sdato; // devolver el dato tecleado
  }
  /**
   * Metode que permet llegir dades en format Short
   * @return retorna el Short introduit per l'usuari
   */
  public static short datoShort()
  {
    try
    {
      return Short.parseShort(dato());
    }
    catch(NumberFormatException e)
    {
      return Short.MIN_VALUE; // valor mas pequeño
    }
  }
  /**
   * Metode que permet llegir dades en format int
   * @return retorna el Int introduit per l'usuari
   */

  public static int datoInt()
  {
    try
    {
      return Integer.parseInt(dato());
    }
    catch(NumberFormatException e)
    {
      return Integer.MIN_VALUE; // valor m�s peque�o
    }
  }
  /**
   * Metode que permet llegir dades en format Long
   * @return retorna el Long introduit per l'usuari
   */
  public static long datoLong()
  {
    try
    {
      return Long.parseLong(dato());
    }
    catch(NumberFormatException e)
    {
      return Long.MIN_VALUE; // valor m�s peque�o
    }
  }
  /**
   * Metode que permet llegir dades en format Float
   * @return retorna el Float introduir per l'usuari
   */
  public static float datoFloat()
  {
    try
    {
      Float f = new Float(dato());
      return f.floatValue();
    }
    catch(NumberFormatException e)
    {
      return Float.NaN; // No es un N�mero; valor float.
    }
  }
  /**
   * Metode que permet llegir dades en format Double
   * @return retorna el Double introduit per l'usuari
   */

  public static double datoDouble()
  {
    try
    {
      Double d = new Double(dato());
      return d.doubleValue();
    }
    catch(NumberFormatException e)
    {
      return Double.NaN; // No es un N�mero; valor double.
    }
  }
} //cLlegir
