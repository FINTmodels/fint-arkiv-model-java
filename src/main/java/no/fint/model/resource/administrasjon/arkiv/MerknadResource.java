// Built from tag arkiv

package no.fint.model.resource.administrasjon.arkiv;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.*;

import no.fint.model.FintComplexDatatypeObject;
import no.fint.model.resource.FintLinks;
import no.fint.model.resource.Link;
import java.util.Date;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class MerknadResource implements FintComplexDatatypeObject, FintLinks {
    // Attributes
    @NotNull
    private Date merknadsdato;
    @NotBlank
    private String merknadstekst;

    // Relations
    @Getter
    private final Map<String, List<Link>> links = createLinks();
        
    @JsonIgnore
    public List<Link> getMerknadRegistrertAv() {
        return getLinks().getOrDefault("merknadRegistrertAv", Collections.emptyList()); 
    }
    public void addMerknadRegistrertAv(Link link) {
        addLink("merknadRegistrertAv", link);
    }
    @JsonIgnore
    public List<Link> getMerknadstype() {
        return getLinks().getOrDefault("merknadstype", Collections.emptyList()); 
    }
    public void addMerknadstype(Link link) {
        addLink("merknadstype", link);
    }
}
