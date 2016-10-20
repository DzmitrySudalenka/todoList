package org.apache.jsp.account;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import by.gsu.epamlab.Constants;
import by.gsu.epamlab.Constants;
import by.gsu.epamlab.Constants;
import by.gsu.epamlab.model.beans.TaskSection;
import by.gsu.epamlab.Constants;

public final class tasks_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(5);
    _jspx_dependants.add("/WEB-INF/c.tld");
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/menu.jsp");
    _jspx_dependants.add("/report.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_default_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_default_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_c_out_value_default_nobody.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_when_test.release();
    _jspx_tagPool_c_url_value_nobody.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF8\">\r\n");
      out.write("<title>");
      if (_jspx_meth_c_out_0(_jspx_page_context))
        return;
      out.write("</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" \r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.print( Constants.RESOURSE_PATH_CSS_STTYLE );
      out.write("\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<header class=\"clearfix\">\r\n");
      out.write("\t<label>User:\r\n");
      out.write("\t\t<b>\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_out_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t</b>\r\n");
      out.write("\t</label>\r\n");
      out.write("\t<nav class=\"");
      if (_jspx_meth_c_out_2(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("\t\t");
      //  c:choose
      org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
      _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
      _jspx_th_c_choose_0.setParent(null);
      int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
      if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_0.setPageContext(_jspx_page_context);
          _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty user}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
          int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
          if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("\t\t\t\t<a href=\"");
              //  c:url
              org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
              _jspx_th_c_url_0.setPageContext(_jspx_page_context);
              _jspx_th_c_url_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_0);
              _jspx_th_c_url_0.setValue( Constants.JUMP_VIEW_LOGIN );
              int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
              if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
              out.write("\">\r\n");
              out.write("\t\t\t\t\t");
              out.print( Constants.LABEL_LOGIN );
              out.write("</a>\r\n");
              out.write("\t\t\t\t<a href=\"");
              //  c:url
              org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
              _jspx_th_c_url_1.setPageContext(_jspx_page_context);
              _jspx_th_c_url_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_0);
              _jspx_th_c_url_1.setValue( Constants.JUMP_VIEW_REGISTRATE );
              int _jspx_eval_c_url_1 = _jspx_th_c_url_1.doStartTag();
              if (_jspx_th_c_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
              out.write("\">\r\n");
              out.write("\t\t\t\t\t");
              out.print( Constants.LABEL_REGISTRATE );
              out.write("</a>\r\n");
              out.write("\t\t\t");
              int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
          out.write("\r\n");
          out.write("\t\t\t");
          //  c:otherwise
          org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
          _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
          _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
          if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("\t\t\t\t<form class=\"logout\" name=\"");
              out.print( Constants.KEY_FORM_LOGOUT );
              out.write("\" method=\"POST\" \r\n");
              out.write("\t\t\t\t\t\taction=\"");
              //  c:url
              org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
              _jspx_th_c_url_2.setPageContext(_jspx_page_context);
              _jspx_th_c_url_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_0);
              _jspx_th_c_url_2.setValue( Constants.SEND_LOGOUT );
              int _jspx_eval_c_url_2 = _jspx_th_c_url_2.doStartTag();
              if (_jspx_th_c_url_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_2);
              out.write("\">\r\n");
              out.write("\t\t\t\t\t<a href=\"javascript:document.forms['");
              out.print( Constants.KEY_FORM_LOGOUT );
              out.write("\r\n");
              out.write("\t\t\t\t\t'].submit();\">");
              out.print( Constants.LABEL_LOGOUT );
              out.write("</a>\r\n");
              out.write("\t\t\t\t</form>\r\n");
              out.write("\t\t\t");
              int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
          out.write("\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      out.write("\r\n");
      out.write("\t</nav>\r\n");
      out.write("</header>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<section>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<menu>\r\n");
      out.write("\t");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_0.setParent(null);
      _jspx_th_c_forEach_0.setItems( TaskSection.values() );
      _jspx_th_c_forEach_0.setVar("taskSection");
      int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t<li>\r\n");
            out.write("\t\t\t<a href=\"");
            //  c:url
            org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
            _jspx_th_c_url_3.setPageContext(_jspx_page_context);
            _jspx_th_c_url_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
            _jspx_th_c_url_3.setValue( Constants.JUMP_CONTROLLER_TASKS_SECTION );
            int _jspx_eval_c_url_3 = _jspx_th_c_url_3.doStartTag();
            if (_jspx_th_c_url_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
              return;
            _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_3);
            out.write("\r\n");
            out.write("\t\t\t\t\t");
            if (_jspx_meth_c_out_3(_jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
              return;
            out.write("\">\r\n");
            out.write("\t\t\t\t");
            if (_jspx_meth_c_out_4(_jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
              return;
            out.write("\r\n");
            out.write("\t\t\t</a>\r\n");
            out.write("\t\t</li>\r\n");
            out.write("\t");
            int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_0.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
      }
      out.write("\r\n");
      out.write("</menu>");
      out.write("\r\n");
      out.write("\t<h3>");
      if (_jspx_meth_c_out_5(_jspx_page_context))
        return;
      out.write("</h3>\r\n");
      out.write("\t");
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t<div class=\"clearfix\">\r\n");
      out.write("\t");
      //  c:choose
      org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
      _jspx_th_c_choose_1.setPageContext(_jspx_page_context);
      _jspx_th_c_choose_1.setParent(null);
      int _jspx_eval_c_choose_1 = _jspx_th_c_choose_1.doStartTag();
      if (_jspx_eval_c_choose_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_1.setPageContext(_jspx_page_context);
          _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
          _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty tasks}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
          int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
          if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("\t\t\t<div class=\"msg clearfix\">\r\n");
              out.write("\t\t\t\t");
              out.print( Constants.TEXT_NO_TASKS );
              out.write("\r\n");
              out.write("\t\t\t</div>\r\n");
              out.write("\t\t");
              int evalDoAfterBody = _jspx_th_c_when_1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
          out.write("\r\n");
          out.write("\t\t");
          //  c:otherwise
          org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_1 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
          _jspx_th_c_otherwise_1.setPageContext(_jspx_page_context);
          _jspx_th_c_otherwise_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
          int _jspx_eval_c_otherwise_1 = _jspx_th_c_otherwise_1.doStartTag();
          if (_jspx_eval_c_otherwise_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("\t\t\t<form name=\"");
              out.print( Constants.KEY_FORM_TASKS );
              out.write("\" method=\"POST\">\r\n");
              out.write("\t\t\t<table class=\"tasks\">\r\n");
              out.write("\t\t\t<tr>\r\n");
              out.write("\t\t\t\t<th></th>\r\n");
              out.write("\t\t\t\t<th>");
              out.print( Constants.LABEL_DESCRIPTION );
              out.write("</th>\r\n");
              out.write("\t\t\t\t");
              //  c:if
              org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
              _jspx_th_c_if_1.setPageContext(_jspx_page_context);
              _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_1);
              _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${taskSection.showDate}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
              int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
              if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("\t\t\t\t   <th>");
                  out.print( Constants.LABEL_DATE );
                  out.write("</th>\r\n");
                  out.write("\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
              out.write("\r\n");
              out.write("\t\t\t\t<th>");
              out.print( Constants.LABEL_FILE );
              out.write("</th>\r\n");
              out.write("\t\t\t</tr>\r\n");
              out.write("\t\t\t");
              //  c:forEach
              org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
              _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
              _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_1);
              _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tasks}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
              _jspx_th_c_forEach_1.setVar("task");
              int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
              try {
                int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
                if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  do {
                    out.write("\r\n");
                    out.write("\t\t\t\t<tr>\r\n");
                    out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"");
                    out.print( Constants.KEY_TASK_IDS );
                    out.write("\" \r\n");
                    out.write("\t\t\t\t\t\tvalue=\"");
                    out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${task.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                    out.write("\"></td>\r\n");
                    out.write("\t\t\t\t<td>");
                    out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${task.description}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                    out.write("</td>\r\n");
                    out.write("\t\t\t\t");
                    if (_jspx_meth_c_if_2(_jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
                      return;
                    out.write("\r\n");
                    out.write("\t\t\t\t<td class=\"file\">\r\n");
                    out.write("\t\t\t\t\t");
                    //  c:choose
                    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_2 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
                    _jspx_th_c_choose_2.setPageContext(_jspx_page_context);
                    _jspx_th_c_choose_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
                    int _jspx_eval_c_choose_2 = _jspx_th_c_choose_2.doStartTag();
                    if (_jspx_eval_c_choose_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      do {
                        out.write("\r\n");
                        out.write("\t\t\t\t\t\t");
                        //  c:when
                        org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_2 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
                        _jspx_th_c_when_2.setPageContext(_jspx_page_context);
                        _jspx_th_c_when_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_2);
                        _jspx_th_c_when_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${task.haveFile}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
                        int _jspx_eval_c_when_2 = _jspx_th_c_when_2.doStartTag();
                        if (_jspx_eval_c_when_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                          do {
                            out.write("\r\n");
                            out.write("\t\t\t\t\t\t\t<button type=\"submit\" name=\"");
                            out.print( Constants.KEY_TASK_ID );
                            out.write("\" \r\n");
                            out.write("\t\t\t\t\t\t\tvalue=\"");
                            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${task.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                            out.write("\" formaction=\"");
                            //  c:url
                            org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_4 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
                            _jspx_th_c_url_4.setPageContext(_jspx_page_context);
                            _jspx_th_c_url_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_2);
                            _jspx_th_c_url_4.setValue( Constants.JUMP_CONTROLLER_TASK_FILE_DOWNLOAD );
                            int _jspx_eval_c_url_4 = _jspx_th_c_url_4.doStartTag();
                            if (_jspx_th_c_url_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_4);
                            out.write("\">\r\n");
                            out.write("\t\t\t\t\t\t\t\t");
                            out.print( Constants.LABEL_DOWNLOAD );
                            out.write("\r\n");
                            out.write("\t\t\t\t\t\t\t</button>\r\n");
                            out.write("\t\t\t\t\t\t\t<button type=\"submit\" name=\"");
                            out.print( Constants.KEY_TASK_ID );
                            out.write("\"\r\n");
                            out.write("\t\t\t\t\t\t\tvalue=\"");
                            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${task.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                            out.write("\" formaction=\"");
                            //  c:url
                            org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_5 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
                            _jspx_th_c_url_5.setPageContext(_jspx_page_context);
                            _jspx_th_c_url_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_2);
                            _jspx_th_c_url_5.setValue( Constants.JUMP_CONTROLLER_TASK_FILE_DELETE );
                            int _jspx_eval_c_url_5 = _jspx_th_c_url_5.doStartTag();
                            if (_jspx_th_c_url_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_5);
                            out.write("\">\r\n");
                            out.write("\t\t\t\t\t\t\t\t");
                            out.print( Constants.LABEL_DELETE );
                            out.write("\r\n");
                            out.write("\t\t\t\t\t\t\t</button>\r\n");
                            out.write("\t\t\t\t\t\t");
                            int evalDoAfterBody = _jspx_th_c_when_2.doAfterBody();
                            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                          } while (true);
                        }
                        if (_jspx_th_c_when_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                        _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
                        out.write("\r\n");
                        out.write("\t\t\t\t\t\t");
                        //  c:otherwise
                        org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_2 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
                        _jspx_th_c_otherwise_2.setPageContext(_jspx_page_context);
                        _jspx_th_c_otherwise_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_2);
                        int _jspx_eval_c_otherwise_2 = _jspx_th_c_otherwise_2.doStartTag();
                        if (_jspx_eval_c_otherwise_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                          do {
                            out.write("\r\n");
                            out.write("\t\t\t\t\t\t\t<button type=\"submit\" name=\"");
                            out.print( Constants.KEY_TASK_ID );
                            out.write("\" \r\n");
                            out.write("\t\t\t\t\t\t\tvalue=\"");
                            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${task.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                            out.write("\" formaction=\"");
                            //  c:url
                            org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_6 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
                            _jspx_th_c_url_6.setPageContext(_jspx_page_context);
                            _jspx_th_c_url_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_2);
                            _jspx_th_c_url_6.setValue( Constants.JUMP_CONTROLLER_TASK_FILE_ATTACH );
                            int _jspx_eval_c_url_6 = _jspx_th_c_url_6.doStartTag();
                            if (_jspx_th_c_url_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_6);
                            out.write("\">\r\n");
                            out.write("\t\t\t\t\t\t\t\t");
                            out.print( Constants.LABEL_ATTACH );
                            out.write("\r\n");
                            out.write("\t\t\t\t\t\t\t</button>\r\n");
                            out.write("\t\t\t\t\t\t");
                            int evalDoAfterBody = _jspx_th_c_otherwise_2.doAfterBody();
                            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                          } while (true);
                        }
                        if (_jspx_th_c_otherwise_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                        _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_2);
                        out.write("\r\n");
                        out.write("\t\t\t\t\t");
                        int evalDoAfterBody = _jspx_th_c_choose_2.doAfterBody();
                        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                          break;
                      } while (true);
                    }
                    if (_jspx_th_c_choose_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_2);
                    out.write("\r\n");
                    out.write("\t\t\t\t</td>\r\n");
                    out.write("\t\t\t\t</tr>\r\n");
                    out.write("\t\t\t");
                    int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
                    if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                      break;
                  } while (true);
                }
                if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
              } catch (Throwable _jspx_exception) {
                while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
                  out = _jspx_page_context.popBody();
                _jspx_th_c_forEach_1.doCatch(_jspx_exception);
              } finally {
                _jspx_th_c_forEach_1.doFinally();
                _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
              }
              out.write("\r\n");
              out.write("\t\t\t</table>\r\n");
              out.write("\t\t\t<div class=\"btns\">\r\n");
              out.write("\t\t\t");
              //  c:if
              org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
              _jspx_th_c_if_3.setPageContext(_jspx_page_context);
              _jspx_th_c_if_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_1);
              _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${taskSection.activeStatuses}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
              int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
              if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("\t\t\t<button type=\"submit\" name=\"");
                  out.print( Constants.KEY_NEW_STATUS );
                  out.write("\" \r\n");
                  out.write("\t\t\tvalue=\"");
                  out.print( Constants.ID_CHAR_TASK_STATUS_FIXED );
                  out.write("\" formaction=\"");
                  //  c:url
                  org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_7 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
                  _jspx_th_c_url_7.setPageContext(_jspx_page_context);
                  _jspx_th_c_url_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_3);
                  _jspx_th_c_url_7.setValue( Constants.JUMP_CONTROLLER_TASKS_CHANGE_STATUS );
                  int _jspx_eval_c_url_7 = _jspx_th_c_url_7.doStartTag();
                  if (_jspx_th_c_url_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_7);
                  out.write("\">\r\n");
                  out.write("\t\t\t\t");
                  out.print( Constants.LABEL_FIX );
                  out.write("\r\n");
                  out.write("\t\t\t</button>\r\n");
                  out.write("\t\t\t");
                  int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
              out.write("\r\n");
              out.write("\t\t\t");
              //  c:if
              org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
              _jspx_th_c_if_4.setPageContext(_jspx_page_context);
              _jspx_th_c_if_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_1);
              _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${taskSection.notMovedToRecycleBinStatuses}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
              int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
              if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("\t\t\t<button type=\"submit\" name=\"");
                  out.print( Constants.KEY_NEW_STATUS );
                  out.write("\" \r\n");
                  out.write("\t\t\tvalue=\"");
                  out.print( Constants.ID_CHAR_TASK_STATUS_MOVED_TO_RECYCLE_BIN );
                  out.write("\" \r\n");
                  out.write("\t\t\tformaction=\"");
                  //  c:url
                  org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_8 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
                  _jspx_th_c_url_8.setPageContext(_jspx_page_context);
                  _jspx_th_c_url_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_4);
                  _jspx_th_c_url_8.setValue( Constants.JUMP_CONTROLLER_TASKS_CHANGE_STATUS );
                  int _jspx_eval_c_url_8 = _jspx_th_c_url_8.doStartTag();
                  if (_jspx_th_c_url_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_8);
                  out.write("\">\r\n");
                  out.write("\t\t\t\t");
                  out.print( Constants.LABEL_MOVE_TO_RECYCLE_BIN );
                  out.write("\r\n");
                  out.write("\t\t\t</button>\r\n");
                  out.write("\t\t\t");
                  int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
              out.write("\r\n");
              out.write("\t\t\t");
              //  c:if
              org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
              _jspx_th_c_if_5.setPageContext(_jspx_page_context);
              _jspx_th_c_if_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_1);
              _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${taskSection.movedToRecycleBinStatuses}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
              int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
              if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("\t\t\t<button type=\"submit\" name=\"");
                  out.print( Constants.KEY_NEW_STATUS );
                  out.write("\" \r\n");
                  out.write("\t\t\tvalue=\"");
                  out.print( Constants.ID_CHAR_TASK_STATUS_ACTIVE );
                  out.write("\" formaction=\"");
                  //  c:url
                  org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_9 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
                  _jspx_th_c_url_9.setPageContext(_jspx_page_context);
                  _jspx_th_c_url_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_5);
                  _jspx_th_c_url_9.setValue( Constants.JUMP_CONTROLLER_TASKS_CHANGE_STATUS );
                  int _jspx_eval_c_url_9 = _jspx_th_c_url_9.doStartTag();
                  if (_jspx_th_c_url_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_9);
                  out.write("\">\r\n");
                  out.write("\t\t\t\t");
                  out.print( Constants.LABEL_RESTORE );
                  out.write("\r\n");
                  out.write("\t\t\t</button>\r\n");
                  out.write("\t\t\t<button type=\"submit\" name=\"");
                  out.print( Constants.KEY_DELETE );
                  out.write("\" \r\n");
                  out.write("\t\t\tvalue=\"");
                  out.print( Constants.VALUE_SELECTED );
                  out.write("\" formaction=\"");
                  //  c:url
                  org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_10 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
                  _jspx_th_c_url_10.setPageContext(_jspx_page_context);
                  _jspx_th_c_url_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_5);
                  _jspx_th_c_url_10.setValue( Constants.JUMP_CONTROLLER_TASKS_DELETE );
                  int _jspx_eval_c_url_10 = _jspx_th_c_url_10.doStartTag();
                  if (_jspx_th_c_url_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_10);
                  out.write("\">\r\n");
                  out.write("\t\t\t");
                  out.print( Constants.LABEL_DELETE );
                  out.write("\r\n");
                  out.write("\t\t\t</button>\r\n");
                  out.write("\t\t\t<button type=\"submit\" name=\"");
                  out.print( Constants.KEY_DELETE );
                  out.write("\" \r\n");
                  out.write("\t\t\tvalue=\"");
                  out.print( Constants.VALUE_ALL );
                  out.write("\" formaction=\"");
                  //  c:url
                  org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_11 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
                  _jspx_th_c_url_11.setPageContext(_jspx_page_context);
                  _jspx_th_c_url_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_5);
                  _jspx_th_c_url_11.setValue( Constants.JUMP_CONTROLLER_TASKS_DELETE );
                  int _jspx_eval_c_url_11 = _jspx_th_c_url_11.doStartTag();
                  if (_jspx_th_c_url_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_11);
                  out.write("\">\r\n");
                  out.write("\t\t\t");
                  out.print( Constants.LABEL_DELETE_ALL );
                  out.write("\r\n");
                  out.write("\t\t\t</button>\r\n");
                  out.write("\t\t\t");
                  int evalDoAfterBody = _jspx_th_c_if_5.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_c_if_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
              out.write("\r\n");
              out.write("\t\t\t</div>\r\n");
              out.write("\t\t\t</form>\r\n");
              out.write("\t\t");
              int evalDoAfterBody = _jspx_th_c_otherwise_1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_otherwise_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_1);
          out.write('\r');
          out.write('\n');
          out.write('	');
          int evalDoAfterBody = _jspx_th_c_choose_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_choose_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
      out.write('\r');
      out.write('\n');
      out.write('	');
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_6.setPageContext(_jspx_page_context);
      _jspx_th_c_if_6.setParent(null);
      _jspx_th_c_if_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${taskSection.activeStatuses}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
      if (_jspx_eval_c_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t<a class=\"left\" href=\"");
          //  c:url
          org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_12 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
          _jspx_th_c_url_12.setPageContext(_jspx_page_context);
          _jspx_th_c_url_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_6);
          _jspx_th_c_url_12.setValue( Constants.JUMP_CONTROLLER_TASK_ADD );
          int _jspx_eval_c_url_12 = _jspx_th_c_url_12.doStartTag();
          if (_jspx_th_c_url_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_12);
          out.write("\">\r\n");
          out.write("\t\t\t");
          out.print( Constants.LABEL_ADD );
          out.write("</a>\t\t\r\n");
          out.write("\t");
          int evalDoAfterBody = _jspx_th_c_if_6.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_if_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<footer>\r\n");
      out.write("\t");
      out.print( Constants.LABEL_DEVELOPED_BY );
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.print( Constants.AUTHOR_NAME );
      out.write("\r\n");
      out.write("\t<a href=\"mailto:");
      out.print( Constants.AUTHOR_EMAIL );
      out.write('"');
      out.write('>');
      out.print( Constants.AUTHOR_EMAIL );
      out.write("</a>\r\n");
      out.write("</footer>");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_out_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent(null);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${taskSection.title}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_out_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_default_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent(null);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.name}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_out_1.setDefault("guest");
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_default_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_c_out_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
    _jspx_th_c_out_2.setParent(null);
    _jspx_th_c_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty user ? 'left': 'right'}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }

  private boolean _jspx_meth_c_out_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_3.setPageContext(_jspx_page_context);
    _jspx_th_c_out_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${taskSection.id}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_out_3 = _jspx_th_c_out_3.doStartTag();
    if (_jspx_th_c_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
    return false;
  }

  private boolean _jspx_meth_c_out_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_4.setPageContext(_jspx_page_context);
    _jspx_th_c_out_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${taskSection.label}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_out_4 = _jspx_th_c_out_4.doStartTag();
    if (_jspx_th_c_out_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
    return false;
  }

  private boolean _jspx_meth_c_out_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_5 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_5.setPageContext(_jspx_page_context);
    _jspx_th_c_out_5.setParent(null);
    _jspx_th_c_out_5.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${taskSection.title}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_out_5 = _jspx_th_c_out_5.doStartTag();
    if (_jspx_th_c_out_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_5);
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty reportMessage}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t<div class=\"report\">");
        if (_jspx_meth_c_out_6(_jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("</div>\r\n");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_out_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_6 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_6.setPageContext(_jspx_page_context);
    _jspx_th_c_out_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_out_6.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reportMessage}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_out_6 = _jspx_th_c_out_6.doStartTag();
    if (_jspx_th_c_out_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_6);
    return false;
  }

  private boolean _jspx_meth_c_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${taskSection.showDate}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t   <td class=\"date\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${task.date}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }
}
