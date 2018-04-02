package javatest.mp3;

import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.stereotype.Component;
import org.springframework.util.StringValueResolver;

/*  Author: 陈荣凯
 *	Date: 2018年3月30日
**/
@Component("propertiesUtils")
public class PropertiesUtils implements EmbeddedValueResolverAware {
 
    private StringValueResolver stringValueResolver;
 
    public void setEmbeddedValueResolver(StringValueResolver resolver) {
    	 stringValueResolver = resolver;
    }
 
    public String getPropertiesValue(String name){
        return stringValueResolver.resolveStringValue(name);
    }
}
