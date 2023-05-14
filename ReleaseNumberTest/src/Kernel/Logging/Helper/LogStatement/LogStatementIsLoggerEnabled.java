package Kernel.Logging.Helper.LogStatement;
import java.util.*;
import java.io.*;

import com.tibco;
@SuppressWarnings("deprecation")
public class LogStatementIsLoggerEnabled{
	
	private static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger("bw.logger");
	
	static { 
		String serviceName = com.tibco.pe.plugin.PluginProperties.getProperty("tibco.clientVar.ES/ServiceName");
		if (serviceName != null && serviceName.trim().length() > 0)
		{
			logger = org.apache.log4j.Logger.getLogger("bw.logger."+serviceName);
		}
		try 
		{
			System.out.println("Logger=" + logger.getName() + 
				" [debug="+logger.isDebugEnabled()+"]" +
				" [info="+logger.isInfoEnabled()+"]" +
				" [warning="+logger.isEnabledFor(org.apache.log4j.Priority.WARN)+"]" +
				" [error="+logger.isEnabledFor(org.apache.log4j.Priority.ERROR)+"]" +
				"");
		}
		catch (Exception e) { e.printStackTrace(); } 
	}
	

/****** START SET/GET METHOD, DO NOT MODIFY *****/
	protected String logLevel = "";
	protected boolean loggerEnabled = false;
	public String getlogLevel() {
		return logLevel;
	}
	public void setlogLevel(String val) {
		logLevel = val;
	}
	public boolean getloggerEnabled() {
		return loggerEnabled;
	}
	public void setloggerEnabled(boolean val) {
		loggerEnabled = val;
	}
/****** END SET/GET METHOD, DO NOT MODIFY *****/
	public LogStatementIsLoggerEnabled() {
	}
	public void invoke() throws Exception {
/* Available Variables: DO NOT MODIFY
	In  : String logLevel
	Out : boolean loggerEnabled
* Available Variables: DO NOT MODIFY *****/
		loggerEnabled = 
			"DEBUG".equals(logLevel) && logger.isDebugEnabled()
			|| "INFO".equals(logLevel) && logger.isInfoEnabled()
			|| "WARN".equals(logLevel) && logger.isEnabledFor(org.apache.log4j.Priority.WARN)
			|| "ERROR".equals(logLevel) && logger.isEnabledFor(org.apache.log4j.Priority.ERROR)
		;		
}
}
