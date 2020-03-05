<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Liste des vols</title>
		<style type="text/css"> <%@ include file="bootstrap.min.css" %> </style>
		
	</head>
	
	<body>
	<form action="/3-GestionVol_Hibernate_JEE/ListeVol" method="post">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<%@ include file="navbar.jsp"%>
				</div>
			</div>

			<div class="row">
				<div class="col-lg-12">
					<h1 style=text-align:center;color:blue class="display-3">LISTE DES VOLS</h1>
				</div>
			</div>
			
			<div class="row">
				<div class="col-lg-12">
					<table class="table" style=text-align:center>
						<thead class="thead-dark">
							<tr>
								<th scope="col"><h4>IDENTIFIANT</h4></th>
								<th scope="col"><h4>DATE VOL</h4></th>
								<th scope="col"><h4>PILOTE</h4></th>
								
							</tr>
						</thead>
					</table>
				</div>
			</div>
				
			<div class="row">
				<div class="col-lg-12">
					<table class="table" style=text-align:center>
						<c:forEach items="${listeV}" var="list">
							<tr>
								<td><h6>${list.idVol}</h6></td>
								<td><h6>${list.dateVol}</h6></td>
								<td><h6>${list.pilote.idPilote}</h6></td>
							</tr>
						</c:forEach>
					</table>
				</div>
			</div>
		</div>
	</form>
</body>
</html>