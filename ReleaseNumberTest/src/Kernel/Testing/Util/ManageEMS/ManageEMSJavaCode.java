package Kernel.Testing.Util.ManageEMS;
import java.util.*;
import java.io.*;

import sun.misc.Queue;

import com.tibco.tibjms.admin.QueueInfo;
import com.tibco.tibjms.admin.TibjmsAdmin;

public class ManageEMSJavaCode{
/****** START SET/GET METHOD, DO NOT MODIFY *****/
	protected String serverUrl = "";
	protected String serverUsername = "";
	protected String serverPassword = "";
	protected String action = "";
	protected String name = "";
	public String getserverUrl() {
		return serverUrl;
	}
	public void setserverUrl(String val) {
		serverUrl = val;
	}
	public String getserverUsername() {
		return serverUsername;
	}
	public void setserverUsername(String val) {
		serverUsername = val;
	}
	public String getserverPassword() {
		return serverPassword;
	}
	public void setserverPassword(String val) {
		serverPassword = val;
	}
	public String getaction() {
		return action;
	}
	public void setaction(String val) {
		action = val;
	}
	public String getname() {
		return name;
	}
	public void setname(String val) {
		name = val;
	}
/****** END SET/GET METHOD, DO NOT MODIFY *****/
	public ManageEMSJavaCode() {
	}
	@SuppressWarnings("rawtypes")
	public void invoke() throws Exception {
/* Available Variables: DO NOT MODIFY
	In  : String serverUrl
	In  : String serverUsername
	In  : String serverPassword
	In  : String action
	In  : String name
* Available Variables: DO NOT MODIFY *****/
		TibjmsAdmin admin = null; 
		try
		{
			admin = new TibjmsAdmin(serverUrl, serverUsername, serverPassword);
			if (action.equals("CreateQueue"))
			{
				QueueInfo qi = new Queue(name);
				admin.createQueue(qi);
				return;		
			}
			if (action.equals("DestroyQueue"))
			{
				admin.destroyQueue(name);
			}
		}
		finally
		{
			if (admin != null)
				try { admin.close(); } catch (Exception e) { }
		}
	}
}
