package ma.enset.DAO;

public class DaoImp implements IDao{
    @Override
    public double getData() {
        double temp=Math.random()*40;
        return temp;
    }
}
