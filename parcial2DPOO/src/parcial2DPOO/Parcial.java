package parcial2DPOO;

public class Parcial {
	
	
	
	public double[] encontrarRaices (double a,double b,double c) {
		
		try {
			if (valorValido(a)){
				double raiz1 = 0;
				try {
					raiz1 = encontarRaiz1 (a,b,c);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				float raiz2 = 0;
				try {
					raiz1 = encontarRaiz2 (a,b,c);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		double[] resultado = {raiz1,raiz2};
		
		return resultado ;
	
	}
	
	public boolean valorValido(double a) throws Exception {
		if(a == 0) {
			throw new Exception("no es una cuadratica");
		}else {
			return true;
		}
	}

	
	public double encontarRaiz1 (double a,double b,double c) throws Exception {
		
		if (((Math. pow(b, 2))-4*a*c) <0){
			throw new Exception("no hay solucion real");
		
		}else {
			double resultado= ((-b-Math.sqrt((Math. pow(b, 2))-4*a*c )))/(2*a);
			return resultado;
		}
		
	}
		
	public double encontarRaiz2 (double a,double b,double c) throws Exception {
		
		if (((Math. pow(b, 2))-4*a*c) <0){
			throw new Exception("no hay solucion real");
		
		}else {
			double resultado= ((-b-Math.sqrt((Math. pow(b, 2))-4*a*c )))/(2*a);
			return resultado;
		}
		
	}
}
