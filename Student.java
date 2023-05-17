public class Student {
	private int number;
	private String name;
	private int englishScore;
	private int mathScore;
	private int computerScore;
	private int totalScore;

	public Student(int number, String name, int englishScore, int mathScore, int computerScore) {
			this.number = number;
			this.name = name;
			this.englishScore = englishScore;
			this.mathScore = mathScore;
			this.computerScore = computerScore;
			this.totalScore = sum();
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEnglishScore() {
		return englishScore;
	}

	public void setEnglishScore(int englishScore) {
		this.englishScore = englishScore;
		this.totalScore = sum();
	}

	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
		this.totalScore = sum();
	}

	public int getComputerScore() {
		return computerScore;
	}

	public void setComputerScore(int computerScore) {
		this.computerScore = computerScore;
		this.totalScore = sum();
	}

	public int getTotalScore() {
		return totalScore;
	}

	public int compare(Student otherStudent) {
		if (this.totalScore > otherStudent.totalScore) {
			return 1;
		} else if (this.totalScore < otherStudent.totalScore) {
			return -1;
		} else {
			return 0;
		}
	}

	public int sum() {
		return (englishScore + mathScore + computerScore);
	}

	public double testScore() {
		return sum() / 3.0;
	}
}