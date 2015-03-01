
/**
 * Write a description of class MiHashSet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MiHashSet
{
    // instance variables - replace the example below with your own
    private int[] conjunto;

    /**
     * Constructor for objects of class MiHashSet
     */
    public MiHashSet()
    {
        // initialise instance variables
        conjunto = new int[0];
    }

    /**
     * introduce el valor int a la lista y devuelve true o false segun si estaba o no el valor en la lista
     * @valor valor que queremos introducir
     */
    public boolean add(int valor)
    {
        boolean noEsta = true;
        //COMPROBAMOS SI ESTA O NO EL VALOR EN LA LISTA
        int cont = 0;
        while(cont < conjunto.length)
        {
            if (conjunto[cont] == valor)
            {
                noEsta = false;
            }
            cont++;
        }
       
        // SI EL VALOR NO ESTA LO AÑADIMOS
        if(noEsta)
        {
            // hacemos la copia de la lista que ya teniamos en la copia
            int[] copia = new int[conjunto.length + 1];
            for(cont = 0 ;cont < conjunto.length; cont++)
            {
                copia[cont]=conjunto[cont];
            }
            // añadimos el valor introducido por el usuario a la nueva lista.
            copia[cont]=valor;
            // copiamos la lista copia a la original con el valor nuevo añadido.
            conjunto = copia;
        }
        return noEsta;
    }
    /**
     * Vacia la lista
     */
    public void clear()
    {
        conjunto = new int[0];
    }
    /**
     * devuelve true o false segun si la lista contiene un elemento o no.
     */
    public boolean contains(int elemento)
    {
        boolean contiene = false;
        //COMPROBAMOS SI ESTA O NO EL VALOR EN LA LISTA
        int cont = 0;
        while(cont < conjunto.length)
        {
            if (conjunto[cont] == elemento)
            {
                contiene = true;
            }
            cont++;
        }
        return contiene;
    }
}
