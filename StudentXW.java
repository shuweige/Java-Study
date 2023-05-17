public class StudentXW extends Student {
	private String responsibility;

	public StudentXW(int number, String name, int englishScore, int mathScore, int computerScore, String responsibility) {
		super(number, name, englishScore, mathScore, computerScore);
		this.responsibility = responsibility;
	}

	public String getResponsibility() {
		return responsibility;
	}

	public void setResponsibility(String responsibility) {
		this.responsibility = responsibility;
	}

	@Override
	public double testScore() {
		return super.testScore() + 3;
	}
}