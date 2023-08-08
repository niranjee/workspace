package Processes.Util.getPassword;
import java.util.*;
import java.io.*;

import com.tibco;
public class getPasswordJavaCode{
public class tibco {

	}
/****** START SET/GET METHOD, DO NOT MODIFY *****/
	protected String password = "";
	public String getpassword() {
		return password;
	}
	public void setpassword(String val) {
		password = val;
	}
/****** END SET/GET METHOD, DO NOT MODIFY *****/
	public getPasswordJavaCode() {
	}
	public void invoke() throws Exception {
/* Available Variables: DO NOT MODIFY
	Out : String password
* Available Variables: DO NOT MODIFY *****/
password = com.tibco.pe.plugin.PluginProperties.getProperty( 
"tibco.clientVar.PassengerProfile/Environment/ALMS/Password"); }
}
