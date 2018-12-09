package UI;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Scanner;

import CRUDAccount.Insert;

public class tampilanAwal {
	
	
	public void menuAwal() {
		Scanner in = new Scanner(System.in);
		int pilih;
		System.out.println("=========================================");
		System.out.println("1.\tAccount");
		System.out.println("2.\tCustomer");
		System.out.println("3.\tTransaction");
		System.out.println("0.\tKeluar");
		System.out.println("=========================================");
		System.out.println("Masukan Pilihan [1-3]\t= ");
		pilih = in.nextInt();
		
		try {
			pilihMenu(pilih);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	public void pilihMenu(int a) throws ParseException, SQLException, Exception {
		MainMenu mm = new MainMenu();
		Insert i = new Insert();
		
		switch (a) {
		case 1:
			i.Data();
			break;
		case 2:
			mm.MenuUtama();
			break;

		default:
			break;
		}
	}
}
