// Built from tag arkiv

package no.fint.model.resource.administrasjon.arkiv;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.Collection;
import java.util.List;

import lombok.NoArgsConstructor;
import no.fint.model.resource.AbstractCollectionResources;

@NoArgsConstructor
public class MerknadResources extends AbstractCollectionResources<MerknadResource> {

    public MerknadResources(Collection<MerknadResource> input) {
        super(input);
    }

    @JsonIgnore
    @Deprecated
    @Override
    public TypeReference<List<MerknadResource>> getTypeReference() {
        return new TypeReference<List<MerknadResource>>() {};
    }
}
