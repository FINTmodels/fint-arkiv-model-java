// Built from tag arkiv

package no.fint.model.administrasjon.personal;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;
import no.fint.model.FintMainObject;
import no.fint.model.felles.kompleksedatatyper.Personnavn;
import no.fint.model.administrasjon.arkiv.Saksmappe;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class Personalmappe extends Saksmappe implements FintMainObject {
    public enum Relasjonsnavn {
            PERSON,
            ARBEIDSSTED,
            LEDER,
            PERSONALRESSURS
    }

    @NotNull
    private @Valid Personnavn navn;
}
