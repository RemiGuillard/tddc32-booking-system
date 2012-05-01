package NetworkPackage;

import java.util.Calendar;

public class Answer implements java.io.Serializable {

	private static final long serialVersionUID = 1153790878466210553L;
	
	public queryType	type;
	public boolean		value;
	public int			errorValue;
	public int			bookid;
	public int			userBooking;
	public int			weekYear;
	public int			userid;
	public Calendar		bookdate;
	public int			machineid;
}
