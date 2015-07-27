package service;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import webservices.OrderServiceWS;
import webservices.OrderServiceWSImplService;

/**
 * Servlet implementation class ClientServlet
 */
@WebServlet(name="/ClientServlet", urlPatterns = {"/ClientServlet"})
public class ClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClientServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		OrderServiceWSImplService orderService = new OrderServiceWSImplService();  
        OrderServiceWS orderServiceWS = orderService.getOrderServiceWSImplPort();

        //and then I just implemented the logic of the views.

		switch (request.getParameter("action")) {

        case "btn2":
            request.setAttribute("WS2", orderServiceWS.getCustomersWithPendingOrders());
            request.getRequestDispatcher("/custPending.jsp").forward(request, response);
            break;
        case "btn3":
            request.setAttribute("WS3", orderServiceWS.getProductsWithPendingOrders());
            request.getRequestDispatcher("/prodPending.jsp").forward(request, response);
            break;
        case "btn4":
            request.setAttribute("WS4", orderServiceWS.getCustInfo(2L));
            request.getRequestDispatcher("/custInfo.jsp").forward(request, response);
            break;
        case "btn5":
            request.setAttribute("WS5", orderServiceWS.getProductsWithoutOrders());
            request.getRequestDispatcher("/items.jsp").forward(request, response);
            break;
    }

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		OrderServiceWSImplService orderService = new OrderServiceWSImplService();  
        OrderServiceWS orderServiceWS = orderService.getOrderServiceWSImplPort();
		switch (request.getParameter("action")) {
        case "btn1":
        	String year = (String)request.getParameter("yr");
            request.setAttribute("WS1", orderServiceWS.getOrders(year));
            request.getRequestDispatcher("/ordersPerYear.jsp").forward(request, response);
            break;
        case "btn4":
        	Long orderId = Long.valueOf(request.getParameter("ordid"));
            request.setAttribute("WS4", orderServiceWS.getCustInfo(orderId));
            request.getRequestDispatcher("/custInfo.jsp").forward(request, response);
            break;
		}
	}

}
