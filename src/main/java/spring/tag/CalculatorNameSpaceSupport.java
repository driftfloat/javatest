package spring.tag;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

class CalculatorNameSpaceSupport extends NamespaceHandlerSupport {

	@Override
	public void init() {
		registerBeanDefinitionParser("calculator",new CalculatorBeanDefinitorParse());
	}

}
