package ma.enset.Presenation;


import ma.enset.DAO.DaoImp;
import ma.enset.Metier.IMetier;
import ma.enset.Metier.IMetierImp;

public class Main {
    public static void main(String[] args) {

    //injection des dependances par instanciation staique -> new
        DaoImp dao=new DaoImp();
        IMetierImp metier= new IMetierImp();
        metier.setiDao(dao);
        System.out.println("Le Resultat est : "+metier.calcul());
    }
}