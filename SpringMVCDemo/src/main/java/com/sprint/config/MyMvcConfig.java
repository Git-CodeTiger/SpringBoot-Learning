package com.sprint.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration	//声明配置类
@EnableWebMvc	//开启SpringMVC支持，若无此句，重写WebMvcConfigurerAdapter无效
@ComponentScan("com.sprint")	/*自动扫描包名下的所有使用@Service @Component @Repository @Controller的类并注册为Bean*/
public class MyMvcConfig {
	
	@Bean	//注解在方法上, 声明当前方法的返回值为一个Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("WEB-INF/classes/templates/");
		viewResolver.setSuffix(".jsp");
		viewResolver.setViewClass(JstlView.class);
		return viewResolver;
	}

}
