package src.com.DAO;

public class Air_Lift extends DateBasic{
	
	private  String luzAplicable;
	private String difusorEntra;
	private Double alturaTanque;
	private Double alturaRiser;
	private Double diametroDownconer;
	private Double diametroRiser; 
	private Double porcentajeOperacional;
	private Double volumenTotal;
	private Double volumenOperacional; 
	private static Double diametroRiserConsB;
	
	public Air_Lift(String microorganismoInoculo, String nombreDesarrollador, String sustratoOptimo, Double optimoPh,
			String luzAplicable, String difusorEntra, Double alturaTanque, Double alturaRiser,
			Double diametroDownconer, Double diametroRiser, Double porcentajeOperacional, Double volumenTotal,
			Double volumenOperacional) {
		super(microorganismoInoculo, nombreDesarrollador, sustratoOptimo, optimoPh);
		this.luzAplicable = luzAplicable;
		this.difusorEntra = difusorEntra;
		this.alturaTanque = alturaTanque;
		this.alturaRiser = alturaRiser;
		this.diametroDownconer = diametroDownconer;
		this.diametroRiser = diametroRiser;
		this.porcentajeOperacional = porcentajeOperacional;
		this.volumenTotal = volumenTotal;
		this.volumenOperacional = volumenOperacional;
	}

	public String getLuzAplicable() {
		return luzAplicable;
	}

	public void setLuzAplicable(String luzAplicable) {
		this.luzAplicable = luzAplicable;
	}

	public String getDifusorEntra() {
		return difusorEntra;
	}

	public void setDifusorEntra(String difusorEntra) {
		this.difusorEntra = difusorEntra;
	}

	public Double getalturaTanque() {
		return alturaTanque;
	}

	public void setalturaTanque(Double alturaTanque) {
		this.alturaTanque = alturaTanque;
	}

	public Double getAlturaRiser() {
		return alturaRiser;
	}

	public void setAlturaRiser(Double alturaRiser) {
		this.alturaRiser = alturaRiser;
	}

	public Double getDiametroDownconer() {
		return diametroDownconer;
	}

	public void setDiametroDownconer(Double diametroDownconer) {
		this.diametroDownconer = diametroDownconer;
	}

	public Double getDiametroRiser() {
		return diametroRiser;
	}

	public void setDiametroRiser(Double diametroRiser) {
		this.diametroRiser = diametroRiser;
	}

	public Double getporcentajeOperacional() {
		return porcentajeOperacional;
	}

	public void setporcentajeOperacional(Double porcentajeOperacional) {
		this.porcentajeOperacional = porcentajeOperacional;
	}

	public Double getvolumenTotal() {
		return volumenTotal;
	}

	public void setvolumenTotal(Double volumenTotal) {
		this.volumenTotal = volumenTotal;
	}

	public Double getvolumenOperacional() {
		return volumenOperacional;
	}

	public void setvolumenOperacional(Double volumenOperacional) {
		this.volumenOperacional = volumenOperacional;
	}

	public static Double getDiametroRiserConsB() {
		return diametroRiserConsB;
	}

	public static void setDiametroRiserConsB(Double diametroRiserConsB) {
		Air_Lift.diametroRiserConsB = diametroRiserConsB;
	}

	@Override
	public String toString() {
		return "Air_Lift [luzAplicable=" + luzAplicable + ", difusorEntra=" + difusorEntra + ", alturaTanque="
				+ alturaTanque + ", alturaRiser=" + alturaRiser + ", diametroDownconer=" + diametroDownconer
				+ ", diametroRiser=" + diametroRiser + ", porcentajeOperacional=" + porcentajeOperacional
				+ ", volumenTotal=" + volumenTotal + ", volumenOperacional=" + volumenOperacional
				+ ", getMicroorganismoInoculo()=" + getMicroorganismoInoculo() + ", getNombreDesarrollador()="
				+ getNombreDesarrollador() + ", getSustratoOptimo()=" + getSustratoOptimo() + ", getOptimoPh()="
				+ getOptimoPh() + ", hashCode()="
				+ hashCode();
	}


	
	
	
	
	
}
