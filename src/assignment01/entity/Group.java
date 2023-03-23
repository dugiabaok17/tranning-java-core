package assignment01.entity;

import java.util.Date;

public class Group {
	private Long groupId;
	private String groupName;
	private Account account;
	private Date createDate;
	public Group() {
		// TODO Auto-generated constructor stub
	}
	public Group(Long groupId, String groupName, Account account, Date createDate) {
		super();
		this.groupId = groupId;
		this.groupName = groupName;
		this.account = account;
		this.createDate = createDate;
	}
	public Long getGroupId() {
		return groupId;
	}
	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	@Override
	public String toString() {
		return "Group [groupId=" + groupId + ", groupName=" + groupName + ", account=" + account + ", createDate="
				+ createDate + "]";
	}
	
    
	
}
