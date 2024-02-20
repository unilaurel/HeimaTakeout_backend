package cn.itcast.takeout.servlet;


import cn.itcast.takeout.bean.Response;
import cn.itcast.takeout.bean.User;
import cn.itcast.takeout.utils.CommonUtil;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class UserLoginServlet
 */
public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public UserLoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("username");
		String password=request.getParameter("password");
		String phone=request.getParameter("phone");
		
//		System.out.println("name:"+name+" password:"+password);
		System.out.println("phone:"+phone);
		
		Response res=new Response();
		res.setCode("0");
		User user = new User();
		user.setId(38);
		user.setBalance(0.0f);
		user.setDiscount(0);
		user.setIntegral(0);
		user.setName("student");
		user.setPhone(phone + "");
		res.setData(new Gson().toJson(user));
		
		CommonUtil.renderJson(response, res);
	}

}
