
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
        while(cont < conjunto.length && noEsta)
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
        while(cont < conjunto.length && !contiene)
        {
            if (conjunto[cont] == elemento)
            {
                contiene = true;
            }
            cont++;
        }
        return contiene;
    }
    
    /**
     * devuelve true o false segun si la lista esta vacia o llena.
     */
    public boolean isEmpty()
    {
        return (conjunto.length == 0);
    }
    
    /**
     * Elimina un elemento y devuelve trueo false segun si esta el elemento en la lista
     */
    public boolean remove(int elemento)
    {
        boolean contiene = false;
        //COMPROBAMOS SI ESTA O NO EL VALOR EN LA LISTA
        int cont = 0;
        int posicion = 0;
        while(cont < conjunto.length && !contiene)
        {
            if (conjunto[cont] == elemento)
            {
                posicion = cont;
                contiene = true;
            }
            cont++;
        }
       
        // SI EL VALOR NO ESTA LO AÑADIMOS
        if(contiene)
        {
            // hacemos la copia de la lista que ya teniamos en la copia hasta el valor que tenemos que eliminar
            int[] copia = new int[conjunto.length - 1];
            for(cont = 0 ;cont < posicion; cont++)
            {
                copia[cont]=conjunto[cont];
            }
            // seguimos haciendo la copia del resto de numeros saltandonos el que queremos eliminar
            for(cont = posicion; cont < copia.length; cont++)
            {
                copia[cont]=conjunto[cont+1];
            }
            // copiamos la lista copia a la original con el valor nuevo añadido.
            conjunto = copia;
        }
        return contiene;
    }
    
    /**
     * Devuelve un entero que es el numero de elementos del conjunto
     */
    public int size()
    {
        return conjunto.length;
    }
    
    /**
     * devuelve una cadena conteniendo todos los elementos del conjunto separados por comas y entre corchetes
     */
    public String toString()
    {
        String todo = "[";
        for (int cont = 0; cont < conjunto.length; cont++)
        {
            if (cont != conjunto.length-1)
            {
                todo += conjunto[cont] + ",";
            }
            else
            {
                todo += conjunto[cont] + "]";
            }
        }
        return todo;
    }
    
    /**
     * Devuelve true o false dependiendo si el conjunto es igual al que tenemos
     */
    public boolean equals(MiHashSet otroConjunto)
    {
        boolean igual = true;
        int cont = 0;
        if (conjunto.length == otroConjunto.size())
        {
            while (cont < conjunto.length && igual)
            {
                if (!otroConjunto.contains(conjunto[cont]))
                {
                    igual = false;
                }
                cont++;
            }
        }
        else
        {
            igual = false;
        }
        return igual;
    }
}
