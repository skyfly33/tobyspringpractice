package skyfly33.practice4.toby;

import java.sql.SQLException;

public class TestDao {
	// Factory패턴 분리방법을 통한 connection관심사와 query수행 관심사 분리.
	public static void main(String[] args) throws SQLException,
			ClassNotFoundException {

		UsersDao dao = new DaoFactory().userDao();

		Users user = new Users();
		user.setId("iruen7");
		user.setName("이동훈");
		user.setPassword("fighting!");

		dao.add(user);

		System.out.println(user.getId() + ", 등록 성공!!");

		Users user2 = dao.get(user.getId());
		System.out.println(user2.getName());
		System.out.println(user2.getPassword());

		System.out.println(user2.getId() + ", 조회 성공!!");
	}
}
