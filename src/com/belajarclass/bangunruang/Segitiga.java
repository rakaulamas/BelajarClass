package com.belajarclass.bangunruang;

public class Segitiga extends BangunRuang implements BangunDuaDimensi{

	public  Segitiga(double panjang,double tinggi) {
		this.setPanjang(panjang);
		this.setTinggi(tinggi);
	}
	
	public Segitiga() {
		
	}
	
	@Override
	public double hitungLuas() {
		return (0.5 * this.getPanjang() * this.getTinggi());
	}
	
	@Override
		public double keliling() {
			return 3 * this.getPanjang();
		}

	@Override
	public void showLuas() {
		System.out.println("Luas Segitiga = "+ this.hitungLuas());
		System.out.println("Keliling Segitiga = "+this.keliling());
		System.out.println();
	}
	
	public void draw() {
		for(int i=0; i<this.getTinggi(); i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	
}
