<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Ajout d'un pilote </title>
		<style type="text/css"> <%@ include file="bootstrap.min.css" %> </style>
	</head>
	
	<body>
		<form action="/3-GestionFormation_Hibernate_JEE/AjoutVol" method="post">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<%@ include file="navbar.jsp"%>
				</div>
			</div>

			<div class="row">
				<div class="col-lg-12">
					<h1 style=text-align:center;color:blue class="display-3">AJOUTER UN VOL DANS LE REGISTRE</h1>
				</div>
			</div>
			
			<div class="form-group">
				<label for="exampleFormControlInput1">DATE DU VOL</label> 
				<input type="date" class="form-control" placeholder="Saisir la date du vol" name="datevol">
			</div>

			<div class="form-group">
				<select name="idPiloteVol">
					<c:forEach items="${listeP}" var="pilote">
						<option value="${pilote.idPilote}"> ${pilote.nom} </option>
					</c:forEach>
				</select>
			</div>

			<div class="form-group">
				<button type="button" class="btn btn-warning">Valider</button>
			</div>

		</div>
	</form>
	</body>
</html>