package meta.com.br.control;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;


@WebFilter(asyncSupported = true, urlPatterns = { "/*" }) 
public class CrosFilter implements Filter {

    
    public CrosFilter() {
      
    }

	
	public void destroy() {
		
	}


	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
		HttpServletResponse response = (HttpServletResponse) resp;
		response.addHeader("Access-Control-Allow-Origin", "*");
		response.addHeader("Access-Control-Allow-Methods","POST,GET,PUT,OPTIONS,DELETE,PATCH");
		response.addHeader("Access-Control-Max-Age", "3600");
		response.addHeader("Access-Control-Allow-Headers","Origin, X-Requested-With, Content-Type, Accept");
		response.addHeader("Access-Control-Expose-Headers","Location");
		response.addHeader("allow", "POST,PUT,DELETE,GET,OPTIONS");
		chain.doFilter(req, response);
	}


	public void init(FilterConfig fConfig) throws ServletException {
	
	}

}
