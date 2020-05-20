console.log("hiii");

function onSubmit() {

	                var product = {
	                 	"name": document.getElementById("name").value,
	                	"color": document.getElementById("color").value,	                	
	                	"price": document.getElementById("price").value,
	                	"category": document.getElementById("category").value	                	
	                }
	                
		    		console.log(JSON.stringify(product));
	    
	$.ajax({
	    url: '/add',
	    type: "POST",
	    dataType: "json",
	    data : (product),
	    success: function (data) {
	        console.log(data);
	    },
	    error: function (error) {
	        console.log(`Error ${error}`);
	        console.log(error);
	    }
	});

}