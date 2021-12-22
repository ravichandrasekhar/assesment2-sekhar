/**
 * 
 */
package assesment;

/**
 * @author ravichandrav
 *
 */
public class Sales {

	public  boolean  checkProductId(int productid) {
		if(productid>=10001 && productid <=99999)
			return true;
		else 
			 return false;
	}
	public  String getAmount(String size) {
		if(size.equals ("S")) {
			return "30$";
	}
	else if (size.equals("M")) {
		return "50$";
	
	}
	else {
		return "80$";
	}
	}
}
