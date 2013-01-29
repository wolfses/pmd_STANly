package net.sourceforge.pmd.lang.java.rule.stanly.metrics;

public class ClassMetric {
	private int Classes;
	private int Methods;
	private int Fields;
	private int LOC;
	private float Fat;
	private int AfferentCoupling;
	private int EfferentCoupling;
	public int getClasses() {
		return Classes;
	}
	public void setClasses(int classes) {
		Classes = classes;
	}
	public int getMethods() {
		return Methods;
	}
	public void setMethods(int methods) {
		Methods = methods;
	}
	public int getFields() {
		return Fields;
	}
	public void setFields(int fields) {
		Fields = fields;
	}
	public int getLOC() {
		return LOC;
	}
	public void setLOC(int lOC) {
		LOC = lOC;
	}
	public void addLOC(int lOC) {
		LOC += lOC;
	}
	public float getFat() {
		return Fat;
	}
	public void setFat(float fat) {
		Fat = fat;
	}
	public int getAfferentCoupling() {
		return AfferentCoupling;
	}
	public void setAfferentCoupling(int afferentCoupling) {
		AfferentCoupling = afferentCoupling;
	}
	public int getEfferentCoupling() {
		return EfferentCoupling;
	}
	public void setEfferentCoupling(int efferentCoupling) {
		EfferentCoupling = efferentCoupling;
	}
	public float getWMC() {
		return WMC;
	}
	public void setWMC(float wMC) {
		WMC = wMC;
	}
	public float getDIT() {
		return DIT;
	}
	public void setDIT(float dIT) {
		DIT = dIT;
	}
	public float getNOC() {
		return NOC;
	}
	public void setNOC(float nOC) {
		NOC = nOC;
	}
	public float getCBO() {
		return CBO;
	}
	public void setCBO(float cBO) {
		CBO = cBO;
	}
	public float getRFC() {
		return RFC;
	}
	public void setRFC(float rFC) {
		RFC = rFC;
	}
	public float getLCOM() {
		return LCOM;
	}
	public void setLCOM(float lCOM) {
		LCOM = lCOM;
	}
	private float WMC;
	private float DIT;
	private float NOC;
	private float CBO;
	private float RFC;
	private float LCOM;
}