package day04;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Novice {
	
	String name;
	int hp;
	
	void punch() {
		System.out.printf("%s(hp: %d)의 펀치!\n", name, hp);
	}
}

class Wizard extends Novice {
	
	int mp;
	
	void fireball() {
		System.out.printf("%s(hp: %d)의 파이어볼!\n", name, mp);
	}
}

class Knight extends Novice {
	
	int stamina;
	
	void fireball() {
		System.out.printf("%s(hp: %d)의 베기공격!\n", name, stamina);
	}
}