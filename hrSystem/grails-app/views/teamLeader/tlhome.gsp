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
		<h3><u>Task</u></h3>
<p> </p>

	<button type="button" class="btn btn-info">
	<g:link controller="task" action="create"> <i>Add Task</i></g:link>
	</button>

</div>

<div class="second">
		<h3><u>Employee</u></h3>
<p> </p>

	<button type="button" class="btn btn-info">
	<g:link controller="employee" action="index"> <i>Show employee</i></g:link>
	</button>

</div>

<div class="first">
		<h3><u>Team</u></h3>
<p> </p>

	<button type="button" class="btn btn-info">
	<g:link controller="team" action="index"><i>Show Team</i></g:link>
	</button>

</div>

<div class="second">
		<h3><u>Task</u></h3>
<p> </p>

	<button type="button" class="btn btn-success">
	<g:link controller="task" action="index"> <i>Show Task</i></g:link>
	</button>

</div>
</div>
</div>
</body>
