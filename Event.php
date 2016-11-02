<?php
    $con = mysqli_connect("mysql11.000webhost.com", "a1087370_Eventgo", "database1", "a1087370_EventGo");
    
    $event = $_POST["name"];
	$date = $_POST["date"];
	$starttime = $_POST["starttime"];
	$endtime = $_POST["endtime"]
    
    $statement = mysqli_prepare($con, "INSERT INTO user (name, username, email, password) VALUES(?, ?, ?, ?)");
    mysqli_stmt_bind_param($statement, "ssss", $name, $username, $email, $password);
    mysqli_stmt_execute($statement);
    
    $response = array();
    $response["success"] = true;  
    
    echo json_encode($response);
?>