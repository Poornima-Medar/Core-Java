package Com.Service.FoodCart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FoodCartDbUtil {
	public static List<Food> getFoodList() throws ClassNotFoundException, SQLException {
		String dbname = "Food";
		String user = "postgres";
		String password = "test123";
		ArrayList<Food> food = new ArrayList<>();

		// load the mysql driver
		Class.forName("org.postgresql.Driver");

		// get the connection
		Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/"+dbname, user,
				password);

		// create a statement
		Statement st = connection.createStatement();

		// excecute the statement and loop over the result set
		ResultSet rs = st.executeQuery("select * from foodCart");
		while (rs.next()) {
			int id = rs.getInt(1);
			String items = rs.getString(2);
			float price = rs.getFloat(3);
			Food f = new Food(id, items, price);
			food.add(f);
		}
		return food;
	}
}
