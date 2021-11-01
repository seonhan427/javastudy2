package LoginLogout;

import java.util.ArrayList;

public class Member {
	String id, password;
	ArrayList idds = new ArrayList();

	public Member(String id, String password) {
		this.id = id;
		this.password = password;
		idds.add(id);
		idds.add(password);
	}

	ArrayList getList() {
		return idds;
	}
}
