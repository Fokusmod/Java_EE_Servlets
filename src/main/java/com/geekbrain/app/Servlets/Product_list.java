package com.geekbrain.app.Servlets;

import com.geekbrain.app.Product;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Product_list extends HttpServlet {

    private final Product[] list = new Product[10];

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.getWriter().print("<html><body>");
        resp.getWriter().print("<table width=100% cellpadding=60>\n" + "<tbody>\n" + "<tr>\n");
        resp.getWriter().print(
                "<td width=200><h1>" + list[0].getTitle() + "</h1>\n" + "<h2>" +  list[0].getCost() + "</h2></td>\n" +
                        "<td width=200><h1>" + list[1].getTitle() + "</h1>\n" + "<h2>" +  list[1].getCost() + "</h2></td>\n" +
                        "<td width=200><h1>" + list[2].getTitle() + "</h1>\n" + "<h2>" +  list[2].getCost() + "</h2></td>\n" +
                        "<td width=200><h1>" + list[3].getTitle() + "</h1>\n" + "<h2>" +  list[3].getCost() + "</h2></td>\n" +
                        "<td width=200><h1>" + list[4].getTitle() + "</h1>\n" + "<h2>" +  list[4].getCost() + "</h2></td>\n");
        resp.getWriter().print("</tr>\n");
        resp.getWriter().print("<tr>\n");
        resp.getWriter().print(
                "<td width=200><h1>" + list[5].getTitle() + "</h1>\n" + "<h2>" +  list[5].getCost() + "</h2></td>\n" +
                        "<td width=200><h1>" + list[6].getTitle() + "</h1>\n" + "<h2>" +  list[6].getCost() + "</h2></td>\n" +
                        "<td width=200><h1>" + list[7].getTitle() + "</h1>\n" + "<h2>" +  list[7].getCost() + "</h2></td>\n" +
                        "<td width=200><h1>" + list[8].getTitle() + "</h1>\n" + "<h2>" +  list[8].getCost() + "</h2></td>\n" +
                        "<td width=200><h1>" + list[9].getTitle() + "</h1>\n" + "<h2>" +  list[9].getCost() + "</h2></td>\n");
        resp.getWriter().print("</tr>\n");
        resp.getWriter().print("</tbody>\n" + "</table>");
        resp.getWriter().printf("</body></html>");
    }

    @Override
    public void init() throws ServletException {
        list[0] = new Product(1, "Apple", 100);
        list[1] = new Product(2, "Orange", 120);
        list[2] = new Product(3, "Banana", 70);
        list[3] = new Product(4, "Potato", 60);
        list[4] = new Product(5, "Carrot", 35);
        list[5] = new Product(6, "Lemon", 70);
        list[6] = new Product(7, "Milk", 110);
        list[7] = new Product(8, "Cheese", 250);
        list[8] = new Product(9, "Egg", 100);
        list[9] = new Product(10, "Mushrooms", 150);
    }
}