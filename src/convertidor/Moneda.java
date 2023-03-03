package convertidor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Moneda {
	
	private final double dolar=1;
	private final double peso_arg=197.8371;
	private final double euro=0.94;
	private final double boliviano=6.9112;
	private final double yen_jp=136.6020;
	private final double peso_uru=38.9167;
	private final double peso_mx=18.1038;
	private final double peso_col=4819.8300;
	private final double peso_chi=812.8800;
	private final double libra_est=0.8354;
	private final double franco_suz=0.9413;
	private final double renminbi=6.9153;
	private Map<String,Double> moneda_valor= new HashMap<>();
	
	
	public Moneda() {
		this.moneda_valor= new HashMap<>();
		agregar_moneda();
	}
	
	public void agregar_moneda() {
		this.moneda_valor.put("Dolar", this.dolar);
		this.moneda_valor.put("Euro", this.euro);
		this.moneda_valor.put("Peso Argentino", this.peso_arg);
		this.moneda_valor.put("Peso Boliviano", this.boliviano);
		this.moneda_valor.put("Yen", this.yen_jp);
		this.moneda_valor.put("Peso Uruguayo", this.peso_uru);
		this.moneda_valor.put("Peso Mexicano", this.peso_mx);
		this.moneda_valor.put("Peso Colombiano", this.peso_col);
		this.moneda_valor.put("Peso Chileno", this.peso_chi);
		this.moneda_valor.put("Libra Esterlina", this.libra_est);
		this.moneda_valor.put("Franco Suizo", this.franco_suz);
		this.moneda_valor.put("Renminbi", this.renminbi);
	}
	
	public List<String> lista_monedas(){
		List<String> monedas= new ArrayList<String>();
		for (String m : this.moneda_valor.keySet()) {
			monedas.add(m);
		}
		return monedas;
	}
	
	public static Double convertir(Double convertir_de, Double cantidad, Double convertir_a) {
		return (cantidad/convertir_de)*convertir_a;
	}
	
	 public static void main(String[] args) { Moneda monedas= new Moneda();
	 System.out.println(monedas.moneda_valor.get("Yen")); }

	public Map<String, Double> getMoneda_valor() {
		return moneda_valor;
	}

	public void setMoneda_valor(Map<String, Double> moneda_valor) {
		this.moneda_valor = moneda_valor;
	}
	

}


