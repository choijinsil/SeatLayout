package com.myway.seat.api.conf;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.Parameter;


/**
 * 클래스에 대한 설명을 여기에 쓴다.
 * 
 * @author 	sjc0502
 * @since 	2017. 11. 30.
 * @version 1.0
 * @see <pre>
 *  == 개정이력(Modification Information) ==
 *   
 *   수정일			수정자				수정내용
 *  ---------------------------------------------------------------------------------
 *   2017. 11. 30.		sjc0502				최초생성
 * 
 * </pre>
 */
@Configuration
public class GlobalAuthConfig {	
	@Value("${spring.profiles:local}") 
	String property;

	@Bean
	public List<Parameter> globalOperation() {		
		List<Parameter> aParameters = new ArrayList<Parameter>();
		//if(!property.equals("local")) {			
			ParameterBuilder aParameterBuilder = new ParameterBuilder();
			aParameterBuilder
				.name("Authorization")
				.modelRef(new ModelRef("string"))
				.parameterType("header")
				.defaultValue("bearer ")
				.description("authorization header")
				.required(true)					
				.build();
			ParameterBuilder localeParameterBuilder = new ParameterBuilder();
			localeParameterBuilder
				.name("X-HU-LANG")
				.modelRef(new ModelRef("string"))
				.parameterType("header")
				.defaultValue("ko_KR")
				.description("internationalization 영여:en_US, 중국어:zh_CN")
				.required(true)	
				.build();
			
			//aParameters.add(aParameterBuilder.build());
			//aParameters.add(localeParameterBuilder.build());
		//}
		return aParameters;
	}
	
	@Bean
	public String localAuthBypass() {
		if("local".equalsIgnoreCase(property)) {
			
		}
		return "";
	}
	
	
}
