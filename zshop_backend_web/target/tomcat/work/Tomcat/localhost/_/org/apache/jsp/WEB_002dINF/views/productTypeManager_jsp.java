/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2023-03-24 08:23:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class productTypeManager_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"zh\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\" />\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\" />\r\n");
      out.write("    <title>backend</title>\r\n");
      out.write("    <link rel=\"stylesheet\"  href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/bootstrap.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\"  href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/index.css\" />\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/bootstrap.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/userSetting.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/bootstrap-paginator.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/layer/layer.js\"></script>\r\n");
      out.write("    <link rel=\"stylesheet\"  href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/zshop.css\" />\r\n");
      out.write("    <script>\r\n");
      out.write("        $(function(){\r\n");
      out.write("           $('#pagination').bootstrapPaginator({\r\n");
      out.write("               bootstrapMajorVersion:3,\r\n");
      out.write("               currentPage:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageInfo.pageNum}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(",\r\n");
      out.write("               totalPages:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageInfo.pages}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(",\r\n");
      out.write("               pageUrl:function(type,page, current){\r\n");
      out.write("                    return '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/backend/productType/findAll?pageNum='+page;\r\n");
      out.write("               },\r\n");
      out.write("               itemTexts: function (type, page, current) {\r\n");
      out.write("                   switch (type) {\r\n");
      out.write("                       case \"first\":\r\n");
      out.write("                           return \"首页\";\r\n");
      out.write("                       case \"prev\":\r\n");
      out.write("                           return \"上一页\";\r\n");
      out.write("                       case \"next\":\r\n");
      out.write("                           return \"下一页\";\r\n");
      out.write("                       case \"last\":\r\n");
      out.write("                           return \"末页\";\r\n");
      out.write("                       case \"page\":\r\n");
      out.write("                           return page;\r\n");
      out.write("                   }\r\n");
      out.write("               }\r\n");
      out.write("           });\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        // 添加商品类型\r\n");
      out.write("        function addProductType(){\r\n");
      out.write("            $.post(\r\n");
      out.write("                '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/backend/productType/add',\r\n");
      out.write("                {'name':$('#productTypeName').val()},\r\n");
      out.write("                function(result){\r\n");
      out.write("                   if(result.status==1){\r\n");
      out.write("                       layer.msg(result.message,{\r\n");
      out.write("                           time:2000,\r\n");
      out.write("                           skin:'successMsg'\r\n");
      out.write("                       },function(){\r\n");
      out.write("                           location.href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/backend/productType/findAll?pageNum='+");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageInfo.pageNum}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(";\r\n");
      out.write("                       });\r\n");
      out.write("                   }else{\r\n");
      out.write("                       layer.msg(result.message,{\r\n");
      out.write("                           time:2000,\r\n");
      out.write("                           skin:'errorMsg'\r\n");
      out.write("                       });\r\n");
      out.write("                   }\r\n");
      out.write("                }\r\n");
      out.write("            );\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        //显示商品类型\r\n");
      out.write("        function showProductType(id){\r\n");
      out.write("            $.post(\r\n");
      out.write("                '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/backend/productType/findById',\r\n");
      out.write("                {'id':id},\r\n");
      out.write("                function(result){\r\n");
      out.write("                    if(result.status==1){\r\n");
      out.write("                        $('#proTypeNum').val(result.data.id);\r\n");
      out.write("                        $('#proTypeName').val(result.data.name);\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            );\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        //修改商品类型的名称\r\n");
      out.write("        function modifyName(){\r\n");
      out.write("            $.ajax({\r\n");
      out.write("                type:'post',\r\n");
      out.write("                url:'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/backend/productType/modifyName',\r\n");
      out.write("                data:{'id': $('#proTypeNum').val(),'name':$('#proTypeName').val()},\r\n");
      out.write("                dataType:'json',\r\n");
      out.write("                success:function(result){\r\n");
      out.write("                    if(result.status==1){\r\n");
      out.write("                        layer.msg(result.message,{\r\n");
      out.write("                            time:2000,\r\n");
      out.write("                            skin:'successMsg'\r\n");
      out.write("                        },function(){\r\n");
      out.write("                            //重新加载数据\r\n");
      out.write("                            location.href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/backend/productType/findAll?pageNum='+");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageInfo.pageNum}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(";\r\n");
      out.write("                        })\r\n");
      out.write("                    }else{\r\n");
      out.write("                        layer.msg(result.message,{\r\n");
      out.write("                            time:2000,\r\n");
      out.write("                            skin:'errorsMsg'\r\n");
      out.write("                        })\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        //显示确认删除的提示\r\n");
      out.write("        function showDeleteModal(id){\r\n");
      out.write("            $('#deleteProductTypeId').val(id);\r\n");
      out.write("            $('#deleteProductTypeModal').modal('show');\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        //删除商品类型\r\n");
      out.write("        function deleteProductType(){\r\n");
      out.write("            $.get(\r\n");
      out.write("                '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/backend/productType/removeById',\r\n");
      out.write("                {'id':$('#deleteProductTypeId').val()},\r\n");
      out.write("                function(result){\r\n");
      out.write("                    if(result.status==1){\r\n");
      out.write("                        layer.msg('删除成功',{\r\n");
      out.write("                            time:2000,\r\n");
      out.write("                            skin:'successMsg'\r\n");
      out.write("                        },function(){\r\n");
      out.write("                            //重新加载数据\r\n");
      out.write("                            location.href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/backend/productType/findAll?pageNum='+");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageInfo.pageNum}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(";\r\n");
      out.write("                        })\r\n");
      out.write("                    }else{\r\n");
      out.write("                        layer.msg('删除失败',{\r\n");
      out.write("                            time:2000,\r\n");
      out.write("                            skin:'errorsMsg'\r\n");
      out.write("                        })\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            );\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        //修改商品类型的状态\r\n");
      out.write("        function modifyStatus(id,btn){\r\n");
      out.write("            $.get(\r\n");
      out.write("                    '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/backend/productType/modifyStatus',\r\n");
      out.write("                    {'id':id},\r\n");
      out.write("                    function(result){\r\n");
      out.write("                        if(result.status==1){\r\n");
      out.write("                            //局部刷新\r\n");
      out.write("                            let $td=$(btn).parent().prev();\r\n");
      out.write("                            if($td.text().trim()=='启用'){\r\n");
      out.write("                                $td.text('禁用');\r\n");
      out.write("                                $(btn).val('启用').removeClass('btn-danger').addClass('btn-success');\r\n");
      out.write("                            }else{\r\n");
      out.write("                                $td.text('启用');\r\n");
      out.write("                                $(btn).val('禁用').removeClass('btn-success').addClass('btn-danger');\r\n");
      out.write("                            }\r\n");
      out.write("                        }\r\n");
      out.write("                    }\r\n");
      out.write("            );\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"panel panel-default\" id=\"userSet\">\r\n");
      out.write("    <div class=\"panel-heading\">\r\n");
      out.write("        <h3 class=\"panel-title\">商品类型管理</h3>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"panel-body\">\r\n");
      out.write("        <input type=\"button\" value=\"添加商品类型\" class=\"btn btn-primary\" id=\"doAddProTpye\">\r\n");
      out.write("        <br>\r\n");
      out.write("        <br>\r\n");
      out.write("        <div class=\"show-list text-center\">\r\n");
      out.write("            <table class=\"table table-bordered table-hover\" style='text-align: center;'>\r\n");
      out.write("                <thead>\r\n");
      out.write("                <tr class=\"text-danger\">\r\n");
      out.write("                    <th class=\"text-center\">编号</th>\r\n");
      out.write("                    <th class=\"text-center\">类型名称</th>\r\n");
      out.write("                    <th class=\"text-center\">状态</th>\r\n");
      out.write("                    <th class=\"text-center\">操作</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("                <tbody id=\"tb\">\r\n");
      out.write("                    ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </tbody>\r\n");
      out.write("            </table>\r\n");
      out.write("            <!-- 使用bootstrap-paginator实现分页 -->\r\n");
      out.write("            <ul id=\"pagination\"></ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- 添加商品类型 start -->\r\n");
      out.write("<div class=\"modal fade\" tabindex=\"-1\" id=\"ProductType\">\r\n");
      out.write("    <!-- 窗口声明 -->\r\n");
      out.write("    <div class=\"modal-dialog modal-lg\">\r\n");
      out.write("        <!-- 内容声明 -->\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <!-- 头部、主体、脚注 -->\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <button class=\"close\" data-dismiss=\"modal\">&times;</button>\r\n");
      out.write("                <h4 class=\"modal-title\">添加商品类型</h4>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body text-center\">\r\n");
      out.write("                <div class=\"row text-right\">\r\n");
      out.write("                    <label for=\"productTypeName\" class=\"col-sm-4 control-label\">类型名称：</label>\r\n");
      out.write("                    <div class=\"col-sm-4\">\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"productTypeName\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <br>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("                <button class=\"btn btn-primary addProductType\" onclick=\"addProductType()\">添加</button>\r\n");
      out.write("                <button class=\"btn btn-primary cancel\" data-dismiss=\"modal\">取消</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- 添加商品类型 end -->\r\n");
      out.write("\r\n");
      out.write("<!-- 修改商品类型 start -->\r\n");
      out.write("<div class=\"modal fade\" tabindex=\"-1\" id=\"myProductType\">\r\n");
      out.write("    <!-- 窗口声明 -->\r\n");
      out.write("    <div class=\"modal-dialog modal-lg\">\r\n");
      out.write("        <!-- 内容声明 -->\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <!-- 头部、主体、脚注 -->\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <button class=\"close\" data-dismiss=\"modal\">&times;</button>\r\n");
      out.write("                <h4 class=\"modal-title\">修改商品类型</h4>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body text-center\">\r\n");
      out.write("                <div class=\"row text-right\">\r\n");
      out.write("                    <label for=\"proTypeNum\" class=\"col-sm-4 control-label\">编号：</label>\r\n");
      out.write("                    <div class=\"col-sm-4\">\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"proTypeNum\" readonly>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <br>\r\n");
      out.write("                <div class=\"row text-right\">\r\n");
      out.write("                    <label for=\"proTypeName\" class=\"col-sm-4 control-label\">类型名称</label>\r\n");
      out.write("                    <div class=\"col-sm-4\">\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"proTypeName\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("                <button class=\"btn btn-warning updateProType\" onclick=\"modifyName()\">修改</button>\r\n");
      out.write("                <button class=\"btn btn-primary cancel\" data-dismiss=\"modal\">取消</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- 修改商品类型 end -->\r\n");
      out.write("\r\n");
      out.write("<!-- 确认删除 start -->\r\n");
      out.write("<div class=\"modal fade\" tabindex=\"-1\" id=\"deleteProductTypeModal\">\r\n");
      out.write("    <!-- 窗口声明 -->\r\n");
      out.write("    <div class=\"modal-dialog\">\r\n");
      out.write("        <!-- 内容声明 -->\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <!-- 头部、主体、脚注 -->\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <button class=\"close\" data-dismiss=\"modal\">&times;</button>\r\n");
      out.write("                <h4 class=\"modal-title\">提示消息</h4>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body text-center\">\r\n");
      out.write("                <h4>确认要删除该商品类型吗？</h4>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("                <input type=\"hidden\" id=\"deleteProductTypeId\">\r\n");
      out.write("                <button class=\"btn btn-primary updateProType\" onclick=\"deleteProductType()\" data-dismiss=\"modal\">删除</button>\r\n");
      out.write("                <button class=\"btn btn-primary cancel\" data-dismiss=\"modal\">取消</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- 确认删除 end -->\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/views/productTypeManager.jsp(182,20) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/productTypeManager.jsp(182,20) '${pageInfo.list}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${pageInfo.list}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/productTypeManager.jsp(182,20) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("productType");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        <tr>\r\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${productType.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${productType.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                            <td>\r\n");
          out.write("                                ");
          if (_jspx_meth_c_005fif_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\r\n");
          out.write("                                ");
          if (_jspx_meth_c_005fif_005f1(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\r\n");
          out.write("                            </td>\r\n");
          out.write("                            <td class=\"text-center\">\r\n");
          out.write("                                <input type=\"button\" class=\"btn btn-warning btn-sm doProTypeModify\" value=\"修改\" onclick=\"showProductType(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${productType.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write(")\">\r\n");
          out.write("                                <input type=\"button\" class=\"btn btn-warning btn-sm doProTypeDelete\" onclick=\"showDeleteModal(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${productType.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write(")\" value=\"删除\">\r\n");
          out.write("                                ");
          if (_jspx_meth_c_005fif_005f2(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\r\n");
          out.write("                                ");
          if (_jspx_meth_c_005fif_005f3(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\r\n");
          out.write("                            </td>\r\n");
          out.write("                        </tr>\r\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /WEB-INF/views/productTypeManager.jsp(187,32) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${productType.status==1}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write('启');
        out.write('用');
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /WEB-INF/views/productTypeManager.jsp(188,32) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${productType.status==0}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write('禁');
        out.write('用');
        int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /WEB-INF/views/productTypeManager.jsp(193,32) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${productType.status==1}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                    <input type=\"button\" class=\"btn btn-danger btn-sm doProTypeDisable\" value=\"禁用\" onclick=\"modifyStatus(");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${productType.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write(",this)\">\r\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /WEB-INF/views/productTypeManager.jsp(196,32) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${productType.status==0}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
    if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                    <input type=\"button\" class=\"btn btn-success btn-sm doProTypeDisable\" value=\"启用\" onclick=\"modifyStatus(");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${productType.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write(",this)\">\r\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
    return false;
  }
}
