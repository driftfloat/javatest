package spring.property;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

public class DecryptPropertyPlaceholderConfigurer1 extends PropertyPlaceholderConfigurer {

	@Override
	protected String convertProperty(String propertyName, String propertyValue) {
//		return super.convertProperty(propertyName, propertyValue);
		
		if(isEncryptPropertyVal(propertyName)){  
            return DESUtils.getDecryptString(propertyValue);//调用解密方法  
        }else{  
            return propertyValue;  
        }  
	}
	
	private boolean isEncryptPropertyVal(String propertyName){  
//        if(propertyName.startsWith("encrypt")){  
		if("password".equals(propertyName)){  
            return true;  
        }else{  
            return false;  
        }  
    }  
	
}
