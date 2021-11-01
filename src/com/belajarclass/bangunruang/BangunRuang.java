package com.belajarclass.bangunruang;

abstract class BangunRuang {
	
	private double panjang;
	private double lebar;
	private double tinggi;
	
	public BangunRuang() {
		
	}
//	COntoh Encapsulation
	
	public double hitungLuas() {
		return 0.0;
	}

	public double keliling() {
	return 0.0;
	}

//	protected double hitungLuas() {
//		return 0.0;
//	}
	
	
	
	
//	GETTER & SETTER	
	public void printLuas() {
		System.out.println("Nilai luasnya = "+hitungLuas());
	}

	public double getPanjang() {
		return panjang;
	}

	public void setPanjang(double panjang) {
		this.panjang = panjang;
	}

	public double getLebar() {
		return lebar;
	}

	public void setLebar(double lebar) {
		this.lebar = lebar;
	}

	public double getTinggi() {
		return tinggi;
	}

	public void setTinggi(double tinggi) {
		this.tinggi = tinggi;
	}
	
	
	

	
	
	
	
	
	
}
