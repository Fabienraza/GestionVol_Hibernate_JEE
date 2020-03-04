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
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<%@ include file="navbar.jsp"%>
				</div>
			</div>
		
			<div class="row">
				<div class="col-lg-12">
					<h1 style=text-align:center;color:blue class="display-3">AJOUTER UN PILOTE DANS LE REGISTRE</h1>
				</div>
			</div>
		<form action="/3-GestionVol_Hibernate_JEE/ajoutpilote" method="post">
			<div class="form-group">
				<label for="exampleFormControlInput1">Nom du pilote</label> 
				<input type="text" class="form-control" placeholder="Saisir le nom" name="nom">

				<label for="exampleFormControlInput1">Prénom du pilote</label> 
				<input type="text" class="form-control" placeholder="Saisir le prénom" name="prenom">

				<label for="exampleFormControlInput1">Numéro téléphone</label> 
				<input type="text" class="form-control" placeholder="Saisir le numéro de téléphone" name="telephone">

				<button type="submit" class="btn btn-warning">Valider</button>
			</div>
		</form>
		</div>

	</body>
</html>