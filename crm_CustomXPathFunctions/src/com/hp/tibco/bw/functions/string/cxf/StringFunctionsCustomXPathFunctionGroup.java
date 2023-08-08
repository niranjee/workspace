package com.hp.tibco.bw.functions.string.cxf;
import com.hp.tibco.bw.functions.string.StringFunctions;
import com.tibco.xml.cxf.common.annotations.XPathFunction;
import com.tibco.xml.cxf.common.annotations.XPathFunctionGroup;
import com.tibco.xml.cxf.common.annotations.XPathFunctionParameter;
import java.lang.String;
import java.lang.String;
import java.lang.String;
import java.lang.String;
import java.lang.String;
import java.lang.String;
import java.lang.String;
import java.lang.String;
@XPathFunctionGroup(category="com.hp.tibco.bw.functions.string",prefix="StringUtil",namespace="java://com.hp.tibco.bw.functions.string.StringFunctions",helpText="com.hp.tibco.bw.functions.string.StringFunctions") public class StringFunctionsCustomXPathFunctionGroup {
  @XPathFunction(parameters={@XPathFunctionParameter(name="string1"),@XPathFunctionParameter(name="string2")},helpText="") public boolean matches(  java.lang.String string1,  java.lang.String string2){
    return StringFunctions.matches(string1,string2);
  }
  @XPathFunction(parameters={@XPathFunctionParameter(name="string1"),@XPathFunctionParameter(name="string2"),@XPathFunctionParameter(name="string3")},helpText="") public java.lang.String replaceAll(  java.lang.String string1,  java.lang.String string2,  java.lang.String string3){
    return StringFunctions.replaceAll(string1,string2,string3);
  }
  @XPathFunction(parameters={@XPathFunctionParameter(name="string1")},helpText="") public java.lang.String compress(  java.lang.String string1){
    return StringFunctions.compress(string1);
  }
  @XPathFunction(parameters={@XPathFunctionParameter(name="string1")},helpText="") public java.lang.String getLetterAndDigit(  java.lang.String string1){
    return StringFunctions.getLetterAndDigit(string1);
  }
  @XPathFunction(parameters={@XPathFunctionParameter(name="string1")},helpText="") public java.lang.String decompress(  java.lang.String string1){
    return StringFunctions.decompress(string1);
  }
}
