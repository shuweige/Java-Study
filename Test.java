public class Test {
	public static void main(String[] args) {
		// 创建两个 Student 对象
		Student student1 = new Student(101, "Lisi", 70, 70, 70);
		Student student2 = new Student(102, "Zhaoliu", 70, 70, 70);

		// 创建一个 StudentXW 对象
		StudentXW studentXW = new StudentXW(103, "Zhangsan", 90, 90, 90, "Receive homework");

		// 创建一个 StudentBZ 对象
		StudentBZ studentBZ = new StudentBZ(104, "Wangwu", 100, 100, 100, "Lead everyone");

		// 计算评测成绩
		double evaluationScore1 = student1.testScore();
		double evaluationScore2 = student2.testScore();
		double evaluationScoreXW = studentXW.testScore();
		double evaluationScoreBZ = studentBZ.testScore();

		// 输出评测成绩
		System.out.println(student1.getName() + "'s evaluation score is " + evaluationScore1);
		System.out.println(student2.getName() + "'s evaluation score is " + evaluationScore2);
		System.out.println(studentXW.getName() + "'s evaluation score is " + evaluationScoreXW);
		System.out.println(studentBZ.getName() + "'s evaluation score is " + evaluationScoreBZ);

		// 进行总成绩对比
		if (studentXW.getTotalScore() > student1.getTotalScore()) {
			System.out.println(studentXW.getName() + "'s total score is higher than " + student1.getName());
		} else if (studentXW.getTotalScore() < student1.getTotalScore()) {
			System.out.println(studentXW.getName() + "'s total score is lower than " + student1.getName());
		} else {
			System.out.println(studentXW.getName() + "'s total score is equal to " + student1.getName());
		}

		if (studentXW.getTotalScore() > studentBZ.getTotalScore()) {
			System.out.println(studentXW.getName() + "'s total score is higher than " + studentBZ.getName());
		} else if (studentXW.getTotalScore() < studentBZ.getTotalScore()) {
			System.out.println(studentXW.getName() + "'s total score is lower than " + studentBZ.getName());
		} else {
			System.out.println(studentXW.getName() + "'s total score is equal to " + studentBZ.getName());
		}

		if (student1.getTotalScore() > student2.getTotalScore()) {
			System.out.println(student1.getName() + "'s total score is higher than " + student2.getName());
		} else if (student1.getTotalScore() < student2.getTotalScore()) {
			System.out.println(student1.getName() + "'s total score is lower than " + student2.getName());
		} else {
			System.out.println(student1.getName() + "'s total score is equal to " + student2.getName());
		}
	}
}