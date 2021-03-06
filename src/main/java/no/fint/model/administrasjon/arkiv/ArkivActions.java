// Built from tag arkiv

package no.fint.model.administrasjon.arkiv;

import java.util.Arrays;
import java.util.List;

public enum ArkivActions {
	
	GET_ADMINISTRATIVENHET,
	GET_ALL_ADMINISTRATIVENHET,
	UPDATE_ADMINISTRATIVENHET,
	GET_ARKIVDEL,
	GET_ALL_ARKIVDEL,
	UPDATE_ARKIVDEL,
	GET_ARKIVRESSURS,
	GET_ALL_ARKIVRESSURS,
	UPDATE_ARKIVRESSURS,
	GET_AUTORISASJON,
	GET_ALL_AUTORISASJON,
	UPDATE_AUTORISASJON,
	GET_DOKUMENTFIL,
	GET_ALL_DOKUMENTFIL,
	UPDATE_DOKUMENTFIL,
	GET_DOKUMENTSTATUS,
	GET_ALL_DOKUMENTSTATUS,
	UPDATE_DOKUMENTSTATUS,
	GET_DOKUMENTTYPE,
	GET_ALL_DOKUMENTTYPE,
	UPDATE_DOKUMENTTYPE,
	GET_JOURNALPOSTTYPE,
	GET_ALL_JOURNALPOSTTYPE,
	UPDATE_JOURNALPOSTTYPE,
	GET_JOURNALSTATUS,
	GET_ALL_JOURNALSTATUS,
	UPDATE_JOURNALSTATUS,
	GET_KLASSIFIKASJONSSYSTEM,
	GET_ALL_KLASSIFIKASJONSSYSTEM,
	UPDATE_KLASSIFIKASJONSSYSTEM,
	GET_KORRESPONDANSEPARTTYPE,
	GET_ALL_KORRESPONDANSEPARTTYPE,
	UPDATE_KORRESPONDANSEPARTTYPE,
	GET_MERKNADSTYPE,
	GET_ALL_MERKNADSTYPE,
	UPDATE_MERKNADSTYPE,
	GET_PARTROLLE,
	GET_ALL_PARTROLLE,
	UPDATE_PARTROLLE,
	GET_ROLLE,
	GET_ALL_ROLLE,
	UPDATE_ROLLE,
	GET_SAK,
	GET_ALL_SAK,
	UPDATE_SAK,
	GET_SAKSSTATUS,
	GET_ALL_SAKSSTATUS,
	UPDATE_SAKSSTATUS,
	GET_SKJERMINGSHJEMMEL,
	GET_ALL_SKJERMINGSHJEMMEL,
	UPDATE_SKJERMINGSHJEMMEL,
	GET_TILGANG,
	GET_ALL_TILGANG,
	UPDATE_TILGANG,
	GET_TILGANGSRESTRIKSJON,
	GET_ALL_TILGANGSRESTRIKSJON,
	UPDATE_TILGANGSRESTRIKSJON,
	GET_TILKNYTTETREGISTRERINGSOM,
	GET_ALL_TILKNYTTETREGISTRERINGSOM,
	UPDATE_TILKNYTTETREGISTRERINGSOM,
	GET_VARIANTFORMAT,
	GET_ALL_VARIANTFORMAT,
	UPDATE_VARIANTFORMAT
	;


    /**
     * Gets a list of all enums as string
     *
     * @return A string list of all enums
     */
    public static List<String> getActions() {
        return Arrays.asList(
                Arrays.stream(ArkivActions.class.getEnumConstants()).map(Enum::name).toArray(String[]::new)
        );
    }

}

