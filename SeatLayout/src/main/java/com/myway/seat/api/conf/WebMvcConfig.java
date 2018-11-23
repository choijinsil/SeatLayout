package com.myway.seat.api.conf;



import java.nio.charset.Charset;
import java.util.List;

import javax.servlet.Filter;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import com.myway.seat.common.annotion.ApiVersionRequestMappingHandlerMapping;



/**
 * WebMvcConfig 설정
 * 
 * @author 	sjc0502
 * @since 	2017. 8. 8.
 * @version 1.0
 * @see <pre>
 *  == 개정이력(Modification Information) ==
 *   
 *   수정일			수정자				수정내용
 *  ---------------------------------------------------------------------------------
 *   2017. 8. 8.		sjc0502				최초생성
 * 
 * </pre>
 */
@Configuration
@ComponentScan
public class WebMvcConfig extends WebMvcConfigurationSupport {
    @Override
    public RequestMappingHandlerMapping requestMappingHandlerMapping() { 
    	RequestMappingHandlerMapping requestMappingHandlerMapping = new ApiVersionRequestMappingHandlerMapping("v");
    	requestMappingHandlerMapping.setOrder(0);
    	requestMappingHandlerMapping.setInterceptors(getInterceptors());
        return requestMappingHandlerMapping;
    }
    
    @Override
	public void addInterceptors(InterceptorRegistry registry) {		
		registry.addInterceptor(localeChangeInterceptor());	
	}
	@Bean
	public LocaleChangeInterceptor localeChangeInterceptor() {
		LocaleChangeInterceptor lci = new LocaleChangeInterceptor();	
		return lci;
	}
	
	
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
    	// TODO Auto-generated method stub
    	registry.addResourceHandler("swagger-ui.html")
        	.addResourceLocations("classpath:/META-INF/resources/");
    	registry.addResourceHandler("/webjars/**")
        	.addResourceLocations("classpath:/META-INF/resources/webjars/");
    	registry.addResourceHandler("/js/**")
    		.addResourceLocations("classpath:/static/js/");
    	registry.addResourceHandler("/css/**")
			.addResourceLocations("classpath:/static/css/");
    	
    }   
    
    @Bean
    public HttpMessageConverter<String> responseBodyConverter() {    	
        return new StringHttpMessageConverter(Charset.forName("UTF-8"));
    } 
    
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(responseBodyConverter());        
    }
    
   
   

}