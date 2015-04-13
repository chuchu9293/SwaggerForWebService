package io.swagger.api.util;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import com.wordnik.swagger.jaxrs.config.BeanConfig;

public class Bootstrap extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);

        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setVersion("1.0.2");
        beanConfig.setBasePath("http://localhost:8080/SwaggerForWebService");
        beanConfig.setResourcePackage("com.likeyichu.webservice");
        beanConfig.setScan(true);
    }
}