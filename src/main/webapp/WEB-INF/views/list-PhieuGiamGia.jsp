<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Danh sách phiếu giảm giá</title>
    <style>
        table {
            border-collapse: collapse;
            width: 100%;
        }
        th, td {
            border: 1px solid black;
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
<h1>Danh sách phiếu giảm giá</h1>
<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Loại phiếu ID</th>
        <th>Mã</th>
        <th>Tên</th>
        <th>Số lượng</th>
        <th>Loại giảm</th>
        <th>Điều kiện tối thiểu</th>
        <th>Giá trị tối đa</th>
        <th>Thao tác</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${pggl}" var="pgg">
        <tr>
            <td>${pgg.id}</td>
            <td>${pgg.loatPhieuId}</td>
            <td>${pgg.ma}</td>
            <td>${pgg.ten}</td>
            <td>${pgg.soLuong}</td>
            <td>${pgg.loaiGiam}</td>
            <td>${pgg.dieuKienToiThieu}</td>
            <td>${pgg.giaTriToiDa}</td>
            <td>
                <a href="${pageContext.request.contextPath}/voucher-management/update?id=${pgg.id}">Sửa</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<c:if test="${empty pggl}">
    <p>Không có dữ liệu trong database</p>
</c:if>
</body>
</html>