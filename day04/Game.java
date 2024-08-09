package day04;
import java.util.ArrayList;

public class Game {

	public static void main(String[] args) {
		
		Wizard wizard = new Wizard();
		wizard.name = "간달프";
		wizard.hp = 100;
		wizard.mp = 0;
		
		Knight knight = new Knight();
		knight.name = "아서";
		knight.hp = 150;
		knight.stamina = 70;
		
		wizard.fireball();
		knight.slash();
		
		wizard.punch();
		knight.punch();
		
		ArrayList<Novice> gameList = new ArrayList<Novice>();
		gameList.add(wizard);
		gameList.add(knight);
		
		for(Novice n : gameList) {
			if(n instanceof Wizard)
				((Wizard) n).fireball();
			else if(n instanceof Knight)
				((Knight) n).slash();
		}
		
		
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
		System.out.printf("%s(mp: %d)의 파이어볼!\n", name, mp);
	}
}

class Knight extends Novice {
	
	int stamina;
	
	void slash() {
		System.out.printf("%s(stamina: %d)의 베기공격!\n", name, stamina);
	}
}