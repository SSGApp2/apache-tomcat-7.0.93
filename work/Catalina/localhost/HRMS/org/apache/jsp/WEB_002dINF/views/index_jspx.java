/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.93
 * Generated at: 2019-03-27 11:29:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jspx extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fvar_005fhtmlEscape_005fcode_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fvar_005fhtmlEscape_005fcode_005farguments_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fscope;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005farguments_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fvar_005fhtmlEscape_005fcode_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fvar_005fhtmlEscape_005fcode_005farguments_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fscope = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005farguments_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fvar_005fhtmlEscape_005fcode_005fnobody.release();
    _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fvar_005fhtmlEscape_005fcode_005farguments_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fscope.release();
    _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005fnobody.release();
    _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005farguments_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<div version=\"2.0\">");
      if (_jspx_meth_spring_005fmessage_005f0(_jspx_page_context))
        return;
      if (_jspx_meth_spring_005fmessage_005f1(_jspx_page_context))
        return;
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      if (_jspx_meth_c_005fset_005f1(_jspx_page_context))
        return;
      out.write("<div class=\"container\">");
      out.write("<div class=\"row\">");
      out.write("<h3>");
      if (_jspx_meth_spring_005fmessage_005f4(_jspx_page_context))
        return;
      out.write("</h3>");
      out.write("<p>");
      if (_jspx_meth_spring_005fmessage_005f5(_jspx_page_context))
        return;
      out.write("<div style=\"display: none\" class=\"row\" id=\"favoriteDashbord\">");
      out.write("</div>");
      out.write("<div style=\"display:none\" class=\"row\" id=\"taskList\">");
      if (_jspx_meth_tiles_005finsertTemplate_005f0(_jspx_page_context))
        return;
      out.write("</div>");
      out.write("</p>");
      out.write("<div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12\" id=\"allMenuOU\"/>");
      out.write("</div>");
      out.write("</div>");
      out.write("<script type=\"text/javascript\">");
      out.write("\n");
      out.write("\n");
      out.write("        $(document).ready(function () {\n");
      out.write("\n");
      out.write("            $(\"div[id=cd-menu-trigger]\").hide();\n");
      out.write("\n");
      out.write("            //Filter Menu OU//\n");
      out.write("            var options = {\n");
      out.write("                url: session.context + \"/oumanages/getOuMenu\",\n");
      out.write("                type: \"GET\",\n");
      out.write("                async: false,\n");
      out.write("                contentType: \"application/json; charset=utf-8\",\n");
      out.write("                dataType: \"json\",\n");
      out.write("                success: function (data) {\n");
      out.write("\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            var settings = $.extend({}, ajaxPattern, options);\n");
      out.write("            var data = $.ajax(settings);\n");
      out.write("            var dataMenuOU = JSON.parse(data.responseText);\n");
      out.write("            $('#ouMenuId,.currentOu').empty();\n");
      out.write("            if (Object.keys(dataMenuOU).length == 1) {\n");
      out.write("                $(\"div[id=allMenuOU]\").hide();\n");
      out.write("                var ouCode = dataMenuOU[0].ouCode;\n");
      out.write("                var userID = session.userId.user_Id;\n");
      out.write("                var options = {\n");
      out.write("                    url: session.context + \"/oumanages/updateOuCode\",\n");
      out.write("                    type: \"POST\",\n");
      out.write("                    data: {\n");
      out.write("                        \"ouCode\": ouCode,\n");
      out.write("                        \"userId\": userID,\n");
      out.write("                    },\n");
      out.write("                    async: false,\n");
      out.write("                    success: function (data) {\n");
      out.write("                        if (data.update == \"1\") {\n");
      out.write("                            $(\"div[id=cd-menu-trigger]\").fadeIn(500);\n");
      out.write("                            if (ouCode != null && ouCode != \"\") {\n");
      out.write("                                //Add ou on menu\n");
      out.write("                                getOuMenu(data.ouData);\n");
      out.write("                                AppUserFav.showDashboard();\n");
      out.write("                            }\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("                var settings = $.extend({}, ajaxPattern, options);\n");
      out.write("                var data = $.ajax(settings);\n");
      out.write("\n");
      out.write("            } else if (Object.keys(dataMenuOU).length > 0 && dataMenuOU != null && dataMenuOU != \"\") {\n");
      out.write("                var LABEL_ORGANIZATION_CODE = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LABEL_ORGANIZATION_CODE}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("';\n");
      out.write("                var BUTTON_CHOOSE_FILE = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${BUTTON_CHOOSE_FILE}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("';\n");
      out.write("                $(\"div[id=allMenuOU]\").empty();\n");
      out.write("                $.each(dataMenuOU, function (index, value) {\n");
      out.write("                    switch (session.lang) {\n");
      out.write("                        case \"TH\":\n");
      out.write("                            ouName = value.ouLocalName;\n");
      out.write("                            break\n");
      out.write("                        case \"EN\":\n");
      out.write("                            ouName = value.ouEngName;\n");
      out.write("                            break;\n");
      out.write("                        default :\n");
      out.write("                            ouName = value.ouEngName;\n");
      out.write("                            break;\n");
      out.write("                    }\n");
      out.write("                    $(\"div[id=allMenuOU]\").append(\n");
      out.write("                        '");
      out.write("<div id=\"menuOU\" class=\"col-lg-4 col-md-6\">");
      out.write("' +\n");
      out.write("                        '");
      out.write("<div class=\"panel panel-primary\">");
      out.write("' +\n");
      out.write("                        ' ");
      out.write("<div class=\"panel-heading\">");
      out.write("' +\n");
      out.write("                        '");
      out.write("<div class=\"row\">");
      out.write("' +\n");
      out.write("                        '");
      out.write("<div class=\"col-xs-3\">");
      out.write("' +\n");
      out.write("                        '");
      out.write("<i class=\"fa fa-th-large fa-3x\">");
      out.write("' +\n");
      out.write("                        '");
      out.write("' +\n");
      out.write("                        '");
      out.write("</i>");
      out.write("' +\n");
      out.write("                        '");
      out.write("</div>");
      out.write("' +\n");
      out.write("                        '");
      out.write("<div class=\"col-xs-9 text-right\">");
      out.write("' +\n");
      out.write("                        '");
      out.write("<div class=\"huge\">");
      out.write("' + LABEL_ORGANIZATION_CODE + '  ");
      out.write("<span id=\"currentOuCode\">");
      out.write("' + value.ouCode + '");
      out.write("</span>");
      out.write("' +\n");
      out.write("                        '");
      out.write("</div>");
      out.write("' +\n");
      out.write("                        '");
      out.write("<div>");
      out.write("' + ouName + '' +\n");
      out.write("                        '");
      out.write("</div>");
      out.write("' +\n");
      out.write("                        '");
      out.write("</div>");
      out.write("' +\n");
      out.write("                        '");
      out.write("</div>");
      out.write("' +\n");
      out.write("                        '");
      out.write("</div>");
      out.write("' +\n");
      out.write("                        '");
      out.write("<a id=\"footer-ou\">");
      out.write("' +\n");
      out.write("                        '");
      out.write("<div class=\"panel-footer text-primary\">");
      out.write("' +\n");
      out.write("                        '");
      out.write("<span class=\"pull-left\">");
      out.write("' + BUTTON_CHOOSE_FILE + '' +\n");
      out.write("                        '");
      out.write("</span>");
      out.write("' +\n");
      out.write("                        '");
      out.write("<span class=\"pull-right\">");
      out.write("' +\n");
      out.write("                        '");
      out.write("<i class=\"fa fa-arrow-circle-right\">");
      out.write("' +\n");
      out.write("                        '");
      out.write("' +\n");
      out.write("                        '");
      out.write("</i>");
      out.write("' +\n");
      out.write("                        '");
      out.write("</span>");
      out.write("' +\n");
      out.write("                        '");
      out.write("<br/>");
      out.write("' +\n");
      out.write("                        '");
      out.write("</div>");
      out.write("' +\n");
      out.write("                        '");
      out.write("</a>");
      out.write("' +\n");
      out.write("                        '");
      out.write("</div>");
      out.write("' +\n");
      out.write("                        '");
      out.write("</div>");
      out.write("');\n");
      out.write("                });\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /*Toggle On Click Menu OU*/\n");
      out.write("            $(\"a[id=footer-ou]\").on(\"click\", function () {\n");
      out.write("                var ouCode = $(this).parent().parent().find(\"div[class=huge] span[id=currentOuCode]\").text().trim();\n");
      out.write("                var userID = session.userId.user_Id;\n");
      out.write("                var options = {\n");
      out.write("                    url: session.context + \"/oumanages/updateOuCode\",\n");
      out.write("                    type: \"POST\",\n");
      out.write("                    data: {\n");
      out.write("                        \"ouCode\": ouCode,\n");
      out.write("                        \"userId\": userID,\n");
      out.write("                    },\n");
      out.write("                    async: false,\n");
      out.write("                    success: function (data) {\n");
      out.write("                        if (data.update == \"1\") {\n");
      out.write("                            $(\"div[id=allMenuOU]\").fadeOut(800);\n");
      out.write("                            $(\"div[id=cd-menu-trigger]\").fadeIn(500);\n");
      out.write("                            //Add ou on menu\n");
      out.write("                            getOuMenu(data.ouData);\n");
      out.write("                            AppUserFav.showDashboard();\n");
      out.write("\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("                var settings = $.extend({}, ajaxPattern, options);\n");
      out.write("                var data = $.ajax(settings);\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("    ");
      out.write("</script>");
      out.write("</div>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_spring_005fmessage_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f0 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fvar_005fhtmlEscape_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    boolean _jspx_th_spring_005fmessage_005f0_reused = false;
    try {
      _jspx_th_spring_005fmessage_005f0.setPageContext(_jspx_page_context);
      _jspx_th_spring_005fmessage_005f0.setParent(null);
      // /WEB-INF/views/index.jspx(6,80) name = htmlEscape type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_spring_005fmessage_005f0.setHtmlEscape("false");
      // /WEB-INF/views/index.jspx(6,80) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_spring_005fmessage_005f0.setCode("application_name");
      // /WEB-INF/views/index.jspx(6,80) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_spring_005fmessage_005f0.setVar("app_name");
      int[] _jspx_push_body_count_spring_005fmessage_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_spring_005fmessage_005f0 = _jspx_th_spring_005fmessage_005f0.doStartTag();
        if (_jspx_th_spring_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_005fmessage_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_005fmessage_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_005fmessage_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fvar_005fhtmlEscape_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f0);
      _jspx_th_spring_005fmessage_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_spring_005fmessage_005f0, _jsp_getInstanceManager(), _jspx_th_spring_005fmessage_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f1 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fvar_005fhtmlEscape_005fcode_005farguments_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    boolean _jspx_th_spring_005fmessage_005f1_reused = false;
    try {
      _jspx_th_spring_005fmessage_005f1.setPageContext(_jspx_page_context);
      _jspx_th_spring_005fmessage_005f1.setParent(null);
      // /WEB-INF/views/index.jspx(7,102) name = htmlEscape type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_spring_005fmessage_005f1.setHtmlEscape("false");
      // /WEB-INF/views/index.jspx(7,102) name = arguments type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_spring_005fmessage_005f1.setArguments((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${app_name}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      // /WEB-INF/views/index.jspx(7,102) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_spring_005fmessage_005f1.setCode("welcome_titlepane");
      // /WEB-INF/views/index.jspx(7,102) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_spring_005fmessage_005f1.setVar("title");
      int[] _jspx_push_body_count_spring_005fmessage_005f1 = new int[] { 0 };
      try {
        int _jspx_eval_spring_005fmessage_005f1 = _jspx_th_spring_005fmessage_005f1.doStartTag();
        if (_jspx_th_spring_005fmessage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_005fmessage_005f1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_005fmessage_005f1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_005fmessage_005f1.doFinally();
      }
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fvar_005fhtmlEscape_005fcode_005farguments_005fnobody.reuse(_jspx_th_spring_005fmessage_005f1);
      _jspx_th_spring_005fmessage_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_spring_005fmessage_005f1, _jsp_getInstanceManager(), _jspx_th_spring_005fmessage_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fscope.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    boolean _jspx_th_c_005fset_005f0_reused = false;
    try {
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /WEB-INF/views/index.jspx(9,58) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("LABEL_ORGANIZATION_CODE");
      // /WEB-INF/views/index.jspx(9,58) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setScope("request");
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_eval_c_005fset_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_c_005fset_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = org.apache.jasper.runtime.JspRuntimeLibrary.startBufferedBody(_jspx_page_context, _jspx_th_c_005fset_005f0);
        }
        do {
          if (_jspx_meth_spring_005fmessage_005f2(_jspx_th_c_005fset_005f0, _jspx_page_context))
            return true;
          int evalDoAfterBody = _jspx_th_c_005fset_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_c_005fset_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fscope.reuse(_jspx_th_c_005fset_005f0);
      _jspx_th_c_005fset_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fset_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fset_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fset_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f2 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    boolean _jspx_th_spring_005fmessage_005f2_reused = false;
    try {
      _jspx_th_spring_005fmessage_005f2.setPageContext(_jspx_page_context);
      _jspx_th_spring_005fmessage_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fset_005f0);
      // /WEB-INF/views/index.jspx(9,88) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_spring_005fmessage_005f2.setCode("LB1113");
      int[] _jspx_push_body_count_spring_005fmessage_005f2 = new int[] { 0 };
      try {
        int _jspx_eval_spring_005fmessage_005f2 = _jspx_th_spring_005fmessage_005f2.doStartTag();
        if (_jspx_th_spring_005fmessage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_005fmessage_005f2[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_005fmessage_005f2.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_005fmessage_005f2.doFinally();
      }
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f2);
      _jspx_th_spring_005fmessage_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_spring_005fmessage_005f2, _jsp_getInstanceManager(), _jspx_th_spring_005fmessage_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fscope.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    boolean _jspx_th_c_005fset_005f1_reused = false;
    try {
      _jspx_th_c_005fset_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f1.setParent(null);
      // /WEB-INF/views/index.jspx(12,53) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f1.setVar("BUTTON_CHOOSE_FILE");
      // /WEB-INF/views/index.jspx(12,53) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f1.setScope("request");
      int _jspx_eval_c_005fset_005f1 = _jspx_th_c_005fset_005f1.doStartTag();
      if (_jspx_eval_c_005fset_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_c_005fset_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = org.apache.jasper.runtime.JspRuntimeLibrary.startBufferedBody(_jspx_page_context, _jspx_th_c_005fset_005f1);
        }
        do {
          if (_jspx_meth_spring_005fmessage_005f3(_jspx_th_c_005fset_005f1, _jspx_page_context))
            return true;
          int evalDoAfterBody = _jspx_th_c_005fset_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_c_005fset_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_c_005fset_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fscope.reuse(_jspx_th_c_005fset_005f1);
      _jspx_th_c_005fset_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fset_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fset_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fset_005f1, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f3 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    boolean _jspx_th_spring_005fmessage_005f3_reused = false;
    try {
      _jspx_th_spring_005fmessage_005f3.setPageContext(_jspx_page_context);
      _jspx_th_spring_005fmessage_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fset_005f1);
      // /WEB-INF/views/index.jspx(12,83) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_spring_005fmessage_005f3.setCode("BT0014");
      int[] _jspx_push_body_count_spring_005fmessage_005f3 = new int[] { 0 };
      try {
        int _jspx_eval_spring_005fmessage_005f3 = _jspx_th_spring_005fmessage_005f3.doStartTag();
        if (_jspx_th_spring_005fmessage_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_005fmessage_005f3[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_005fmessage_005f3.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_005fmessage_005f3.doFinally();
      }
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f3);
      _jspx_th_spring_005fmessage_005f3_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_spring_005fmessage_005f3, _jsp_getInstanceManager(), _jspx_th_spring_005fmessage_005f3_reused);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f4(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f4 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005farguments_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    boolean _jspx_th_spring_005fmessage_005f4_reused = false;
    try {
      _jspx_th_spring_005fmessage_005f4.setPageContext(_jspx_page_context);
      _jspx_th_spring_005fmessage_005f4.setParent(null);
      // /WEB-INF/views/index.jspx(20,76) name = arguments type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_spring_005fmessage_005f4.setArguments((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${app_name}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      // /WEB-INF/views/index.jspx(20,76) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_spring_005fmessage_005f4.setCode("welcome_h3");
      int[] _jspx_push_body_count_spring_005fmessage_005f4 = new int[] { 0 };
      try {
        int _jspx_eval_spring_005fmessage_005f4 = _jspx_th_spring_005fmessage_005f4.doStartTag();
        if (_jspx_th_spring_005fmessage_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_005fmessage_005f4[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_005fmessage_005f4.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_005fmessage_005f4.doFinally();
      }
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005farguments_005fnobody.reuse(_jspx_th_spring_005fmessage_005f4);
      _jspx_th_spring_005fmessage_005f4_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_spring_005fmessage_005f4, _jsp_getInstanceManager(), _jspx_th_spring_005fmessage_005f4_reused);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f5(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f5 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    boolean _jspx_th_spring_005fmessage_005f5_reused = false;
    try {
      _jspx_th_spring_005fmessage_005f5.setPageContext(_jspx_page_context);
      _jspx_th_spring_005fmessage_005f5.setParent(null);
      // /WEB-INF/views/index.jspx(23,54) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_spring_005fmessage_005f5.setCode("welcome_text");
      int[] _jspx_push_body_count_spring_005fmessage_005f5 = new int[] { 0 };
      try {
        int _jspx_eval_spring_005fmessage_005f5 = _jspx_th_spring_005fmessage_005f5.doStartTag();
        if (_jspx_th_spring_005fmessage_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_005fmessage_005f5[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_005fmessage_005f5.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_005fmessage_005f5.doFinally();
      }
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f5);
      _jspx_th_spring_005fmessage_005f5_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_spring_005fmessage_005f5, _jsp_getInstanceManager(), _jspx_th_spring_005fmessage_005f5_reused);
    }
    return false;
  }

  private boolean _jspx_meth_tiles_005finsertTemplate_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tiles:insertTemplate
    org.apache.tiles.jsp.taglib.InsertTemplateTag _jspx_th_tiles_005finsertTemplate_005f0 = new org.apache.tiles.jsp.taglib.InsertTemplateTag();
    _jsp_getInstanceManager().newInstance(_jspx_th_tiles_005finsertTemplate_005f0);
    try {
      _jspx_th_tiles_005finsertTemplate_005f0.setJspContext(_jspx_page_context);
      // /WEB-INF/views/index.jspx(28,84) name = template type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_tiles_005finsertTemplate_005f0.setTemplate("/WEB-INF/views/taskList.jspx");
      _jspx_th_tiles_005finsertTemplate_005f0.doTag();
    } finally {
      _jsp_getInstanceManager().destroyInstance(_jspx_th_tiles_005finsertTemplate_005f0);
    }
    return false;
  }
}
