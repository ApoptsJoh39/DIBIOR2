package src.com.DAO;

public class DateBasic {

	private String microorganismoInoculo;
	private String nombreDesarrollador;
	private String sustratoOptimo;
	private Double optimoPh;
	
	public DateBasic(String microorganismoInoculo, String nombreDesarrollador, String sustratoOptimo, Double optimoPh) {
		super();
		this.microorganismoInoculo = microorganismoInoculo;
		this.nombreDesarrollador = nombreDesarrollador;
		this.sustratoOptimo = sustratoOptimo;
		this.optimoPh = optimoPh;
	}

	public String getMicroorganismoInoculo() {
		return microorganismoInoculo;
	}

	public void setMicroorganismoInoculo(String microorganismoInoculo) {
		this.microorganismoInoculo = microorganismoInoculo;
	}

	public String getNombreDesarrollador() {
		return nombreDesarrollador;
	}

	public void setNombreDesarrollador(String nombreDesarrollador) {
		this.nombreDesarrollador = nombreDesarrollador;
	}

	public String getSustratoOptimo() {
		return sustratoOptimo;
	}

	public void setSustratoOptimo(String sustratoOptimo) {
		this.sustratoOptimo = sustratoOptimo;
	}

	public Double getOptimoPh() {
		return optimoPh;
	}

	public void setOptimoPh(Double optimoPh) {
		this.optimoPh = optimoPh;
	}

	@Override
	public String toString() {
		return "DateBasic [microorganismoInoculo=" + microorganismoInoculo + ", nombreDesarrollador="
				+ nombreDesarrollador + ", sustratoOptimo=" + sustratoOptimo + ", optimoPh=" + optimoPh + "]";
	}
	
	
	
}

