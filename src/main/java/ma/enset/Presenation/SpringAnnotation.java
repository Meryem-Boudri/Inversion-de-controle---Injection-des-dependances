package ma.enset.Presenation;

import ma.enset.Metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext context= new AnnotationConfigApplicationContext("ma.enset.DAO","ma.enset.Metier","ma.enset.ext");//les packages qui va scanner
        IMetier metier=context.getBean(IMetier.class);

        System.out.println(metier.calcul());
    }
}
