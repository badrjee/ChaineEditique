<%-- Configuration de la JSP avec la syntaxe " <%@ ... %>" --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false" session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Création d'un client </title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</head>
<body>
	<h1>Bienvenue sur mon blog</h1>
	<div class="container">
 
	<form method="post">
	
	<div class="form-group">
    <input type="text" class="form-control" name="numeroAgence" placeholder="Numéro d'agence">
  </div>
  
  <div class="form-group">
    <input type="text" class="form-control" name="numeroClient" placeholder="Numéro Client">
  </div>
  
	 <div class="form-row">
	 <div class="form-group col-md-4">
      <input type="text" class="form-control" name="civility" placeholder="Civilité (1: Mr - 2: Mme - 3: Mlle)">
    </div>
    <div class="form-group col-md-4">
      <input type="text" class="form-control" name="famillyName" placeholder="Nom">
    </div>
    <div class="form-group col-md-4">
      <input type="text" class="form-control" name="firstName" placeholder="Prénom">
    </div>
  </div>
    
  <div class="form-group">
    <input type="text" class="form-control" name="mainAdress" placeholder="Adresse Principale">
  </div>
  
  <div class="form-group">
    <input type="text" class="form-control" name="complementAdress1" placeholder="Compelemnt d'adresse 1">
  </div>
  
  <div class="form-group">
    <input type="text" class="form-control" name="complementAdress2" placeholder="Compelemnt d'adresse 2">
  </div>
  
   <div class="form-row">
   <div class="form-group col-md-6">
     <input type="text" class="form-control" name="postalCode" placeholder="Code Postal">
   </div>
   <div class="form-group col-md-6">
     <input type="text" class="form-control" name="city" placeholder="Ville">
   </div>
   </div>
  
   <div class="form-row">
	 <div class="form-group col-md-4">
      <input type="text" class="form-control" name="transactionType" placeholder="type de transaction (C: Crédit - D: Débit)">
    </div>
    <div class="form-group col-md-4">
      <input type="text" class="form-control" name="transactionAmount" placeholder="Montant">
    </div>
    <div class="form-group col-md-4">
      <input type="text" class="form-control" name="date" placeholder="Date">
    </div>
  </div>
  
  <div class="form-group">
    <input type="text" class="form-control" name="soldeActuel" placeholder="Solde Actuel">
  </div>
  
  <div class="form-group">
    <input type="text" class="form-control" name="soldeAncien" placeholder="Solde Ancien">
  </div>
  
  <div class="form-group">
  <label for="comment">Description:</label>
  <textarea class="form-control" rows="5" name="comment"></textarea>
</div>
    
  <button type="submit" class="btn btn-primary">Créer un client</button>
</form>
</div>

</body>
</html>