<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: minhd
  Date: 18/12/2025
  Time: 2:19 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List</title>
</head>
<body>
    <h1>Danh sách phiếu giảm giá</h1>
    <table border = "1">
        <tr>ID</tr>
        <tr>Loại phiếu ID</tr>
        <tr>Mã</tr>
        <tr>Tên</tr>
        <tr>Số lượng</tr>
        <tr>Loại giảm</tr>
        <tr>Điều kiện tối thiếu</tr>
        <tr>Giá trị tối đa</tr>
        <tr>
            <c:forEach>
                <td>${pggl.id}</td>
                <td>${pggl.loaiPhieuId}</td>
                <td>${pggl.ma}</td>
                <td>${pggl.ten}</td>
                <td>${pggl.soLuong}</td>
                <td>${pggl.loaiGiam}</td>
                <td>${pggl.dieuKienToiThieu}</td>
                <td>${pggl.giaTriToiDa}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/voucher-management/update?id=${pgg.id}">Sửa</a>
                </td>
            </c:forEach>
        </tr>
    </table>
</body>
</html>
