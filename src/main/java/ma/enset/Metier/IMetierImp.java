package ma.enset.Metier;

import ma.enset.DAO.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class IMetierImp implements IMetier {
    @Autowired //sinon par constructeur
    @Qualifier("dao") //injecter la version dont le nom dao "sans utilisation du constructeur"
    private IDao iDao; //Couplage faible

    public void setDao(IDao iDao) {
        this.iDao = iDao;
    }


    @Override
    public double calcul() {
        double tmp = iDao.getData();
        return tmp * 540 / Math.cos(tmp * Math.PI);
    }
}
