package Kernel.Auditing.Helper.AuditEvent;
import java.util.*;
import java.io.*;
public class AuditEventLogauditEventusingLog4Jsothatitcanbereinjectedlater{
		private static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger("bw.logger");
		
/****** START SET/GET METHOD, DO NOT MODIFY *****/
	protected String serviceName = "";
	protected String auditCategory = "";
	protected String componentName = "";
	protected String auditEvent = "";
	protected String internalMessageID = "";
	public String getserviceName() {
		return serviceName;
	}
	public void setserviceName(String val) {
		serviceName = val;
	}
	public String getauditCategory() {
		return auditCategory;
	}
	public void setauditCategory(String val) {
		auditCategory = val;
	}
	public String getcomponentName() {
		return componentName;
	}
	public void setcomponentName(String val) {
		componentName = val;
	}
	public String getauditEvent() {
		return auditEvent;
	}
	public void setauditEvent(String val) {
		auditEvent = val;
	}
	public String getinternalMessageID() {
		return internalMessageID;
	}
	public void setinternalMessageID(String val) {
		internalMessageID = val;
	}
/****** END SET/GET METHOD, DO NOT MODIFY *****/
	public AuditEventLogauditEventusingLog4Jsothatitcanbereinjectedlater() {
	}
	public void invoke() throws Exception {
/* Available Variables: DO NOT MODIFY
	In  : String serviceName
	In  : String auditCategory
	In  : String componentName
	In  : String auditEvent
	In  : String internalMessageID
* Available Variables: DO NOT MODIFY *****/
		org.apache.log4j.MDC.put("_cl.msgId",auditCategory + "-" + serviceName + "-" + internalMessageID);
		if (serviceName != null && serviceName.trim().length() > 0)
			org.apache.log4j.MDC.put("_cl.logicalCompId.matrix.application",serviceName);
		if (componentName != null && componentName.trim().length() > 0)
			org.apache.log4j.MDC.put("_cl.logicalCompId.matrix.component",componentName);
		logger.info(auditEvent);
		
	}
}
