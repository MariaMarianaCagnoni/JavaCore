package ZZHpadroesdeprojeto.dto;

import ZZHpadroesdeprojeto.factory.domain.Country;
import ZZHpadroesdeprojeto.factory.domain.Currency;
import lombok.Builder;

/**
 * @author mariana
 * @Project: javacore
 */
@Builder
public class reportDto {
    private String AircraftName;
    private Country country;

    private Currency currency;
    private String name;


}
