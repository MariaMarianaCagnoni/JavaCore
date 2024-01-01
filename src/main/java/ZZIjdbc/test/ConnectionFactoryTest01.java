package ZZIjdbc.test;

import ZZIjdbc.domain.Producer;
import ZZIjdbc.repository.ProducerRepository;

/**
 * @author mariana
 * @Project: javacore
 */
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer producer = Producer.builder().name("nhk").id(null).build();
        ProducerRepository.save(producer);
    }
}
