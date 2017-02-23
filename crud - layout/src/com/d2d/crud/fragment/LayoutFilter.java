package com.d2d.crud.fragment;

import java.io.IOException;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

/**
 * Servlet Filter implementation class LayoutFilter
 */
@WebFilter(dispatcherTypes = {
				DispatcherType.REQUEST
		}
					, urlPatterns = { "*.jsp" })
public class LayoutFilter implements Filter {

    /**
     * Default constructor. 
     */
    public LayoutFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}
	
	private String mainApplicationLayout = null;

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, 
			FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		HttpServletResponse httpRes = (HttpServletResponse)response;
		HttpServletRequest httpReq = (HttpServletRequest) request;
		if(mainApplicationLayout==null){
			mainApplicationLayout = mainApplicationLayout(httpReq, 
						new HtmlResponseWrapper(httpRes));
		}
		// pass the request along the filter chain
		HtmlResponseWrapper mainResponse = new HtmlResponseWrapper(httpRes);
		chain.doFilter(request, mainResponse);
		String finalHtml = updateLayoutWithBody(
				new String(mainResponse.getCaptureAsBytes()));
		response.getWriter().write(finalHtml);
		response.getWriter().flush();
	}

	private String updateLayoutWithBody(String bodyHtml){
		System.out.println("Replacing string " + mainApplicationLayout + " with " + bodyHtml);
		String replaced = mainApplicationLayout.replaceAll("_body_", bodyHtml);
		System.out.println("Replaced " + replaced);
		return replaced;
	}
	private String mainApplicationLayout(
			HttpServletRequest request,
			HtmlResponseWrapper response) throws ServletException, IOException{
		request.getRequestDispatcher("/layout/application.jsp").
			include(request, response);
		return new String(response.getCaptureAsBytes());
	}
	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
