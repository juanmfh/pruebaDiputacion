<%-- 
    Document   : usuariosGrupoRescate
    Created on : Apr 30, 2013, 7:56:06 PM
    Author     : JuanM
--%>

<%@page import="TAWproject.entity.Usuario"%>
<%@ page language="java" import="java.util.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>


<!DOCTYPE html>
<html lang="es">
    <head>
        <base href="<%=basePath%>">
        <meta charset="utf-8" />
        <title>Usuarios</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="pragma" content="no-cache">
        <meta http-equiv="cache-control" content="no-cache">
        <meta http-equiv="expires" content="0">
        <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
        <meta http-equiv="description" content="This is my page">
        <!-- Bootstrap -->
        <link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
    </head>
    <script src="http://code.jquery.com/jquery.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <body>
        <div class="container">
            <h1>Usuarios</h1>
            <div class="row">
                <table class="table table-striped table-bordered table-hover">
                    <caption>Lista de usuarios</caption>
                    <thead>
                        <tr>
                            <th>Select</th>
                            <th>Nombre</th>
                            <th>Nick</th>
                            <th>Grupo Asignado</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>
                                <label class="radio">
                                    <input type="radio" name="optionsRadios" id="optionsRadios1" value="option1" checked>
                                </label>
                            </td>
                            <td>Alba Sanchez</td>
                            <td>alba_s</td>
                            <td>31</td>
                        </tr>
                        <tr>
                            <td>
                                <label class="radio">
                                    <input type="radio" name="optionsRadios" id="optionsRadios2" value="option2" >
                                </label>
                            </td>
                            <td>Marco Aurelio</td>
                            <td>mAur</td>
                            <td>12</td>
                        </tr>
                        <tr>
                            <td>
                                <label class="radio">
                                    <input type="radio" name="optionsRadios" id="optionsRadios3" value="option3" >
                                </label>
                            </td>
                            <td>Javier Asencio</td>
                            <td>javiA</td>
                            <td>34</td>
                        </tr>
                    </tbody>
                </table>
            </div>
            <div class="row ">
                <button class="btn btn-info"  type="button">Modificar</button>
                <button class="btn btn-primary offset2"  type="button">Volver</button>
            </div>
        </div>
    </body>
</html>