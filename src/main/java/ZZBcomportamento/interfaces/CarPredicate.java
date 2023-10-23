package ZZBcomportamento.interfaces;

import ZZBcomportamento.domain.Car;

/**
 * @author mariana
 * @Project: javacore
 */
@FunctionalInterface
public interface CarPredicate {
   public abstract boolean teste(Car car);
   //lambdas são funções não métodos pq não estão atreladas a nenhuma classe
   //lambdas são anonimas e mais concisas
   // interface funcional só pode ter um método abstrato
   //(parametro) -> <expressão>

   //ja existe uma interface que faz a mesma coisa usando generics que é Predicate<T>
}
