/**
 * 
 */
$('#a_'+menu).addClass('active');
switch (menu) {
	case 'home':
		$('#home').addClass('active');
		break;
	case 'about':
		$('#about').addClass('active');
		break;
	case 'contact':
		$('#contact').addClass('active');
		break;
		default:
			$('#listeproducts').addClass('active');
			
			break;

	}