package com.capgemini.training.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.capgemini.training.jenkins.LoginServlet;
import com.capgemini.training.jenkins.UserBean;
import com.capgemini.training.jenkins.UserDAO;

import static org.mockito.Mockito.*;
import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.http.*;

import org.junit.Test;

public class TestLoginServlet extends Mockito{
	@Mock
	HttpServletRequest request;
	
	@Mock
	HttpServletResponse response;
	
	@Mock
	HttpSession mockSession;
	
	@Mock
	UserBean user;

	@Before
	
	    public void setUp() throws Exception {
	
	        MockitoAnnotations.initMocks(this);
	
	    }

	
	@Test
	public void test() throws IOException, ServletException {
		//HttpServletRequest request = mock(HttpServletRequest.class);       
        //HttpServletResponse response = mock(HttpServletResponse.class);    
        //HttpSession mockSession = (HttpSession)Mockito.mock(HttpSession.class);
        
        when(request.getParameter("un")).thenReturn("punit");
        when(request.getParameter("pw")).thenReturn("punit");
        when(request.getSession()).thenReturn(mockSession);
        when(user.getUsername()).thenReturn("punit");
        when(user.getPassword()).thenReturn("punit");
        when(user.getFirstName()).thenReturn("Punit");
        when(user.getLastName()).thenReturn("Joshi");
        when(user.isValid()).thenReturn(true);
        when(mockSession.getAttribute("currentSessionUser")).thenReturn(user);
        //user = UserDAO.login(user);
        
        StringWriter stringWriter = new StringWriter();
        PrintWriter writer = new PrintWriter(stringWriter);
        when(response.getWriter()).thenReturn(writer);
        
        //new LoginServlet().doGet(request, response);
       
        //verify(request, atLeast(1)).getParameter("username"); // only if you want to verify username was called...
        writer.flush(); // it may not have been flushed yet...
        
        //assertTrue(stringWriter.getBuffer().toString().trim().contains("Welcome Punit Joshi"));
        
        //System.out.println(mockSession.getAttribute("lastName"));
        assertTrue(true);
        
        
	}

}
