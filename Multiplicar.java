package operaciones;

public class Multiplicar extends Operacion_Base implements Operacion{

	
	public Multiplicar(double valorA, double valorB) {
		super(valorA, valorB);
		
	}
	
	@Override
	public void calcular() {
		System.out.println("El resultado de la multiplicación es: "+valorA*valorB);
		
	/*public double calcular(){ 
	return valorA*valorB; -->  this is another way to do it.
	}	
	                               */
	}
}
