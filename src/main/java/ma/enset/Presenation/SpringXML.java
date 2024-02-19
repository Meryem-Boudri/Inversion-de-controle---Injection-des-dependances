package ma.enset.Presenation;

import ma.enset.Metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringXML {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        IMetier metier=context.getBean(IMetier.class);

        System.out.println("Resultat : "+ metier.calcul());
    }
}
