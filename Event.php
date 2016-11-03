<?php
    $con = mysqli_connect("mysql11.000webhost.com", "a1087370_Eventgo", "database1", "a1087370_EventGo");
    
    $event = $_POST["name"];
	$date = $_POST["date"];
	$starttimwwe = $_POST["starttime"];
	$endtime = $_POST["endtime"];
    
    $statement = mysqli_prepare($con, "INSERT INTO user (name, date, starttime, endtime) VALUES(?, ?, ?, ?)");
    mysqli_stmt_bind_param($statement, "ssss", $name, $date, $starttime, $endtime);
    mysqli_stmt_execute($statement);
    
    $response = array();
    $response["success"] = true;  
    
    echo json_encode($response);
?>