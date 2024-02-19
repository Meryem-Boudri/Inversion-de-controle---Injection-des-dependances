package ma.enset.ext;

import ma.enset.DAO.IDao;

public class DaoImp2 implements IDao {

    @Override
    public double getData() {
        System.out.println("Version web service");
        return 90;
    }
}
