<!doctype html>
<html>
<head>

<meta name="layout" content="main"/>
<title> Sainsbury's </title>

		<asset:link rel="icon" href="favicon.ico" type="image/x-ico"/> 

</head>
</body>

<div class="row">
<h1> Welcome to Sainsbury's Supermarket </h1>

<formset>
	<legend> Search </legend>

<table> 
	<g:form action="advResults">

<tr>
	<td> Full name</td>
	<td><g:textField name="fullName"/></td>
</tr>

<tr>
	<td>employeeID</td>
	<td><g:textField name="employeeID"/></td>
</tr>

<tr>
	<td> taxCode</td>
	<td><g:textField name="taxCode"/></td>
</tr>

<tr>
	<td>Query Type:</td>
	<td><g:radioGroup name="queryType"labels="['And','Or','Not']"
		values="['and','or','not']" value="and">

		${it.radio} ${it.label}
		
		</g:radioGroup>
	</td>
</tr>

<tr>
	<td/>
	<td>
	<g:submitButton name="Search" value="Search"/></td>
	</tr>
	</g:form>
	</table>
	</formset>
	</div>
	</body>
	</html>












