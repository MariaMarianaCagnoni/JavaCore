package ZZIjdbc.domain;

import lombok.*;

/**
 * @author mariana
 * @Project: javacore
 */

@Builder
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Producer {
    private Long id;
    private String name;
}
