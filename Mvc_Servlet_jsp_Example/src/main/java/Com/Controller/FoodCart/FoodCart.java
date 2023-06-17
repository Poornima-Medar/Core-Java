package Com.Controller.FoodCart;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import Com.Service.FoodCart.Food;
import Com.Service.FoodCart.FoodCartDbUtil;


public class FoodCart extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// get the data from the database (model)
		try {
			List<Food> foodItems = FoodCartDbUtil.getFoodList();
			request.setAttribute("foodItems", foodItems);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// redirect to a different page (view)
		RequestDispatcher dispatcher = request.getRequestDispatcher("show-food.jsp");
		dispatcher.forward(request, response);
	}

}
