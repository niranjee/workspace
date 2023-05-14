package Kernel.Logging.Helper.LogStatement;
import java.util.*;
import java.io.*;
public class LogStatementlogStatement{
		private static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger("bw.logger");
		
		static { 
			String serviceName = com.tibco.pe.plugin.PluginProperties.getProperty("tibco.clientVar.ES/ServiceName");
			if (serviceName != null && serviceName.trim().length() > 0)
			{
				logger = org.apache.log4j.Logger.getLogger("bw.logger."+serviceName);
			}
		}
		
/****** START SET/GET METHOD, DO NOT MODIFY *****/
	protected String logLevel = "";
	protected String logMessage = "";
	protected String serviceName = "";
	protected String componentName = "";
	protected String timestamp = "";
	protected String messageId = "";
	protected String relatesTo = "";
	protected String senderId = "";
	protected String groupIdentifier = "";
	protected String internalMessageId = "";
	protected String resultCode = "";
	protected String resultMsgCode = "";
	protected String resultMsg = "";
	protected String[] metadata = null;
	protected String stackTrace = "";
	public String getlogLevel() {
		return logLevel;
	}
	public void setlogLevel(String val) {
		logLevel = val;
	}
	public String getlogMessage() {
		return logMessage;
	}
	public void setlogMessage(String val) {
		logMessage = val;
	}
	public String getserviceName() {
		return serviceName;
	}
	public void setserviceName(String val) {
		serviceName = val;
	}
	public String getcomponentName() {
		return componentName;
	}
	public void setcomponentName(String val) {
		componentName = val;
	}
	public String gettimestamp() {
		return timestamp;
	}
	public void settimestamp(String val) {
		timestamp = val;
	}
	public String getmessageId() {
		return messageId;
	}
	public void setmessageId(String val) {
		messageId = val;
	}
	public String getrelatesTo() {
		return relatesTo;
	}
	public void setrelatesTo(String val) {
		relatesTo = val;
	}
	public String getsenderId() {
		return senderId;
	}
	public void setsenderId(String val) {
		senderId = val;
	}
	public String getgroupIdentifier() {
		return groupIdentifier;
	}
	public void setgroupIdentifier(String val) {
		groupIdentifier = val;
	}
	public String getinternalMessageId() {
		return internalMessageId;
	}
	public void setinternalMessageId(String val) {
		internalMessageId = val;
	}
	public String getresultCode() {
		return resultCode;
	}
	public void setresultCode(String val) {
		resultCode = val;
	}
	public String getresultMsgCode() {
		return resultMsgCode;
	}
	public void setresultMsgCode(String val) {
		resultMsgCode = val;
	}
	public String getresultMsg() {
		return resultMsg;
	}
	public void setresultMsg(String val) {
		resultMsg = val;
	}
	public String[] getmetadata() {
		return metadata;
	}
	public void setmetadata(String[] val) {
		metadata = val;
	}
	public String getstackTrace() {
		return stackTrace;
	}
	public void setstackTrace(String val) {
		stackTrace = val;
	}
/****** END SET/GET METHOD, DO NOT MODIFY *****/
		public LogStatementlogStatement() {
		}
		public void invoke() throws Exception {
/* Available Variables: DO NOT MODIFY
	In  : String logLevel
	In  : String logMessage
	In  : String serviceName
	In  : String componentName
	In  : String timestamp
	In  : String messageId
	In  : String relatesTo
	In  : String senderId
	In  : String groupIdentifier
	In  : String internalMessageId
	In  : String resultCode
	In  : String resultMsgCode
	In  : String resultMsg
	In  : String[] metadata
	In  : String stackTrace
* Available Variables: DO NOT MODIFY *****/
			StringBuffer logStatement = new StringBuffer()
				.append(" <").append(timestamp).append(">")
				.append(" <Thread:").append(Thread.currentThread().getName()).append(">")
				.append(" <").append(serviceName).append(":").append(componentName).append(">")
				.append(" <MsgId:").append(messageId).append(">")
				.append(" <InternalMsgId:").append(internalMessageId).append(">")
				.append(" <GroupID:").append(groupIdentifier).append(">")
				.append(" <SenderID:").append(senderId).append(">")
				.append(" <ResultCode:").append(resultCode).append(">")
				.append(" <ResultMsgCode:").append(resultMsgCode).append(">")
				.append(" <ResultMsg:").append(resultMsg).append(">")
				.append(" <Metadata:");
			;
			if (metadata != null && metadata.length > 0 )
			{
				for (int i = 0; i < metadata.length; i++)
					logStatement
						.append(i < metadata.length?", ":"")
						.append(metadata[i]);
			}
			logStatement.append(">");
			logStatement.append(logMessage);

			if ("DEBUG".equals(logLevel))
			{
				logger.debug(logStatement);
			} 
			else if ("INFO".equals(logLevel))
			{
				logger.info(logStatement);
			}
			else if ("WARN".equals(logLevel))
			{
				logger.warn(logStatement);
			}
			else if ("ERROR".equals(logLevel))
			{
				logger.error(logStatement);
			}
			else
			{
				
			}
	}
}
