package Abstract;

import Entities.UserBase;

public interface IUserService {
	
	void Add(UserBase user);
	void Uptade(UserBase user);
	void Delete(UserBase user);

}
