// Built from tag arkiv

package no.fint.model.administrasjon.arkiv;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;
import no.fint.model.FintMainObject;
import no.fint.model.felles.kompleksedatatyper.Identifikator;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Autorisasjon implements FintMainObject {
    public enum Relasjonsnavn {
            ADMINISTRATIVENHET,
            TILGANGSRESTRIKSJON,
            ARKIVRESSURS
    }

    @NotNull
    private @Valid Identifikator systemId;
}
