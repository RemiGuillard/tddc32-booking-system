package NetworkPackage;

import java.util.Date;

public class Answer implements java.io.Serializable {

	private static final long serialVersionUID = 1153790878466210553L;
	
	public queryType	type;
	public boolean		value;
	public int			errorValue;
	public int			bookid;
	public int			userBooking;
	public int			wkNbr;
	public int			userid;
	public Date			bookdate;
	public int			machineid;
}
