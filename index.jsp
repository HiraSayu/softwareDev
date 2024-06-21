<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="NewFile.css">
<title>Music Search</title>
</head>
<body>
    <h1>Music Search</h1>
    
    <h3>好きなジャンルを選択してください</h3>
    <ul class="genrelist">
        <form action="MusicSearch" method="post">
            <button type="submit" name="action" value="kpop">Kpop</button>
            <button type="submit" name="action" value="jpop">Jpop</button>
            <button type="submit" name="action" value="wpop">Western Pop</button>
        </form>
    </ul>
    
    <h2>${message}</h2>
</body>
</html>
