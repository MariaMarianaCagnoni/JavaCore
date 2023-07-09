package Aintroducaoclasses;

import Aintroducaoclasses.domain.Estudante;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author mariana
 * @Project: javacore
 */
class EstudanteTest {

    private Estudante adult;
    private Estudante notAdult;
    private Estudante estudante;

    @BeforeEach
    void setUp() {
        adult = new Estudante();
        adult.setIdade(18);
        notAdult = new Estudante();
        notAdult.setIdade(14);
        estudante = new Estudante();


    }


    @Test
    @DisplayName("A student should be not adult when age is lower than 18")
    void isMaiorIdade_ReturnFalse_WhenIdadeIsLessThan18() {
        assertFalse(estudante.isMaiorIdade(notAdult));
    }

    @Test
    @DisplayName("should throw a exception(IllegalArgumentException)when age is null")
    void isMaiorIdade_ThrowNullPointerException_WhenPersonIsNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> estudante.isMaiorIdade(null),
                "estudante tem que ser nulo nesse teste");
    }

    @Test
    @DisplayName("A student should have a name")
    void hasName_ReturnTrue_WhenNameExists() {
        estudante.setNome("mariana");
        Assertions.assertEquals("mariana", estudante.getNome());
    }

    @Test
    @DisplayName("A student should be adult when age is greater or equals than 18")
    void isMaiorIdade_ReturnTrue_WhenIdadeIsGreaterOrEqualsThan18() {

        assertTrue(estudante.isMaiorIdade(adult));
    }

    @Test
    @DisplayName("A student should have a cpf")
    void hasCpf_ReturnTrue_whenCpfExists() {
        estudante.setCpf("123");
        assertEquals("123", estudante.getCpf());
    }

    @Test
    @DisplayName("A student should have a sexo")
    void hasCpf_returnTrue_whenSexoExists() {

        estudante.setSexo('M');
        assertEquals('M', estudante.getSexo());
    }
}