package spring.property;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

public class DecryptPropertyPlaceholderConfigurer extends PropertyPlaceholderConfigurer {

	@Override
	protected String convertProperty(String propertyName, String propertyValue) {
		if("password".equals(propertyName) ){  
            return DESUtils.getDecryptString(propertyValue);
        }else{
            return propertyValue;  
        }
	}
}
