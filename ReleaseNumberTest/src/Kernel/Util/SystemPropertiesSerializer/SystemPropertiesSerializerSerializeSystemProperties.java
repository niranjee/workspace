package Kernel.Util.SystemPropertiesSerializer;
import java.util.*;
public class SystemPropertiesSerializerSerializeSystemProperties{
/****** START SET/GET METHOD, DO NOT MODIFY *****/
	protected String[] propertyName = null;
	protected String[] propertyValue = null;
	public String[] getpropertyName() {
		return propertyName;
	}
	public void setpropertyName(String[] val) {
		propertyName = val;
	}
	public String[] getpropertyValue() {
		return propertyValue;
	}
	public void setpropertyValue(String[] val) {
		propertyValue = val;
	}
/****** END SET/GET METHOD, DO NOT MODIFY *****/
	public SystemPropertiesSerializerSerializeSystemProperties() {
	}
	public void invoke() throws Exception {
/* Available Variables: DO NOT MODIFY
	Out : String[] propertyName
	Out : String[] propertyValue
* Available Variables: DO NOT MODIFY *****/
		Properties props = System.getProperties();
		propertyName = new String [props.size()];
		propertyValue = new String [props.size()];
		int indx = 0;
		
		for (@SuppressWarnings("rawtypes")
		Iterator i = props.keySet().iterator();  
			i.hasNext(); )
		{
			String key = (String) i.next();
			propertyName[indx] = key;
			propertyValue[indx] = props.getProperty(key);
			indx++;
		}
	
}
}
