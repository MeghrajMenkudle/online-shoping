$(function(){
	switch(menu){

	case 'Contact Us':
		$('#contactUsId').addClass('active');
		break;
		
	case 'About Us':
		$('#aboutUsId').addClass('active');
		break;
		
	case 'Product List':
		$('#productListId').addClass('active');
		break;
		
	default:
		$('#homeId').addClass('active');
		$('#a_'+menu).addClass('active');
		break;
	}
});