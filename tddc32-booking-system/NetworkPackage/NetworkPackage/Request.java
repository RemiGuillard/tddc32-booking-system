package NetworkPackage;

import java.util.Calendar;

public class Request implements java.io.Serializable {

	private static final long serialVersionUID = 8L;

	public queryType	type;
	public String		login;
	public String		password;
	public Calendar		bookdate;
	public int			userid;
	public int			bookid;
	public int			weekYear;
	
}
