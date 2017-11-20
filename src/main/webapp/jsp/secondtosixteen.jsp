<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="factory.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>2进制转换成十六进制</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1,maximum-scale=1, user-scalable=no">
<link rel="stylesheet" type="text/css" href="${ctxPath}/css/system.css" />
</head>
<body>
	<div class="mBMI_body">
		<p class="mBMI_mainTitle">2进制转换成十六进制</p>
		<p class="mBMI_desc">2进制转换成十六进制</p>
		<form>
			<ul class="mBMI_form_item">
				<li class="mBMI_form_item_label">2进制</li>
				<li class="mBMI_form_item_input"><input type="text" id="secondNumber"
					value="" /></li>
			</ul>			 
			<ul class="mBMI_form_item">
				<li class="mBMI_form_item_label">十六进制</li>
				<li class="mBMI_form_item_input"><input type="text"
					id="sixteenNumber" value="" /></li>
			</ul>
			<div class="mBMI_form_btn">
				<input type="button" id="putin" value="转换成十六进制">
			</div>
		</form>
	</div>
</body>
<script src="${ctxPath}/js/secondtosixteen.js"></script>
</html>