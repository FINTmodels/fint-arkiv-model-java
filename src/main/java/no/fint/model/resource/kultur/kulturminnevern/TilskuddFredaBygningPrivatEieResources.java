// Built from tag arkiv

package no.fint.model.resource.kultur.kulturminnevern;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.Collection;
import java.util.List;

import lombok.NoArgsConstructor;
import no.fint.model.resource.AbstractCollectionResources;

@NoArgsConstructor
public class TilskuddFredaBygningPrivatEieResources extends AbstractCollectionResources<TilskuddFredaBygningPrivatEieResource> {

    public TilskuddFredaBygningPrivatEieResources(Collection<TilskuddFredaBygningPrivatEieResource> input) {
        super(input);
    }

    @JsonIgnore
    @Deprecated
    @Override
    public TypeReference<List<TilskuddFredaBygningPrivatEieResource>> getTypeReference() {
        return new TypeReference<List<TilskuddFredaBygningPrivatEieResource>>() {};
    }
}
