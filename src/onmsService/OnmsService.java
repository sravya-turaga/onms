package onmsService;

import java.util.ArrayList;



import onmsBean.Onms;
import onmsDao.OnmsDao;



public class OnmsService {
	public ArrayList<Onms> getAllUsers() 
	{
		OnmsDao dao=new OnmsDao();
		return dao.getAllUsers();
	}

	public boolean addUsers(Onms emp) {
		// TODO Auto-generated method stub
		OnmsDao dao=new OnmsDao();
		return dao.addUsers(emp);
		
	}
	
}
