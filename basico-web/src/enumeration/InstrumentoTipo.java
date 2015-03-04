package enumeration;

public enum InstrumentoTipo {
	GUITARRA, BATERIA, BAJO;
	
	public static InstrumentoTipo getTipo(int index) {
		if (index == 0)
			return GUITARRA;
		else if (index == 1)
			return BATERIA;
		else 
			return BAJO;
	}
}
