// Built from tag arkiv

package no.fint.model.administrasjon.arkiv;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;
import no.fint.model.FintComplexDatatypeObject;
import no.fint.model.felles.kompleksedatatyper.Adresse;
import no.fint.model.felles.kompleksedatatyper.Kontaktinformasjon;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Part implements FintComplexDatatypeObject {
    public enum Relasjonsnavn {
            PARTROLLE
    }

    private @Valid Adresse adresse;
    private @Valid Kontaktinformasjon kontaktinformasjon;
    private String kontaktperson;
    @NotBlank
    private String partNavn;
}
