package regex;

public class Principal {

	public static void main(String[] args) {
		Expresiones expresiones = new Expresiones();
		String expresionOK = "/d[3]";
		String expresionNotOK = "/d[3-2],/!d[5],/!c";
		String cadena = "nfkjdaso";
		expresiones.validarRegex(expresionOK);
		expresiones.validarRegex(expresionNotOK);
	}

}
