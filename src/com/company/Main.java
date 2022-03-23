package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var  Resultado = suma(20,60,80);
        System.out.println("Resultado de suma: " + Resultado);

       Coche miCoche = new Coche();
       miCoche.inCrementarpuertas();
       miCoche.inCrementarpuertas();
       System.out.println("Numero de Puertas: " + miCoche.puertas);


    }
    public static int suma(int a, int b, int c)
    {

        return a + b +c;
    }


}

class Coche
{
    public int puertas = 0;

    public void inCrementarpuertas()
    {
        this.puertas++;
    }
}
