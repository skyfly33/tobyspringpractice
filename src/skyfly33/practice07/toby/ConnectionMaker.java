package skyfly33.practice07.toby;

import java.sql.Connection;
import java.sql.SQLException;

public interface ConnectionMaker {

	public Connection makeNewConnection() throws SQLException,
			ClassNotFoundException;
}
