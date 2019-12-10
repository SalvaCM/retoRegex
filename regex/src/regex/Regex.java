package regex;

public class Regex {
	Expresiones expresiones = new Expresiones();
	public Regex() {
		
	}
	public boolean validarPatron(String expresion) {
		for (int i = 0; i <= expresiones.expresiones.size(); i++) {

			if (expresiones.expresiones.get(i).equals(expresion))
			{
				System.out.println("Bien escrito");
				return true;
			}
		}
		System.out.println("Expresion mal construida");
		return false;
		
	}
	public boolean validarCadena(String expresion,String cadena) {
		
		if ()
		{
			return true;
		}
		else
		{
			System.out.println("Cadena no pasa validacion");
			return false;
		}
	}
}
