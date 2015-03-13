package ime.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//JPA é uma especificação
 // Hibernate é uma implementação de JPA

//Drivers, conjunto implementações de interfaces para o JDBC -> é um driver jdbc

public class DB {
	public static void main(String[] args) {
		String db_url = "jdbc:mysql://localhost:3306/test";
		String db_username = "root";
		String db_password = "";
		try{
					
			Connection c = DriverManager.getConnection(db_url,db_username,db_password);
				
			Statement x = c.createStatement();
				
			x.execute("INSERT INTO Aluno (nome) VALUES ('PAULO4');");
				
			ResultSet RS = x.executeQuery("Select * from Aluno;");
				
	
			while (RS.next()){
				System.out.println(RS.getString("nome"));		
			}
			c.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}
}
