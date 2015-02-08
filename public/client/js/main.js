// main.js
$(function(){
	
	var Member = Backbone.Model.extend({
		urlRoot : 'http://localhost:8080/members',
		defaults: { "name" : "", "alias" : ""}
	});

	var MemberView = Backbone.View.extend({
	    el: $('#members'),
		template: _.template($('#memberTemplate').html()),
	    render: function(){
	        var newHtml = this.template(this.model.toJSON());
	        this.$el.append(newHtml);
	        return this;
	    }
	});

	var memberOne = new Member({id:1});
	
	memberOne.fetch({
		success : function(member){
			//alert(JSON.stringify(member));
			var app = new MemberView({ model: member });
			app.render();
		}
	});
	

});