package com.hp.tibco.bw.functions.json.cxf;
import com.hp.tibco.bw.functions.json.JSON;
import com.tibco.xml.cxf.common.annotations.XPathFunction;
import com.tibco.xml.cxf.common.annotations.XPathFunctionGroup;
import com.tibco.xml.cxf.common.annotations.XPathFunctionParameter;
import java.lang.String;
import java.lang.String;
@XPathFunctionGroup(category="com.hp.tibco.bw.functions.json",prefix="JSON",namespace="java://com.hp.tibco.bw.functions.json.JSON",helpText="com.hp.tibco.bw.functions.json.JSON") public class JSONCustomXPathFunctionGroup {
  @XPathFunction(parameters={@XPathFunctionParameter(name="string1")},helpText="") public java.lang.String toXML(  java.lang.String string1){
    return JSON.toXML(string1);
  }
  @XPathFunction(parameters={@XPathFunctionParameter(name="string1")},helpText="") public java.lang.String toJSON(  java.lang.String string1){
    return JSON.toJSON(string1);
  }
}
