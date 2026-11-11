package logica;

public class Parcial {

	public String raices(double a, double b, double c) throws Exception {
		if(a == 0) {
			throw new Exception("a no puede ser 0");
		}else {
			double discriminante = b*b - 4*a*c;
			if(discriminante < 0) {
				throw new Exception("No tiene raices reales");
			}else {
				double x1 = (-b + Math.sqrt(discriminante)) / (2*a);
				double x2 = (-b - Math.sqrt(discriminante)) / (2*a);
				   return "x=" + x1 + ", x=" + x2;
			}
		}
	}
}