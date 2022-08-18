package com.nt;

public class CricketPlayers {

	public static void main(String arg[]) {
		Player players[] = new Player[6];

		players[0] = new Batsmen("Sachin", 250, 11324, 100, 125, 30);

		players[1] = new Batsmen("raju", 400, 1000, 340, 456, 12345);

		players[2] = new Batsmen("Shewag", 110, 4341, 22, 40, 12);
		players[3] = new Batsmen("Yuvraj", 105, 6533, 15, 46, 32);
		players[4] = new Batsmen("Kohli", 75, 4003, 25, 60, 23);
		players[5] = new Batsmen("Raina", 34, 2600, 12, 19, 13);

		for (Player player : players) {
			player.print();
			System.out.println();
			

		}
	}
}

 class Player {
	String name;
	int CurrentScore;
	int Currentoverprogress;
	int Targetscore;

	public Player(String name, int currentScore, int currentoverprogress, int targetscore) {
		super();
		this.name = name;
		CurrentScore = currentScore;
		Currentoverprogress = currentoverprogress;
		Targetscore = targetscore;
	}

	void print() {
		System.out.print(name + " played " + CurrentScore + " matches and scored " + Currentoverprogress + " runs."
				+ Targetscore);
	}
}

class Batsmen extends Player {
	int numberOfCenturies;
	int numberOfHalfCenturies;

	public Batsmen(String name, int currentScore, int currentoverprogress, int targetscore, int numberOfCenturies,
			int numberOfHalfCenturies) {
		super(name, currentScore, currentoverprogress, targetscore);
		this.numberOfCenturies = numberOfCenturies;
		this.numberOfHalfCenturies = numberOfHalfCenturies;
	}

	void openInnings() {
	}

	void makeCentury() {
	}

	void makeHalfCentury() {
	}

	void print() {
		super.print();
		System.out.print(" He is a strong batsmen and made " + numberOfCenturies + " centuries and "
				+ numberOfHalfCenturies + " half centuries.");
	}
}
