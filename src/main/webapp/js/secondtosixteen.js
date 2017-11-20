$(function() {
	$("#putin").click(function() {
		$.ajax({
			type : 'get',
			url : ctxPath + '/secondtosixteen/getSixteenSystem.kexin',
			data : {
				secondNumber : $("#secondNumber").val()
			},
			dataType : 'json',
			success : function(data) {
				$("#sixteenNumber").val(data);
			},
			error : function(data) {
				alert("操作失败");
			}
		});
	});
});