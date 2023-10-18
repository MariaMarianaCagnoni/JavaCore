package ZZBcomportamento.interfaces;

import ZZBcomportamento.domain.Car;

/**
 * @author mariana
 * @Project: javacore
 */
public interface CarPredicate {
   public abstract boolean teste(Car car);

   //ja existe uma interface que faz a mesma coisa usando generics que é Predicate<T>
}
