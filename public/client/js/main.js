// main.js
$(function(){
	

// Note: use JSON.stringify() if you need to debug

	var Member = Backbone.Model.extend({
		urlRoot : 'http://localhost:8080/members',
		defaults: { "name" : "", "alias" : ""}
	});

	var memberOne = new Member({id:1});
	
	memberOne.fetch({
		success : function(member){
			alert(JSON.stringify(member));
		}
	});


});