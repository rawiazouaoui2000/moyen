/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 *
 * @author lenovo
 */
public class etud_serTest {
    
    public etud_serTest() {
    }
    
   
    @Test
    public void testDoPost() throws Exception {
        System.out.println("doPost");
        HttpServletRequest request = mock( HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        RequestDispatcher dispatcher=mock(RequestDispatcher.class);
        
        when(Integer.parseInt(request.getParameter("note1"))).thenReturn(5);
        when(Integer.parseInt(request.getParameter("note2"))).thenReturn(7);
        when(request.getRequestDispatcher("calcul.jsp")).thenReturn(dispatcher);
        
        etud_ser instance = new etud_ser();
        instance.doPost(request, response);
        // TODO review the generated test code and remove the default call to fail.
       verify(dispatcher).forward(request, response);
    }
    
}
