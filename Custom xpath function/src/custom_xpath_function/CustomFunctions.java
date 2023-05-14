package custom_xpath_function;

import com.tibco.xml.cxf.common.annotations.XPathFunction;
import com.tibco.xml.cxf.common.annotations.XPathFunctionGroup;
import com.tibco.xml.cxf.common.annotations.XPathFunctionParameter;

@XPathFunctionGroup(category = "Custom Functions", prefix = "tib", namespace = "http://tib.replace.function", helpText = "Custom defined function")
public class CustomFunctions {

	@XPathFunction(helpText = "Description", parameters = {
			@XPathFunctionParameter(name = "current", optional = true, optionalValue = ""),
			@XPathFunctionParameter(name = "replace", optional = true, optionalValue = "") })
	public String replace(String current, String replace) {
		return null;
	}
}
