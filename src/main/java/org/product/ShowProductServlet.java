package org.product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/product")
public class ShowProductServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    List<Product>products = new ArrayList<>();
    String productName ;
    int productQuantity;
    Double productPrice;
    int productId =0;
    int Id;
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        productName = req.getParameter("name");
        productPrice = Double.parseDouble(req.getParameter("price"));
        productQuantity = Integer.parseInt(req.getParameter("quantity"));
        Product product = new Product(productName, productPrice, ++productId ,productQuantity);
        products.add(product);
        resp.sendRedirect("product?action=get");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if(action.equals("get")) {
            req.setAttribute("products", products);
            req.getRequestDispatcher("product.jsp").forward(req,resp);
        }
    }
}
