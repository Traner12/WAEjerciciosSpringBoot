package edu.pe.idat.model;

public class PromedioFinalForm {

	 private Double evaC1;
	 private Double evaC2;
	 private Double evaC3;
	 private Double evaF;
	public Double getEvaC1() {
		return evaC1;
	}
	public void setEvaC1(Double evaC1) {
		this.evaC1 = evaC1;
	}
	public Double getEvaC2() {
		return evaC2;
	}
	public void setEvaC2(Double evaC2) {
		this.evaC2 = evaC2;
	}
	public Double getEvaC3() {
		return evaC3;
	}
	public void setEvaC3(Double evaC3) {
		this.evaC3 = evaC3;
	}
	public Double getEvaF() {
		return evaF;
	}
	public void setEvaF(Double evaF) {
		this.evaF = evaF;
	}
	public PromedioFinalForm(Double evaC1, Double evaC2, Double evaC3, Double evaF) {
		super();
		this.evaC1 = evaC1;
		this.evaC2 = evaC2;
		this.evaC3 = evaC3;
		this.evaF = evaF;
	}
	public PromedioFinalForm() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	 
	
}
