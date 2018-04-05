<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Sainsbury's</title>
</head>
<body>
    

    <div id="content" role="main">

	<div class="row">
	
	<div class="first">
		<h3><u>Employee</u></h3>
<p> </p>

	<button type="button" class="btn btn-info">
	<g:link controller="employee" action="create"> <i> Add Employee </i></g:link>
	</button>

</div>

<div class="second">
		<h3><u>Team Leader</u></h3>
<p> </p>

	<button type="button" class="btn btn-info">
	<g:link controller="teamLeader" action="create"> <i> Add Team Leader </i></g:link>
	</button>

</div>

<div class="first">
		<h3><u>Team</u></h3>
<p> </p>

	<button type="button" class="btn btn-info">
	<g:link controller="team" action="create"> <i> Add Team </i></g:link>
	</button>

</div>

<div class="second">
		<h3><u>Task</u></h3>
<p> </p>

	<button type="button" class="btn btn-info">
	<g:link controller="task" action="create"> <i> Add Task </i></g:link>
	</button>

</div>

<div class="first">
		<h3><u>Search</u></h3>
<p> </p>

	<button type="button" class="btn btn-success">
	<g:link controller="employee" action="advSearch"> <i> Search</i> </g:link>
	</button>

</div>

</div>
</div>
</body>
</html>




