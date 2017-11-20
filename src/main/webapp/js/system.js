$(function() {
	$("#putin").click(function() {
		$.ajax({
			type : 'get',
			url : ctxPath + '/radix/secondToTenSystem.kexin',
			data : {
				system : $("#system").val(),
				number : $("#number").val()
			},
			dataType : 'json',
			success : function(data) {
				$("#tenNumber").val(data);
			},
			error : function() {
				alert("操作失败");
			}
		});
	});

});