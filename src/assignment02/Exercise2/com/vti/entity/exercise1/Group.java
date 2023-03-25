package assignment02.Exercise2.com.vti.entity.exercise1;

import java.util.Date;
import java.util.Set;

public class Group {
	private Long groupId;
	private String groupName;
	private Set<Account> setAccount;
	private Date createDate;
	private Account account;

	public Group() {
		// TODO Auto-generated constructor stub
	}

	public Group(Long groupId, String groupName, Account account, Date createDate) {

		this.groupId = groupId;
		this.groupName = groupName;
		this.account = account;
		this.createDate = createDate;
	}

	

	public Group(Long groupId, String groupName,Set<Account> account, Date createDate) {

		this.groupId = groupId;
		this.groupName = groupName;
		this.setAccount = account;
		this.createDate = createDate;
	}

	public Set<Account> getSetAccount() {
		return setAccount;
	}

	public void setSetAccount(Set<Account> setAccount) {
		this.setAccount = setAccount;
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
		return "Group [groupId=" + groupId + ", groupName=" + groupName + ", setAccount=" + setAccount + ", createDate="
				+ createDate + ", account=" + account + "]";
	}

	

}
