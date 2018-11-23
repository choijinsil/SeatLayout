package com.myway.seat.common.annotion;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.HashMap;
import java.util.Map;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface PrivacyInfo {		
	PrivacyType type();
	public enum PrivacyType{
		EMAIL, NAME, MOBILE_NUM, PHONE_NUM, RNN, IP, ALL;
		
		private static final Map<String, PrivacyType> mappings = new HashMap<String, PrivacyType>(7);

		static {
			for (PrivacyType privacyType : values()) {
				mappings.put(privacyType.name(), privacyType);
			}
		} 


		public static PrivacyType resolve(String method) {
			return (method != null ? mappings.get(method) : null);
		}

		public boolean matches(String method) {
			return (this == resolve(method));
		}
	}
}
