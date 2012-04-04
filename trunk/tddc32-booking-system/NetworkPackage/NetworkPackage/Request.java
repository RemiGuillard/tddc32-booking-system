package NetworkPackage;

import java.sql.Date;

public class Request implements java.io.Serializable {

	private static final long serialVersionUID = 8L;

	public queryType	type;
	public String		login;
	public String		password;
	public Date			bookdate;
	public int			userid;
	public int			bookid;
	
}
