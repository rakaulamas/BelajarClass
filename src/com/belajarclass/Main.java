package com.belajarclass;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.belajarclass.bangunruang.BangunDuaDimensi;
import com.belajarclass.bangunruang.Kotak;
import com.belajarclass.bangunruang.Segitiga;
import com.belajarclass.gambar.Gambar;
import com.belajarclass.utility.Animation;
import com.belajarclass.utility.Utility;

public class Main {

	public static void main(String[] args) {
		
		

		Kotak kotak = new Kotak(5,5);		//cara 1
//		kotak.setPanjang(2.0);				cara 2: di set panjangnya
//		System.out.println(kotak.hitungLuas());
//		kotak.showNilai();
		
		Segitiga segitiga = new Segitiga(5,5);
//		System.out.println(segitiga.hitungLuas());
//		System.out.println(segitiga.keliling());
//		segitiga.showNilai();
		
		Gambar gambar = new Gambar();
		
//		Cara ke=3: Dibungkus kedalam ArrayList lalu di hubungkan pakai Interface (Polymorphism)
//		List<BangunDuaDimensi> lstBangun = new ArrayList<BangunDuaDimensi>();
//		lstBangun.add(kotak);
//		lstBangun.add(segitiga);
//		lstBangun.add(gambar);
//		
//		
//		for(int i=0; i<lstBangun.size(); i++) {
//			
//			Utility.clearScreen();
//			lstBangun.get(i).draw();
//			Utility.delay();
//			
//		}
		
		Animation anima = new Animation(gambar);
		
			for(int i=0; i<10; i++) {
				Utility.clearScreen(100);
				anima.kanan();
				Utility.delay(100);
			}
			
			for(int i=0; i<5; i++) {
				Utility.clearScreen(100);
				anima.kiri();
				Utility.delay(100);
			}
		
		
		
	}

}
