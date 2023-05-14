package Kernel.Util.UrlParser;
public class UrlParserParseInputURL{
/****** START SET/GET METHOD, DO NOT MODIFY *****/
	protected String urlString = "";
	protected String protocol = "";
	protected String host = "";
	protected int port = 0;
	protected String uri = "";
	protected String queryString = "";
	public String geturlString() {
		return urlString;
	}
	public void seturlString(String val) {
		urlString = val;
	}
	public String getprotocol() {
		return protocol;
	}
	public void setprotocol(String val) {
		protocol = val;
	}
	public String gethost() {
		return host;
	}
	public void sethost(String val) {
		host = val;
	}
	public int getport() {
		return port;
	}
	public void setport(int val) {
		port = val;
	}
	public String geturi() {
		return uri;
	}
	public void seturi(String val) {
		uri = val;
	}
	public String getqueryString() {
		return queryString;
	}
	public void setqueryString(String val) {
		queryString = val;
	}
/****** END SET/GET METHOD, DO NOT MODIFY *****/
	public UrlParserParseInputURL() {
	}
	public void invoke() throws Exception {
/* Available Variables: DO NOT MODIFY
	In  : String urlString
	Out : String protocol
	Out : String host
	Out : int port
	Out : String uri
	Out : String queryString
* Available Variables: DO NOT MODIFY *****/
	java.net.URL url = new java.net.URL(urlString);
	protocol = url.getProtocol();
	host = url.getHost();
	port = url.getPort();
	uri = url.getPath();
	if (port == -1)
		port = url.getDefaultPort();
	queryString = url.getQuery();
}
}
