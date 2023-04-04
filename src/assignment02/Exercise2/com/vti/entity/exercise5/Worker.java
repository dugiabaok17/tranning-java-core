package assignment02.Exercise2.com.vti.entity.exercise5;

public class Worker extends Cadres {
	private int rank;

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public Worker(String name, int age, String gender, String address, int rank) {
		super(name, age, gender, address);
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Worker [rank=" + rank +", "+ super.toString() + "]";
	}
	
	

}
