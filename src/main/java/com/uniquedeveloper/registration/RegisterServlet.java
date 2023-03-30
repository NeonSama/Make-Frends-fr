/**
 * 
 */
package com.uniquedeveloper.registration;

/**
 * @author NERO
 *
 */
public class RegisterServlet {
	String name = request.getParameter("name");
	String email = request.getParameter("email");
	String password = request.getParameter("pass");
	//make user object
	User userModel = new User(name, email, pass);

	//create a database model
	UserDatabase regUser = new UserDatabase(ConnectionPro.getConnection());
	if (regUser.saveUser(userModel)) {
	   response.sendRedirect("index.jsp");
	} else {
	    String errorMessage = "User Available";
	    HttpSession regSession = request.getSession();
	    regSession.setAttribute("RegError", errorMessage);
	    response.sendRedirect("register.jsp");
	    }


}
