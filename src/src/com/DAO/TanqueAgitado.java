package src.com.DAO;

public class TanqueAgitado extends DateBasic{

	private Double volumenOperacionalTa;
	private Double volumenTotalTa;
	private Double diametroTanque;
	private Double diametroImpulsor;
	private Double alturaTanqueTa;
	private Double alturaLiquido;
	private Integer numeroDeflectores;
	private Double anchuraDeflectores; 
	private Double porcentajeOperacionalTa;
	private Double separacionPared_Deflectores;
	private Double longitudUtilAgitador;
	private Double distanciaAgitador_Base;
	private Double numeroAlabes;
	private Double anchuraAlabes;
	private Double longitudAlabes;
	private static Double tipoTurbina;
	public TanqueAgitado(String microorganismoInoculo, String nombreDesarrollador, String sustratoOptimo,
			Double optimoPh, Double volumenOperacionalTa, Double volumenTotalTa, Double diametroTanque,
			Double diametroImpulsor, Double alturaTanqueTa, Double alturaLiquido, Integer numeroDeflectores,
			Double anchuraDeflectores, Double porcentajeOperacionalTa, Double separacionPared_Deflectores,
			Double longitudUtilAgitador, Double distanciaAgitador_Base, Double numeroAlabes, Double anchuraAlabes,
			Double longitudAlabes) {
		super(microorganismoInoculo, nombreDesarrollador, sustratoOptimo, optimoPh);
		this.volumenOperacionalTa = volumenOperacionalTa;
		this.volumenTotalTa = volumenTotalTa;
		this.diametroTanque = diametroTanque;
		this.diametroImpulsor = diametroImpulsor;
		this.alturaTanqueTa = alturaTanqueTa;
		this.alturaLiquido = alturaLiquido;
		this.numeroDeflectores = numeroDeflectores;
		this.anchuraDeflectores = anchuraDeflectores;
		this.porcentajeOperacionalTa = porcentajeOperacionalTa;
		this.separacionPared_Deflectores = separacionPared_Deflectores;
		this.longitudUtilAgitador = longitudUtilAgitador;
		this.distanciaAgitador_Base = distanciaAgitador_Base;
		this.numeroAlabes = numeroAlabes;
		this.anchuraAlabes = anchuraAlabes;
		this.longitudAlabes = longitudAlabes;
	}
	public Double getVolumenOperacionalTa() {
		return volumenOperacionalTa;
	}
	public void setVolumenOperacionalTa(Double volumenOperacionalTa) {
		this.volumenOperacionalTa = volumenOperacionalTa;
	}
	public Double getVolumenTotalTa() {
		return volumenTotalTa;
	}
	public void setVolumenTotalTa(Double volumenTotalTa) {
		this.volumenTotalTa = volumenTotalTa;
	}
	public Double getDiametroTanque() {
		return diametroTanque;
	}
	public void setDiametroTanque(Double diametroTanque) {
		this.diametroTanque = diametroTanque;
	}
	public Double getDiametroImpulsor() {
		return diametroImpulsor;
	}
	public void setDiametroImpulsor(Double diametroImpulsor) {
		this.diametroImpulsor = diametroImpulsor;
	}
	public Double getalturaTanqueTa() {
		return alturaTanqueTa;
	}
	public void setalturaTanqueTa(Double alturaTanqueTa) {
		this.alturaTanqueTa = alturaTanqueTa;
	}
	public Double getAlturaLiquido() {
		return alturaLiquido;
	}
	public void setAlturaLiquido(Double alturaLiquido) {
		this.alturaLiquido = alturaLiquido;
	}
	public Integer getNumeroDeflectores() {
		return numeroDeflectores;
	}
	public void setNumeroDeflectores(Integer numeroDeflectores) {
		this.numeroDeflectores = numeroDeflectores;
	}
	public Double getAnchuraDeflectores() {
		return anchuraDeflectores;
	}
	public void setAnchuraDeflectores(Double anchuraDeflectores) {
		this.anchuraDeflectores = anchuraDeflectores;
	}
	public Double getPorcentajeOperacionalTa() {
		return porcentajeOperacionalTa;
	}
	public void setPorcentajeOperacionalTa(Double porcentajeOperacionalTa) {
		this.porcentajeOperacionalTa = porcentajeOperacionalTa;
	}
	public Double getSeparacionPared_Deflectores() {
		return separacionPared_Deflectores;
	}
	public void setSeparacionPared_Deflectores(Double separacionPared_Deflectores) {
		this.separacionPared_Deflectores = separacionPared_Deflectores;
	}
	public Double getLongitudUtilAgitador() {
		return longitudUtilAgitador;
	}
	public void setLongitudUtilAgitador(Double longitudUtilAgitador) {
		this.longitudUtilAgitador = longitudUtilAgitador;
	}
	public Double getDistanciaAgitador_Base() {
		return distanciaAgitador_Base;
	}
	public void setDistanciaAgitador_Base(Double distanciaAgitador_Base) {
		this.distanciaAgitador_Base = distanciaAgitador_Base;
	}
	public Double getNumeroAlabes() {
		return numeroAlabes;
	}
	public void setNumeroAlabes(Double numeroAlabes) {
		this.numeroAlabes = numeroAlabes;
	}
	public Double getAnchuraAlabes() {
		return anchuraAlabes;
	}
	public void setAnchuraAlabes(Double anchuraAlabes) {
		this.anchuraAlabes = anchuraAlabes;
	}
	public Double getLongitudAlabes() {
		return longitudAlabes;
	}
	public void setLongitudAlabes(Double longitudAlabes) {
		this.longitudAlabes = longitudAlabes;
	}
	public static Double getTipoTurbina() {
		return tipoTurbina;
	}
	public static void setTipoTurbina(Double tipoTurbina) {
		TanqueAgitado.tipoTurbina = tipoTurbina;
	}
	@Override
	public String toString() {
		return "TanqueAgitado [volumenOperacionalTa=" + volumenOperacionalTa + ", volumenTotalTa=" + volumenTotalTa
				+ ", diametroTanque=" + diametroTanque + ", diametroImpulsor=" + diametroImpulsor + ", alturaTanqueTa="
				+ alturaTanqueTa + ", alturaLiquido=" + alturaLiquido + ", numeroDeflectores=" + numeroDeflectores
				+ ", anchuraDeflectores=" + anchuraDeflectores + ", porcentajeOperacionalTa=" + porcentajeOperacionalTa
				+ ", separacionPared_Deflectores=" + separacionPared_Deflectores + ", longitudUtilAgitador="
				+ longitudUtilAgitador + ", distanciaAgitador_Base=" + distanciaAgitador_Base + ", numeroAlabes="
				+ numeroAlabes + ", anchuraAlabes=" + anchuraAlabes + ", longitudAlabes=" + longitudAlabes + "]";
	}
	
	
	
	
}
