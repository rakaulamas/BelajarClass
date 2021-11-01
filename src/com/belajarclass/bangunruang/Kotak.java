package com.belajarclass.bangunruang;

public class Kotak extends BangunRuang implements BangunDuaDimensi{
	
	public Kotak(double panjang,double lebar) {			//set nya otomatis
		this.setPanjang(panjang);
		this.setLebar(lebar);
	}
	
	public Kotak(){			//set nya manual ( cara ke 2 )						
		
	}
	
	
//	@Override
//	public void printLuas() {
//		System.out.println("Luas dari kotak adalah = "+ this.hitungLuas());
//	}
//	
	
	@Override
	public double hitungLuas() {
//		return super.hitungLuas();
		return this.getPanjang() * this.getPanjang();
	}
	
	public double keliling() {
		return this.getPanjang() + this.getLebar();
	}
	
	

	@Override
	public void showLuas() {
		System.out.println("Luas Kotak = "+ this.hitungLuas());
		System.out.println("Keliling Kotak = "+this.keliling());
		System.out.println();
	}
	
	
	public void draw() {
		for(int i=0; i<this.getPanjang(); i++) {
			for(int j=0; j<this.getPanjang(); j++) {
			System.out.print("*");
		}
		System.out.println();
	}
		System.out.println();
}
	
}
