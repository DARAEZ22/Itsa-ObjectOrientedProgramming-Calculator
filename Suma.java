package operaciones;

public class Suma extends Operacion_Base implements Operacion{
  
	public Suma(double valorA, double valorB) {
		super(valorA, valorB);
		
	}
	
@Override
public void calcular() {
System.out.println("El resultado de la suma es: "+(valorA+valorB));	
//return valorA+valorB; -->  this is another way to do it.
}

	



	
}
