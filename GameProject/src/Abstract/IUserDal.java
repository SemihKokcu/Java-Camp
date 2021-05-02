package Abstract;

import Entities.UserBase;

public interface IUserDal {
    void Add(UserBase user);
    void Uptade(UserBase user);
    void Delete(UserBase user);
}
