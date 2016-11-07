package com.sprint.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/*WebApplicationInitializer 是Spring提供用来配置Servlet3.0+配置的接口，从而实现了替代web.xml的位置。
 *实现此接口将会自动被SpringServletContainerInitializer(用来启动Servlet3.0容器)获取到。
 */
public class WebInitializer implements WebApplicationInitializer {
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		
		/*新建WebApplicationContext,注册配置类，并将其和当前的servletContext关联*/
		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
		ctx.register(MyMvcConfig.class);
		ctx.setServletContext(servletContext);
		
		/*注册SpringMvc的DispatcherServlet*/
		Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(ctx));
		servlet.addMapping("/");
		servlet.setLoadOnStartup(1);
	}
}

