/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2015-11-01 13:12:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.tag.meta.http_003a.www_lightadmin_org.jsp.breadcrumb;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.tiles.beans.MenuItem;
import org.apache.tiles.beans.SimpleMenuItem;

public final class breadcrumb_002ditem_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.servlet.jsp.JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

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
  private java.lang.String name;
  private java.lang.String link;
  private java.lang.String tooltip;

  public java.lang.String getName() {
    return this.name;
  }

  public void setName(java.lang.String name) {
    this.name = name;
    jspContext.setAttribute("name", name);
  }

  public java.lang.String getLink() {
    return this.link;
  }

  public void setLink(java.lang.String link) {
    this.link = link;
    jspContext.setAttribute("link", link);
  }

  public java.lang.String getTooltip() {
    return this.tooltip;
  }

  public void setTooltip(java.lang.String tooltip) {
    this.tooltip = tooltip;
    jspContext.setAttribute("tooltip", tooltip);
  }

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
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
    if( getName() != null ) 
      _jspx_page_context.setAttribute("name", getName());
    if( getLink() != null ) 
      _jspx_page_context.setAttribute("link", getLink());
    if( getTooltip() != null ) 
      _jspx_page_context.setAttribute("tooltip", getTooltip());

    try {
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      java.util.List tag_breadcrumb_breadcrumbItems = null;
      tag_breadcrumb_breadcrumbItems = (java.util.List) _jspx_page_context.getAttribute("tag_breadcrumb_breadcrumbItems", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (tag_breadcrumb_breadcrumbItems == null){
        throw new java.lang.InstantiationException("bean tag_breadcrumb_breadcrumbItems not found within scope");
      }
      out.write('\n');
      out.write('\n');

	MenuItem menuItem = new SimpleMenuItem();
	menuItem.setValue( name != null ? name : "Undefined" );
	menuItem.setLink( link != null ? link : "#" );
	menuItem.setTooltip( tooltip != null ? tooltip : menuItem.getValue() );

	tag_breadcrumb_breadcrumbItems.add( menuItem );

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
