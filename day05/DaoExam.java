package day05;

interface DataAccessObject{
	public void select();
	public void inselt();
	public void updata();
	public void delete();
}

class OracleDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("Oracl DB에서 검색");
		
	}

	@Override
	public void inselt() {
		System.out.println("Oracl DB에 삽입");
	}

	@Override
	public void updata() {
		System.out.println("Oracl DB를 수정");
	}

	@Override
	public void delete() {
		System.out.println("Oracl DB에서 삭제");
	}
	
}

class MysqlDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("Mysql DB에서 검색");
	}

	@Override
	public void inselt() {
		System.out.println("Mysql DB에 삽입");
	}

	@Override
	public void updata() {
		System.out.println("Mysql DB를 수정");
	}

	@Override
	public void delete() {
		System.out.println("Mysql DB에서 삭제");
	}
	
}

public class DaoExam {
	
	static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.inselt();
		dao.updata();
		dao.delete();
	}

	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MysqlDao());
	}

}
