<?php
    $con = mysqli_connect("IP", "DB id", "DB pass", "DB table");

    $userID = $_POST["userID"];

    $statement = mysqli_prepare($con, "DELETE FROM USER WHERE userID = ?");
    mysqli_stmt_bind_param($statement, "s", $userID);
    mysqli_stmt_execute($statement);

    $response = array();
    $response["success"] = true;

    echo json_encode($response);
?>
