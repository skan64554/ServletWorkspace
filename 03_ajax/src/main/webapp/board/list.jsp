<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%
    ArrayList<String> list = (ArrayList<String>)session.getAttribute("list");
%>

<h2>일반게시판</h2>

<table border="1">
    <tr>
        <th>번호</th>
        <th>제목</th>
        <th>작성자</th>
        <th>작성일</th>
    </tr>

<%
    int i = 1;
    for(String row : list){
        String[] data = row.split(",");
%>
    <tr>
        <td><%= i++ %></td>
        <td><%= data[0] %></td>
        <td><%= data[1] %></td>
        <td><%= data[2] %></td>
    </tr>
<%
    }
%>
</table>



