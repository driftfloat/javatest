package spring.tag;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

public class CalculatorBeanDefinitorParse extends AbstractSingleBeanDefinitionParser{

	@Override
	protected Class<?> getBeanClass(Element element) {
		return Calculator.class;
	}

	@Override
	protected void doParse(Element element, ParserContext parserContext, BeanDefinitionBuilder builder) {
		String operator = element.getAttribute("operator");
		if(StringUtils.hasText(operator)) {
			builder.addPropertyValue("operator", operator);
		}
		if("add".equals(operator)) {
			add(element, builder);
		}else if("minus".equals(operator)) {
			minus(element, builder);
		}else {
			throw new UnsupportedOperationException("Unsupport Operator");
		}
	}

	private void minus(Element element, BeanDefinitionBuilder builder) {
		
	}

	private void add(Element element, BeanDefinitionBuilder builder) {
		double number1 = getNumber(element, "number1");
		builder.addPropertyValue("number1", number1);
		double number2 = getNumber(element, "number2");
		builder.addPropertyValue("number2", number2);
		
		double result = number1 + number2 ;
		builder.addPropertyValue("result", result);
	}

	private double getNumber(Element element, String attributeName) {
		String attribule = element.getAttribute(attributeName);
		String strNumber = StringUtils.hasText(attribule) ? StringUtils.trimTrailingWhitespace(attribule) : ""  ;
		if("".equals(strNumber)) {
			return 0;
		}
		return Double.parseDouble(strNumber);
	}
	
	
	
}

























