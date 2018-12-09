package UI;

import java.util.Scanner;

import CRUDCustomer.Delete;
import CRUDCustomer.Insert;
import CRUDCustomer.Search;
import CRUDCustomer.Update;
import CRUDCustomer.View;

public class MainMenu {
	
	public void MenuUtama() {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("=====================================");
		System.out.println("===========Selamat Datang============");
		System.out.println("=====================================");
		System.out.println("= 1.\tInput Data\t=");
		System.out.println("= 2.\tShow Data\t=");
		System.out.println("= 3.\tUpdate Data");
		System.out.println("= 4.\tDelete Data");
		System.out.println("= 5.\tSearch Data");
		System.out.println("= 9.\tBack To Menu");
		System.out.println("= 0.\tKeluar");
		System.out.println("=====================================");
		System.out.print("\tPilih Data [1-5] = ");
		try {
			int input = in.nextInt();
			
			pilihMenu(input);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Input tidak dikenali");
			System.out.println(e.getMessage());
			MenuUtama();
		}finally {
			in.close();
		}
	}
	
	void pilihMenu(int a) throws Exception {

		Insert input = new Insert();
		View view = new View();
		Update up = new Update();
		Delete del = new Delete();
		Search search = new Search();
		switch (a) {
		case 0:
			System.exit(0);
			break;
		case 1:
			input.Data();
			MenuUtama();
			break;
		case 2:
			view.Data();
			MenuUtama();
			break;
		case 3:
			up.Data();
			MenuUtama();
			break;
		case 4:
			del.Data();
			MenuUtama();
			break;
		case 5:
			search.Data();
			MenuUtama();
			break;
		case 9:
			System.out.println("Memilih 9");
			MenuUtama();
			break;
		default:
			System.out.println("Memilih "+a);
			MenuUtama();
			break;
		}
	}
	
}
