/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.69
 * Generated at: 2023-07-19 13:44:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import hyphen.entity.Doctor;
import hyphen.dao.DoctorDao;
import hyphen.entity.Appointment;
import hyphen.dao.AppointmentDAO;
import hyphen.helper.HelperFunction;
import java.util.List;
import hyphen.conn.DBConnect;
import java.sql.Connection;

public final class patient_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/admin/../header_link.jsp", Long.valueOf(1689656687043L));
    _jspx_dependants.put("jar:file:/home/hyphen/Documents/Javahyphen/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/12-Maven-HospitalMGMT-Internal/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
    _jspx_dependants.put("/admin/../footer_link.jsp", Long.valueOf(1689647789695L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1688798783080L));
    _jspx_dependants.put("/admin/admin_navbar.jsp", Long.valueOf(1689515720011L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("hyphen.helper.HelperFunction");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("java.sql.Connection");
    _jspx_imports_classes.add("hyphen.dao.AppointmentDAO");
    _jspx_imports_classes.add("hyphen.entity.Doctor");
    _jspx_imports_classes.add("hyphen.dao.DoctorDao");
    _jspx_imports_classes.add("hyphen.entity.Appointment");
    _jspx_imports_classes.add("hyphen.conn.DBConnect");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fredirect_0026_005furl_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fremove_0026_005fvar_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fredirect_0026_005furl_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fremove_0026_005fvar_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fredirect_0026_005furl_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fremove_0026_005fvar_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("	<meta charset=\"UTF-8\">\n");
      out.write("	<title>Doctor List - Add doctor</title>\n");
      out.write("	");
      out.write("\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\">\n");
      out.write("	\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("	\n");
      out.write("	<link rel=\"stylesheet\" href=\"../css/style.css\">\n");
      out.write("	\n");
      out.write("<style type=\"text/css\">\n");
      out.write("	.badge-btn {\n");
      out.write("		padding: 4px 6px;\n");
      out.write("		border: 1px solid #ddcccc;\n");
      out.write("		display: flex;\n");
      out.write("		border-radius: 4px;\n");
      out.write("		cursor: pointer;\n");
      out.write("	}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body class=\"bg-light\">\n");
      out.write("\n");
      out.write("	");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-light\"\n");
      out.write("	style=\"background-color: #e3f2fd;\">\n");
      out.write("	<a class=\"navbar-brand\" href=\"#\"> <i class=\"fa fa-home\"></i> Hospital MGMT</a>\n");
      out.write("	<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\n");
      out.write("		data-target=\"#navbarNav\" aria-controls=\"navbarNav\"\n");
      out.write("		aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("		<span class=\"navbar-toggler-icon\"></span>\n");
      out.write("	</button>\n");
      out.write("	<div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("		<ul class=\"navbar-nav mb-2 mb-lg-0 ml-auto\"> \n");
      out.write("		\n");
      out.write("			<li class=\"nav-item\">\n");
      out.write("				<a class=\"nav-link\" href=\"index.jsp\">Home</a>\n");
      out.write("			</li>\n");
      out.write("			<li class=\"nav-item\">\n");
      out.write("				<a class=\"nav-link\" href=\"doctor.jsp\">Doctor</a>\n");
      out.write("			</li>\n");
      out.write("			<li class=\"nav-item\">\n");
      out.write("				<a class=\"nav-link\" href=\"patient.jsp\">Patient</a>\n");
      out.write("			</li>	\n");
      out.write("									\n");
      out.write("		</ul>\n");
      out.write("		\n");
      out.write("		<ul class=\"navbar-nav ml-auto mb-2 mb-lg-0\"> \n");
      out.write("		\n");
      out.write("            <li class=\"nav-item dropdown ml-auto\">\n");
      out.write("                <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdownMenuLink\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\"> Admin</a>\n");
      out.write("                <div class=\"dropdown-menu dropdown-menu-right\" aria-labelledby=\"navbarDropdownMenuLink\">\n");
      out.write("					<a class=\"dropdown-item\" href=\"../admin_logout\"><i class=\"fa fa-sign-out\"></i> Logout</a>\n");
      out.write("                </div>\n");
      out.write("            </li>								\n");
      out.write("\n");
      out.write("		</ul>			\n");
      out.write("		\n");
      out.write("	</div>\n");
      out.write("</nav>");
      out.write("\n");
      out.write("	\n");
      out.write("	");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("	<div class=\"container-fluid pt-2\"> \n");
      out.write("	\n");
      out.write("		<!-- OUR TEAMs  -->\n");
      out.write("		<div class=\"media text-muted pt-3 mb-0\">\n");
      out.write("			<img\n");
      out.write("				data-src=\"holder.js/32x32?theme=thumb&amp;bg=e83e8c&amp;fg=e83e8c&amp;size=1\"\n");
      out.write("				alt=\"32x32\" class=\"mr-2 rounded\"\n");
      out.write("				src=\"data:image/svg+xml;charset=UTF-8,%3Csvg%20width%3D%2232%22%20height%3D%2232%22%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%2032%2032%22%20preserveAspectRatio%3D%22none%22%3E%3Cdefs%3E%3Cstyle%20type%3D%22text%2Fcss%22%3E%23holder_18945cb716a%20text%20%7B%20fill%3A%23e83e8c%3Bfont-weight%3Abold%3Bfont-family%3AArial%2C%20Helvetica%2C%20Open%20Sans%2C%20sans-serif%2C%20monospace%3Bfont-size%3A2pt%20%7D%20%3C%2Fstyle%3E%3C%2Fdefs%3E%3Cg%20id%3D%22holder_18945cb716a%22%3E%3Crect%20width%3D%2232%22%20height%3D%2232%22%20fill%3D%22%23e83e8c%22%3E%3C%2Frect%3E%3Cg%3E%3Ctext%20x%3D%2212.134963274002075%22%20y%3D%2217.09129664897919%22%3E32x32%3C%2Ftext%3E%3C%2Fg%3E%3C%2Fg%3E%3C%2Fsvg%3E\"\n");
      out.write("				data-holder-rendered=\"true\" style=\"width: 32px; height: 32px;\">\n");
      out.write("			\n");
      out.write("			<nav aria-label=\"breadcrumb\" class=\"media-body mb-0 lh-125 border-bottom border-gray\">\n");
      out.write("			  <ol class=\"breadcrumb\" style=\"background: none; padding-bottom: 0;\">\n");
      out.write("			    <li class=\"breadcrumb-item\"><a href=\"index.jsp\">Home</a></li>\n");
      out.write("			    <li class=\"breadcrumb-item active\" style=\"display: flex;\">Patient - \n");
      out.write("			   		<small class=\"nav-link mb-0 badge-btn\" style=\"margin-left 5px;\"> list of patient </small>\n");
      out.write("			    </li>\n");
      out.write("			  </ol>\n");
      out.write("			</nav>\n");
      out.write("\n");
      out.write("			");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("			");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("		</div>\n");
      out.write("		\n");
      out.write("			<div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12 mt-3\">\n");
      out.write("\n");
      out.write("				<div class=\"card\">\n");
      out.write("					<div class=\"card-body table-responsive\">\n");
      out.write("							<h1 class=\"badge badge-primary\" style=\"font-size: xx-large;\"> \n");
      out.write("								  Patient List <span class=\"badge\" style=\"font-size: 1.2rem; margin-left: 10px;  background-color: rgb(233,84,140)\">Doctor's</span>				\n");
      out.write("							</h1>					\n");
      out.write("							\n");
      out.write("						<table class=\"table table-striped\">\n");
      out.write("							<thead>\n");
      out.write("								<tr>\n");
      out.write("									<th scope=\"col\">#id</th>\n");
      out.write("									<th scope=\"col\">Full Name</th>\n");
      out.write("									<th scope=\"col\">Email</th>\n");
      out.write("									<th scope=\"col\">Gender</th>\n");
      out.write("									<th scope=\"col\">Age</th>\n");
      out.write("									<th scope=\"col\">Mobile No</th>\n");
      out.write("									<th scope=\"col\">Diseases</th>\n");
      out.write("									<th scope=\"col\">Doctor Name</th>\n");
      out.write("									<th scope=\"col\">Appointment Date</th>\n");
      out.write("									<th scope=\"col\">Status</th>\n");
      out.write("								</tr>\n");
      out.write("							<tbody>\n");
      out.write("								");

									AppointmentDAO dao = new AppointmentDAO(DBConnect.getConnection()); 
									List<Appointment> list = dao.getAllAppointment(); 
									DoctorDao docDao = new DoctorDao(DBConnect.getConnection());
									
									for(Appointment appon : list) {
									Doctor doc = docDao.getDoctorById(appon.getDoc_id());
								
      out.write("\n");
      out.write("									<tr>\n");
      out.write("										<td>");
      out.print( appon.getAppon_id() );
      out.write("</td>\n");
      out.write("										<td>");
      out.print( appon.getName() );
      out.write("</td>\n");
      out.write("										<td>");
      out.print( appon.getEmail() );
      out.write("</td>\n");
      out.write("										<td>");
      out.print( appon.getGender() );
      out.write("</td>\n");
      out.write("										<td>");
      out.print( appon.getAge() );
      out.write("</td>\n");
      out.write("										<td>");
      out.print( appon.getMobno() );
      out.write("</td>\n");
      out.write("										<td>");
      out.print( appon.getDisease() );
      out.write("</td>\n");
      out.write("										<td>");
      out.print( doc.getName() );
      out.write("</td>\n");
      out.write("										<td>");
      out.print( HelperFunction.formateDate(appon.getAppon_date(), "-") );
      out.write("</td>\n");
      out.write("										\n");
      out.write("										<td>\n");
      out.write("											");

												if(appon.getStatus_updateAt() == null) {
											
      out.write("\n");
      out.write("												");
      out.print( HelperFunction.buttonFormat(appon.getAppon_status(), "small", "pending", "yes") );
      out.write("\n");
      out.write("											");
 } else { 
      out.write("\n");
      out.write("												");
      out.print( HelperFunction.buttonFormat(appon.getAppon_status(), "small", "ok", "yes") );
      out.write("\n");
      out.write("											");
 } 
      out.write("\n");
      out.write("										</td>									\n");
      out.write("									</tr>\n");
      out.write("								");
 } 
      out.write("								\n");
      out.write("							</tbody>\n");
      out.write("						</table>\n");
      out.write("					</div>\n");
      out.write("				</div>\n");
      out.write("\n");
      out.write("			</div>\n");
      out.write("		\n");
      out.write("	</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("	");
      out.write("\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\"></script>\n");
      out.write("<script\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\"></script>\n");
      out.write("<script\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\"></script>\n");
      out.write("	\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.7.0.min.js\" ></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("	$(\"#success-alert\").fadeTo(2000, 500).slideUp(500, function() {\n");
      out.write("		$(\"#success-alert\").slideUp(500);\n");
      out.write("	});\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("	$(\"#error-alert\").fadeTo(2000, 500).slideUp(500, function() {\n");
      out.write("		$(\"#error-alert\").slideUp(500);\n");
      out.write("	});\n");
      out.write("</script>");
      out.write("\n");
      out.write("	\n");
      out.write("	\n");
      out.write("</body>\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /admin/patient.jsp(38,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty adminObj}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write('\n');
          out.write('	');
          out.write('	');
          if (_jspx_meth_c_005fredirect_005f0(_jspx_th_c_005fif_005f0, _jspx_page_context))
            return true;
          out.write('\n');
          out.write('	');
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fredirect_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:redirect
    org.apache.taglibs.standard.tag.rt.core.RedirectTag _jspx_th_c_005fredirect_005f0 = (org.apache.taglibs.standard.tag.rt.core.RedirectTag) _005fjspx_005ftagPool_005fc_005fredirect_0026_005furl_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.RedirectTag.class);
    boolean _jspx_th_c_005fredirect_005f0_reused = false;
    try {
      _jspx_th_c_005fredirect_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fredirect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
      // /admin/patient.jsp(39,2) name = url type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fredirect_005f0.setUrl("../admin_logout");
      int _jspx_eval_c_005fredirect_005f0 = _jspx_th_c_005fredirect_005f0.doStartTag();
      if (_jspx_th_c_005fredirect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fredirect_0026_005furl_005fnobody.reuse(_jspx_th_c_005fredirect_005f0);
      _jspx_th_c_005fredirect_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fredirect_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fredirect_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(null);
      // /admin/patient.jsp(61,3) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty successMsg}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("				<div style=\"z-index: 1; position: absolute; right: 0; margin-right: 5px;\">\n");
          out.write("					<div class=\"alert-div\" id=\"success-alert\" style=\"position: relative\">\n");
          out.write("						<div class=\"alert alert-success alert-dismissible fade show\"\n");
          out.write("							role=\"alert\">\n");
          out.write("							<strong>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${successMsg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</strong>\n");
          out.write("\n");
          out.write("							<hr>\n");
          out.write("							<p class=\"mb-0\">Close the message box by clicking X to\n");
          out.write("								right.</p>\n");
          out.write("\n");
          out.write("							<button type=\"button\" class=\"close\" data-dismiss=\"alert\"\n");
          out.write("								aria-label=\"Close\">\n");
          out.write("								<span aria-hidden=\"true\">&times;</span>\n");
          out.write("							</button>\n");
          out.write("						</div>\n");
          out.write("					</div>\n");
          out.write("				</div>\n");
          out.write("					");
          if (_jspx_meth_c_005fremove_005f0(_jspx_th_c_005fif_005f1, _jspx_page_context))
            return true;
          out.write("\n");
          out.write("			");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fremove_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f1, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:remove
    org.apache.taglibs.standard.tag.common.core.RemoveTag _jspx_th_c_005fremove_005f0 = (org.apache.taglibs.standard.tag.common.core.RemoveTag) _005fjspx_005ftagPool_005fc_005fremove_0026_005fvar_005fnobody.get(org.apache.taglibs.standard.tag.common.core.RemoveTag.class);
    boolean _jspx_th_c_005fremove_005f0_reused = false;
    try {
      _jspx_th_c_005fremove_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fremove_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f1);
      // /admin/patient.jsp(79,5) name = var type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fremove_005f0.setVar("successMsg");
      int _jspx_eval_c_005fremove_005f0 = _jspx_th_c_005fremove_005f0.doStartTag();
      if (_jspx_th_c_005fremove_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fremove_0026_005fvar_005fnobody.reuse(_jspx_th_c_005fremove_005f0);
      _jspx_th_c_005fremove_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fremove_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fremove_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f2_reused = false;
    try {
      _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f2.setParent(null);
      // /admin/patient.jsp(82,3) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty errorMsg}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
      if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("				<div style=\"z-index: 1; position: absolute; right: 0;\">\n");
          out.write("					<div class=\"alert-div\" id=\"error-alert\">\n");
          out.write("						<div class=\"alert alert-danger alert-dismissible fade show\"\n");
          out.write("							role=\"alert\">\n");
          out.write("							<strong>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${errorMsg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</strong>\n");
          out.write("\n");
          out.write("							<hr>\n");
          out.write("							<p class=\"mb-0\">Close the message box by clicking X to\n");
          out.write("								right.</p>\n");
          out.write("							<button type=\"button\" class=\"close\" data-dismiss=\"alert\"\n");
          out.write("								aria-label=\"Close\">\n");
          out.write("								<span aria-hidden=\"true\">&times;</span>\n");
          out.write("							</button>\n");
          out.write("						</div>\n");
          out.write("					</div>\n");
          out.write("				</div>\n");
          out.write("				");
          if (_jspx_meth_c_005fremove_005f1(_jspx_th_c_005fif_005f2, _jspx_page_context))
            return true;
          out.write("\n");
          out.write("			");
          int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      _jspx_th_c_005fif_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f2, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fremove_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:remove
    org.apache.taglibs.standard.tag.common.core.RemoveTag _jspx_th_c_005fremove_005f1 = (org.apache.taglibs.standard.tag.common.core.RemoveTag) _005fjspx_005ftagPool_005fc_005fremove_0026_005fvar_005fnobody.get(org.apache.taglibs.standard.tag.common.core.RemoveTag.class);
    boolean _jspx_th_c_005fremove_005f1_reused = false;
    try {
      _jspx_th_c_005fremove_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fremove_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
      // /admin/patient.jsp(99,4) name = var type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fremove_005f1.setVar("errorMsg");
      int _jspx_eval_c_005fremove_005f1 = _jspx_th_c_005fremove_005f1.doStartTag();
      if (_jspx_th_c_005fremove_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fremove_0026_005fvar_005fnobody.reuse(_jspx_th_c_005fremove_005f1);
      _jspx_th_c_005fremove_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fremove_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fremove_005f1_reused);
    }
    return false;
  }
}
