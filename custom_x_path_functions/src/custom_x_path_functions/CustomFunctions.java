package custom_x_path_functions;

import com.tibco.xml.cxf.common.annotations.XPathFunction;
import com.tibco.xml.cxf.common.annotations.XPathFunctionGroup;
import com.tibco.xml.cxf.common.annotations.XPathFunctionParameter;

@XPathFunctionGroup(category = "Custom Functions", prefix = "tib", namespace = "http://replace.function", helpText = "Custom defined function")
public class CustomFunctions {

	@XPathFunction(helpText = "Description", parameters = {
			@XPathFunctionParameter(name = "param", optional = true, optionalValue = ""),
			@XPathFunctionParameter(name = "param1", optional = true, optionalValue = "") })
	public String replace(String param, String param1) {
		return null;
	}
}
