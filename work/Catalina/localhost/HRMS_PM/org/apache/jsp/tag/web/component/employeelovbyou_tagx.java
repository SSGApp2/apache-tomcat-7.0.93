/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.93
 * Generated at: 2019-04-02 08:26:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.tag.web.component;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class employeelovbyou_tagx
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.servlet.jsp.JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public void setJspContext(javax.servlet.jsp.JspContext ctx) {
    super.setJspContext(ctx);
    java.util.ArrayList _jspx_nested = null;
    java.util.ArrayList _jspx_at_begin = null;
    java.util.ArrayList _jspx_at_end = null;
    this.jspContext = new org.apache.jasper.runtime.JspContextWrapper(ctx, _jspx_nested, _jspx_at_begin, _jspx_at_end, null);
  }

  public javax.servlet.jsp.JspContext getJspContext() {
    return this.jspContext;
  }
  private java.lang.String id;
  private java.lang.String placeholder;
  private java.lang.Boolean classes;
  private java.lang.String dataContent;
  private java.lang.String dataUrl;

  public java.lang.String getId() {
    return this.id;
  }

  public void setId(java.lang.String id) {
    this.id = id;
    jspContext.setAttribute("id", id);
  }

  public java.lang.String getPlaceholder() {
    return this.placeholder;
  }

  public void setPlaceholder(java.lang.String placeholder) {
    this.placeholder = placeholder;
    jspContext.setAttribute("placeholder", placeholder);
  }

  public java.lang.Boolean getClasses() {
    return this.classes;
  }

  public void setClasses(java.lang.Boolean classes) {
    this.classes = classes;
    jspContext.setAttribute("classes", classes);
  }

  public java.lang.String getDataContent() {
    return this.dataContent;
  }

  public void setDataContent(java.lang.String dataContent) {
    this.dataContent = dataContent;
    jspContext.setAttribute("dataContent", dataContent);
  }

  public java.lang.String getDataUrl() {
    return this.dataUrl;
  }

  public void setDataUrl(java.lang.String dataUrl) {
    this.dataUrl = dataUrl;
    jspContext.setAttribute("dataUrl", dataUrl);
  }

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    return _jsp_instancemanager;
  }

  private void _jspInit(javax.servlet.ServletConfig config) {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(config.getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(config);
  }

  public void _jspDestroy() {
  }

  public void doTag() throws javax.servlet.jsp.JspException, java.io.IOException {
    javax.servlet.jsp.PageContext _jspx_page_context = (javax.servlet.jsp.PageContext)jspContext;
    javax.servlet.http.HttpServletRequest request = (javax.servlet.http.HttpServletRequest) _jspx_page_context.getRequest();
    javax.servlet.http.HttpServletResponse response = (javax.servlet.http.HttpServletResponse) _jspx_page_context.getResponse();
    javax.servlet.http.HttpSession session = _jspx_page_context.getSession();
    javax.servlet.ServletContext application = _jspx_page_context.getServletContext();
    javax.servlet.ServletConfig config = _jspx_page_context.getServletConfig();
    javax.servlet.jsp.JspWriter out = jspContext.getOut();
    _jspInit(config);
    jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,jspContext);
    if( getId() != null ) 
      _jspx_page_context.setAttribute("id", getId());
    if( getPlaceholder() != null ) 
      _jspx_page_context.setAttribute("placeholder", getPlaceholder());
    if( getClasses() != null ) 
      _jspx_page_context.setAttribute("classes", getClasses());
    if( getDataContent() != null ) 
      _jspx_page_context.setAttribute("dataContent", getDataContent());
    if( getDataUrl() != null ) 
      _jspx_page_context.setAttribute("dataUrl", getDataUrl());

    try {
      out.write("<div class=\"input-group\">");
      out.write("<input type=\"employee-lov\" autocomplete=\"off\" class=\"form-control\" placeholder=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${placeholder}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null, true) + "\" data-placement=\"bottom\" data-url=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dataUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null, true) + "\" data-content=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dataContent}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null, true) + "\" data-toggle=\"popover\" onchange=\"UtilLov.onChangeInputLovEmployee(this)\" id=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${id}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null, true) + "\">");
      out.write("<span class=\"input-group-btn\">");
      out.write("<button type=\"button\" class=\"btn btn-default\" target=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${id}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null, true) + "\" onclick=\"UtilLov.lovEmployeeByOu(this);\" id=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${id}Btn", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null, true) + "\">");
      out.write("<span class=\"fa fa-search\">");
      out.write("</span>");
      out.write("</button>");
      out.write("</span>");
      out.write("</input>");
      out.write("</div>");
      out.write("<script type=\"text/javascript\">");
      out.write("\n");
      out.write("        jQuery(document).ready(function () {\n");
      out.write("            UtilLov.onLoadInputLovEmployeeByOu('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${id}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null, false));
      out.write("');\n");
      out.write("        });\n");
      out.write("    ");
      out.write("</script>");
    } catch( java.lang.Throwable t ) {
      if( t instanceof javax.servlet.jsp.SkipPageException )
          throw (javax.servlet.jsp.SkipPageException) t;
      if( t instanceof java.io.IOException )
          throw (java.io.IOException) t;
      if( t instanceof java.lang.IllegalStateException )
          throw (java.lang.IllegalStateException) t;
      if( t instanceof javax.servlet.jsp.JspException )
          throw (javax.servlet.jsp.JspException) t;
      throw new javax.servlet.jsp.JspException(t);
    } finally {
      jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,super.getJspContext());
      ((org.apache.jasper.runtime.JspContextWrapper) jspContext).syncEndTagFile();
    }
  }
}
