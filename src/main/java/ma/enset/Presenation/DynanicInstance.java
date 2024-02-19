package ma.enset.Presenation;

import ma.enset.DAO.IDao;
import ma.enset.Metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class DynanicInstance {
    public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Scanner scanner = new Scanner(new File("config.txt"));

        String daoClassName = scanner.nextLine();
        Class cDao = Class.forName(daoClassName);
        IDao dao =(IDao) cDao.newInstance();
        System.out.println(dao.getData());

        String metierClassName=scanner.next();
        Class cMetier =Class.forName(metierClassName);
        IMetier metier= (IMetier) cMetier.newInstance();

        //programmation dynamique
        Method method=cMetier.getMethod("setDao", IDao.class);
        method.invoke(metier,dao);// metier.setDao(dao)

        System.out.println("resultat: "+metier.calcul());
    }

}