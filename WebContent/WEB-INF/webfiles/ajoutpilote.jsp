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
		<form action="/3-GestionFormation_Hibernate_JEE/AjoutPilote" method="post">
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
			
			<div class="form-group">
				<label for="exampleFormControlInput1">Nom du pilote</label> 
				<input type="text" class="form-control" placeholder="Saisir le nom" name="nom">
			</div>

			<div class="form-group">
				<label for="exampleFormControlInput1">Prénom du pilote</label> 
				<input type="text" class="form-control" placeholder="Saisir le prénom" name="prenom">
			</div>

			<div class="form-group">
				<label for="exampleFormControlInput1">Numéro téléphone</label> 
				<input type="text" class="form-control" placeholder="Saisir le numéro de téléphone" name="telephone">
			</div>

			<div class="form-group">
				<button type="button" class="btn btn-warning">Valider</button>
			</div>

		</div>
	</form>
	</body>
</html>