package assignment02.Exercise2.com.vti.entity.exercise1;

import java.util.Date;

public class GroupAcount {
	private Group group;
	private Account account;
	private Date joinDate;
	
	public GroupAcount() {
		// TODO Auto-generated constructor stub
	}

	public GroupAcount(Group group, Account account, Date joinDate) {
		super();
		this.group = group;
		this.account = account;
		this.joinDate = joinDate;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	
	
}
