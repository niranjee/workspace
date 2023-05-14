package Kernel.Auditing.Helper.AuditEvent;
import java.util.*;
import java.io.*;
@SuppressWarnings("unused")
public class AuditEventgetAdditionalLogData{
/****** START SET/GET METHOD, DO NOT MODIFY *****/
	protected String threadName = "";
	public String getthreadName() {
		return threadName;
	}
	public void setthreadName(String val) {
		threadName = val;
	}
/****** END SET/GET METHOD, DO NOT MODIFY *****/
	public AuditEventgetAdditionalLogData() {
	}
	public void invoke() throws Exception {
/* Available Variables: DO NOT MODIFY
	Out : String threadName
* Available Variables: DO NOT MODIFY *****/

	try { 
		threadName = Thread.currentThread().getName();
	}
	catch (Exception e) {
		threadName = "";
	} 

}
}
