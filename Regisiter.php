<?php
    $con = mysqli_connect("mysql11.000webhost.com", "a1087370_Eventgo", "database1", "a1087370_EventGo");
    
    $name = $_POST["name"];
    $email= $_POST["email"];
    $username = $_POST["username"];
    $password = $_POST["password"];
    $phone_number = $_POST["phone_number"];
    $statement = mysqli_prepare($con, "INSERT INTO user (name, username, email, password, phone_number) VALUES (?, ?, ?, ?, ?)");
    mysqli_stmt_bind_param($statement, "siss", $name, $username, $age, $password);
    mysqli_stmt_execute($statement);
    
    $response = array();
    $response["success"] = true;  
    
    echo json_encode($response);
?>