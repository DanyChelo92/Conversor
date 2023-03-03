package convertidor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Temperatura {

	private final double celsius=0;
	private final double fahrenheit=32;
	private final double kelvin=273.15;
	private Map<String,Double> temperatura= new HashMap<>();
	
	
	public Temperatura() {
		this.temperatura= new HashMap<>();
		agregar_moneda();
	}
	
	public void agregar_moneda() {
		this.temperatura.put("Celcius", this.celsius);
		this.temperatura.put("Fahrenheit", this.fahrenheit);
		this.temperatura.put("Kelvin", this.kelvin);
		
	}
	
	public Map<String, Double> getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(Map<String, Double> temperatura) {
		this.temperatura = temperatura;
	}

	public List<String> lista_temperaturas(){
		List<String> temperaturas= new ArrayList<String>();
		for (String m : this.temperatura.keySet()) {
			temperaturas.add(m);
		}
		return temperaturas;
	}
	
	public static Double convertir(Double convertir_de, Double cantidad, Double convertir_a) {
		double total;
		if (convertir_de==32.0 && convertir_a==32.0) {
			total=cantidad;
		}
		else if (convertir_de==32.0){
			total= (cantidad-32)*5/9+convertir_a;
			System.out.println("de ---- a");
		}
		else if (convertir_a==32.0) {
			total= (cantidad-convertir_de)*9/5+32;
			System.out.println("a----de");
		}
		else {
			total= cantidad-convertir_a+convertir_de;
		}
		return total;
	
	/*
	 * public static void main(String[] args) { System.out.println(new
	 * Temperatura().lista_temperaturas()); }
	 */

	}

}
