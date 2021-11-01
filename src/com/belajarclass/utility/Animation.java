package com.belajarclass.utility;

import com.belajarclass.bangunruang.BangunDuaDimensi;

public class Animation {

	private BangunDuaDimensi gambar;
	private double coordX= 0;
	
	public Animation(BangunDuaDimensi gambar) {
		this.setGambar(gambar);
	}
	
	public Animation() {
		
	}
	
	public void kiri() {
		if(this.coordX < 0) {
			this.coordX= 0;
		}else {
			this.coordX--;
		}
			for(int i=0; i<coordX; i++) {
				System.out.print(" ");
			}
				this.gambar.draw();
	}
	
	public void kanan() {
		if(this.coordX > 80) {
			this.coordX= 80;
		}else {
			this.coordX++;
		}
			for(int i=0; i<coordX; i++) {
				System.out.print(" ");
			}
				this.gambar.draw();
	}
	
	
	public BangunDuaDimensi getGambar() {
		return gambar;
	}

	public void setGambar(BangunDuaDimensi gambar) {
		this.gambar = gambar;
	}
	
	
}
