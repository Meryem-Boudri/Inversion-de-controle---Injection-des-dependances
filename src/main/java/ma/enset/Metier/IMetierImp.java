package ma.enset.Metier;

import ma.enset.DAO.IDao;

public class IMetierImp implements IMetier {
    private IDao iDao; //Couplage faible

    public void setDao(IDao iDao) {
        this.iDao = iDao;
    }

    @Override
    public double calcul() {
        double tmp = iDao.getData();
        double res=tmp*540/Math.cos(tmp*Math.PI);
        return res;
    }
}
