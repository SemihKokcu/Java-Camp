package Adapters;



import Abstract.IUserCheckService;
import Entities.UserBase;


public class MernisServiceAdapter  implements IUserCheckService{

	@Override
	public boolean checkIfRealPerson(UserBase user) {
		/*
		 * MernisReferance.KPSPublicSoapProxy kpsPublicSoapProxy = new
		 * KPSPublicSoapProxy(); boolean result = false; try { result =
		 * kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(user.getIdentityNumber())
		 * , user.getFirstName(), user.getLastName(), user.getDateOfBirth()); } catch
		 * (NumberFormatException e) { e.printStackTrace(); } catch (RemoteException e)
		 * { e.printStackTrace(); } return result;
		 */
		return true;
	}
	}


