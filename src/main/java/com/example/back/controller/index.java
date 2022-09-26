package com.example.back.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class index {
    @GetMapping("/")
    public String index(){
        return """
				<!DOCTYPE html>
				<html>
				<head>
				<meta charset="ISO-8859-1">
				<title>API REST FULL</title>
				</head>
				<body>
				<h1 style="color:red;">Api rest</h1>
				<a href="/api/users">base de datos de usuarios</a>
				<p>
				<a href="/api/customers">Base de datos de clientes</a>
				
				</body>
				</html>
				""";
    }
}
