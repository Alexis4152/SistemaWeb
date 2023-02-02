package com.mx.mex.Config;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;



public class CustomLogoutSuccessHandler implements LogoutSuccessHandler{
	
	private static Logger log = Logger.getLogger(LogoutSuccessHandler.class);
	
    @Override
    public void onLogoutSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
                                Authentication authentication) throws IOException, ServletException {
        if (authentication != null && authentication.getDetails() != null) {
       // 	authentication tiene valor y los detalles de la variable autenticacion tambien tienen 
// quiere decir que el usuario aún esta loggeado
            try {
                httpServletRequest.getSession().invalidate();
                log.info("User Successfully Logout");
                //you can add more codes here when the user successfully logs out,
                //such as updating the database for last active.
            } catch (Exception e) {log.error("Exception: "+ e.getMessage());}
        }
 
        httpServletResponse.setStatus(HttpServletResponse.SC_OK);
        //redirect to login
        httpServletResponse.sendRedirect("/PortalAplicativosComplementoPago-war/Login");
    }
}
