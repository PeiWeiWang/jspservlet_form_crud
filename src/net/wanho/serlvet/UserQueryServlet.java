package net.wanho.serlvet;

import net.wanho.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/showuser")
public class UserQueryServlet extends HttpServlet{


    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<User> list = new ArrayList<>();
        list.add(new User("wpw"));
        list.add(new User("frank"));
        req.setAttribute("data",list);
        req.getRequestDispatcher("showuser.jsp").forward(req,resp);

    }



}
