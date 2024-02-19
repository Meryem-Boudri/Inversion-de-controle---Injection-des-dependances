package ma.enset.DAO;

import org.springframework.stereotype.Component;

@Component("dao") //instancie avec le nom dao
public class DaoImp implements IDao{
    @Override
    public double getData() {
        return Math.random()*40;
    }
}
