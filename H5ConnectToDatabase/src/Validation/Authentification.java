package Validation;

import Model.accountAdmin;
import UI.MainApp;

import java.util.Scanner;
import UI.MainMenu;
import UI.tampilanAwal;
import Imp.ProcessData;


public class Authentification extends ProcessData{
	
	Scanner in = new Scanner(System.in);
	
	tampilanAwal tA = new tampilanAwal();
	
	public void Login() {

		String uName,pWord;
		System.out.println("==========================");
		System.out.print("insert username =\t ");
		uName = in.nextLine();
		System.out.print("insert password =\t ");
		pWord = in.nextLine();
		
		
		String sql = "select *from accountadmin";
		
		try {
			resultSet = ReadRecordData(sql);
			while(resultSet.next()) {
				if (uName.equals(resultSet.getString("userName")) && pWord.equals(resultSet.getString("passwrd"))) {
					System.out.println("Login Success");
					tA.menuAwal();
				}else {
					System.out.println("login gagal");
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
//		System.out.println("UserName and Password is undefine");
		Login();
	}
	
}
