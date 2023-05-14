package Kernel.Util.UUIDGenerator;
public class UUIDGeneratorgetUUID{
/****** START SET/GET METHOD, DO NOT MODIFY *****/
	protected String aUUID = "";
	public String getaUUID() {
		return aUUID;
	}
	public void setaUUID(String val) {
		aUUID = val;
	}
/****** END SET/GET METHOD, DO NOT MODIFY *****/
	public UUIDGeneratorgetUUID() {
	}
	public void invoke() throws Exception {
/* Available Variables: DO NOT MODIFY
	Out : String aUUID
* Available Variables: DO NOT MODIFY *****/
	aUUID = java.util.UUID.randomUUID().toString();
}
}
