package Abstract;

import Entities.UserBase;

public interface IUserCheckService {

	boolean checkIfRealPerson(UserBase user);
}
