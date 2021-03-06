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

import no.fint.model.FintAbstractObject;
import no.fint.model.resource.FintLinks;
import no.fint.model.resource.Link;
import no.fint.model.resource.administrasjon.arkiv.RegistreringResource;
import no.fint.model.resource.administrasjon.arkiv.JournalpostResource;
import java.util.Date;
import no.fint.model.resource.administrasjon.arkiv.MappeResource;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public abstract class SaksmappeResource extends MappeResource implements FintAbstractObject, FintLinks {
    // Attributes
    @JsonIgnore
    @Override
    public List<FintLinks> getNestedResources() {
        List<FintLinks> result = super.getNestedResources();
        if (arkivnotat != null) {
            result.addAll(arkivnotat);
        }
        if (journalpost != null) {
            result.addAll(journalpost);
        }
        return result;
    }
    private List<@Valid RegistreringResource> arkivnotat;
    private List<@Valid JournalpostResource> journalpost;
    private String saksaar;
    private Date saksdato;
    private String sakssekvensnummer;
    private Date utlaantDato;

    // Relations
    @Getter
    private final Map<String, List<Link>> links = createLinks();
        
    @JsonIgnore
    public List<Link> getJournalenhet() {
        return getLinks().getOrDefault("journalenhet", Collections.emptyList()); 
    }
    public void addJournalenhet(Link link) {
        addLink("journalenhet", link);
    }
    @JsonIgnore
    public List<Link> getAdministrativEnhet() {
        return getLinks().getOrDefault("administrativEnhet", Collections.emptyList()); 
    }
    public void addAdministrativEnhet(Link link) {
        addLink("administrativEnhet", link);
    }
    @JsonIgnore
    public List<Link> getSaksansvarlig() {
        return getLinks().getOrDefault("saksansvarlig", Collections.emptyList()); 
    }
    public void addSaksansvarlig(Link link) {
        addLink("saksansvarlig", link);
    }
    @JsonIgnore
    public List<Link> getSaksstatus() {
        return getLinks().getOrDefault("saksstatus", Collections.emptyList()); 
    }
    public void addSaksstatus(Link link) {
        addLink("saksstatus", link);
    }
}
