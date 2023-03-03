package convertidor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Medidas {
		
		private final double kilometro=0.001;
		private final double hectometro=0.01;
		private final double decametro=0.1;
		private final double metro=1;
		private final double decimetro=10;
		private final double centimetro=100;
		private final double milimetro=1000;
		private Map<String,Double> medidas= new HashMap<>();
		
		
		public Medidas() {
			this.medidas= new HashMap<>();
			agregar_moneda();
		}
		
		public void agregar_moneda() {
			this.medidas.put("Kilómetro", this.kilometro);
			this.medidas.put("Hectómetro", this.hectometro);
			this.medidas.put("Decámetro", this.decametro);
			this.medidas.put("Metro", this.metro);
			this.medidas.put("Decímetro", this.decimetro);
			this.medidas.put("Centímetro", this.centimetro);
			this.medidas.put("Milímetro", this.milimetro);
		}
		
		public List<String> lista_medidas(){
			List<String> medidas= new ArrayList<String>();
			for (String m : this.medidas.keySet()) {
				medidas.add(m);
			}
			return medidas;
		}
		
		public static Double convertir(Double convertir_de, Double cantidad, Double convertir_a) {
			return (cantidad/convertir_de)*convertir_a;
		}

		public Map<String, Double> getMedidas() {
			return medidas;
		}

		public void setMedidas(Map<String, Double> medidas) {
			this.medidas = medidas;
		}
		
		/*
		 * public static void main(String[] args) { System.out.println(new
		 * Medidas().lista_medidas()); }
		 */

	

}
