package ma.enset.ext;

import ma.enset.DAO.IDao;
import org.springframework.stereotype.Component;

@Component("dao2")
public class DaoImp2 implements IDao {

    @Override
    public double getData() {
        System.out.println("Version web service");
        return 90;
    }
}
