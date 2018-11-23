package com.myway.seat.api.conf;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.google.common.base.Predicate;

import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static com.google.common.base.Predicates.*;
import static com.google.common.collect.Lists.*;
import static springfox.documentation.builders.PathSelectors.*;

/**
 * 클래스에 대한 설명을 여기에 쓴다.
 * 
 * @author 	sjc0502
 * @since 	2018. 11. 23.
 * @version 1.0
 * @see <pre>
 *  == 개정이력(Modification Information) ==
 *   
 *   수정일			수정자				수정내용
 *  ---------------------------------------------------------------------------------
 *   2018. 11. 23.		sjc0502				최초생성
 * 
 * </pre>
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Autowired
	private GlobalAuthConfig authConfig;	
	
	@Bean
	public Docket api(){		
		return new Docket(DocumentationType.SWAGGER_2)  
		          .select()                                  
		          //.apis(RequestHandlerSelectors.any())	//현재 RequestMapping으로 할당된 모든 URL 리스트를 추출              
		          .apis(RequestHandlerSelectors.basePackage("com.myway.seat.api"))	
		          .paths(mobileOpPaths())               //필터링 ex) 여기서는 /api/*.*           
		          .build()		          
		          .directModelSubstitute(LocalDate.class, String.class)		          
		          .genericModelSubstitutes(ResponseEntity.class)
		          .globalOperationParameters(authConfig.globalOperation());
	}
	
	private Predicate<String> mobileOpPaths() {
		return or(
				regex("/*.*")
				);
	}
}
