package com.intalio.cloud.login;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.text.ParseException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.json.JSONObject;

public class Login extends HttpServlet {
	
	private Logger log = Logger.getLogger(this.getClass());
	
	private OutputStreamWriter wr;
	private BufferedReader rd;
	

	public void doPost(HttpServletRequest req, HttpServletResponse res)
	                                throws ServletException, IOException {
	    
		res.setContentType("application/json");
	    PrintWriter out = res.getWriter();
	    
	    String info = req.getParameter("info");
	    String username = req.getParameter("username");
	    String password = req.getParameter("password");
	    

	    if (!allowUser(info, username, password)) {
	    	try {
				out.println(new JSONObject("{result:failed}"));
			} catch (ParseException e) {
				e.printStackTrace();
			}
	    }
	    else {
	    	try {
				out.println(new JSONObject("{result:success}"));
			} catch (ParseException e) {
				e.printStackTrace();
			}
	    }
	  }

	  protected boolean allowUser(String info, String username, String password) throws IOException {
		  log.info("Info is: " + info);
		  log.info("Username is: " + username);
		  log.info("Password is: " + password);
		  
		  boolean allowUser = false;
		  
		  try {
			    // Construct data
			    String data = URLEncoder.encode("info", "UTF-8") + "=" + URLEncoder.encode(info, "UTF-8");
			    data += "&" + URLEncoder.encode("username", "UTF-8") + "=" + URLEncoder.encode(username, "UTF-8");
			    data += "&" + URLEncoder.encode("password", "UTF-8") + "=" + URLEncoder.encode(password, "UTF-8");

			    // Send data
			    URL url = new URL("http://platinum.cloud.intalio.com/auth/login");
			    URLConnection conn = url.openConnection();
			    conn.setDoOutput(true);
			    wr = new OutputStreamWriter(conn.getOutputStream());
			    wr.write(data);
			    wr.flush();

			    // Get the response
			    rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			    String line;
			    StringBuilder result = new StringBuilder();
			    while ((line = rd.readLine()) != null) {
			    	result.append(line);
			    }	
			    log.info("Result: " + result.toString());		    	
			    JSONObject jsonResult = new JSONObject(result.toString());
			    String loginResult = (String) jsonResult.opt("result");
			    if(loginResult.equals("login success")){
			    	allowUser = true;
			    }
			} catch (Exception e) {
				e.printStackTrace();
			} finally{
				if(wr != null){
					wr.close();
				}
				if(rd != null){
					rd.close();
				}
			}
		  
	    return allowUser;
	  }
	}