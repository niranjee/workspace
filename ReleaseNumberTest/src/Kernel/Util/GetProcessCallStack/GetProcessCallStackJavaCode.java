package Kernel.Util.GetProcessCallStack;
import java.util.*;
import java.io.*;
@SuppressWarnings("unused")
public class GetProcessCallStackJavaCode{
/****** START SET/GET METHOD, DO NOT MODIFY *****/
	protected String callstack = "";
	protected String[] parentProcesses = null;
	public String getcallstack() {
		return callstack;
	}
	public void setcallstack(String val) {
		callstack = val;
	}
	public String[] getparentProcesses() {
		return parentProcesses;
	}
	public void setparentProcesses(String[] val) {
		parentProcesses = val;
	}
/****** END SET/GET METHOD, DO NOT MODIFY *****/
	public GetProcessCallStackJavaCode() {
	}
	public void invoke() throws Exception {
/* Available Variables: DO NOT MODIFY
	In  : String callstack
	Out : String[] parentProcesses
* Available Variables: DO NOT MODIFY *****/
		parentProcesses = null;
		try
		{
			String startToken =  "Process Stack: ";
			String endToken =  "/Inspector";
			
			int startPos = callstack.indexOf(startToken);
			int endPos = callstack.indexOf(endToken);
			if (startPos != -1 && endPos != -1)
			{
				String substr = callstack.substring(startPos + startToken.length(), endPos);
				parentProcesses = substr.split(">");
				for (int i = 0; i < parentProcesses.length; i++)
				{
					String curr = parentProcesses[i];
					int stripPos =-1; 
					if ((stripPos = parentProcesses[i].lastIndexOf("process/")) != -1)
					{
						parentProcesses[i] = parentProcesses[i].substring(0,stripPos + "process".length());
					}
				}
			}
		}
		catch (Exception e) { }}
}
