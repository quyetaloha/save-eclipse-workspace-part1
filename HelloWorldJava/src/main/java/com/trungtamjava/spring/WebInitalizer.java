package com.trungtamjava.spring;


import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
//public class WebInitalizer implements WebApplicationInitializer {    
//	public void onStartup(ServletContext container) throws ServletException {       
//		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
//		ctx.register(HelloWorldConfiguration.class);        ctx.setServletContext(container);
//		ServletRegistration.Dynamic servlet = container.addServlet("dispatcher", new DispatcherServlet(ctx));        
//		servlet.setLoadOnStartup(1);        servlet.addMapping("/");
//		}
//}

//cách cấu hình thứ 2.
public class WebInitalizer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] {HelloWorldConfiguration.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"/"};
	}
	
}