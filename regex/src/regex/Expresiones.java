package regex;

import java.util.ArrayList;

public class Expresiones {

	private ArrayList<String> expresiones = new ArrayList<String>();
	private static final String EXPRESION_SEPARATOR = ",";

	public Expresiones() {
		expresiones.add("/d");
		expresiones.add("/!d");
		expresiones.add("/c");
		expresiones.add("/!c");
		expresiones.add("/*");
		expresiones.add("/!*");
	}

	public boolean validarRegex(String regex) {
		String[] regexParts = regex.split(EXPRESION_SEPARATOR);
		for (String part : regexParts) {
			if (!evaluarRegex(part)) {
				System.out.println("Mal construido");
				return false;
			}
		}
		System.out.println("Bien construido");
		return true;
	}

	private boolean evaluarRegex(String regex) {
		for (String exp : expresiones) {
			if (regex.startsWith(exp)) 
				if (regex.length() != exp.length()) {
					if (evaluarRango(regex.substring(exp.length())))
						return true;
				}else
					return true;
		}
		return false;
	}

	private boolean evaluarRango(String rango) {
		if (rango.startsWith("[") && rango.endsWith("]")) {
			String substring = rango.substring(1, rango.length() - 1);
			String[] numeros = substring.split("-");
			for (String num : numeros) {
				try {
					Integer.parseInt(num);
				} catch (NumberFormatException ex) {
					return false;
				}
			}
			return true;
		} else
			return false;
	}

}
