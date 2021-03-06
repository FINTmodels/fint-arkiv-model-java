// Built from tag arkiv

package no.fint.model.utdanning.elev;

import java.util.Arrays;
import java.util.List;

public enum ElevActions {
	
	GET_BASISGRUPPE,
	GET_ALL_BASISGRUPPE,
	UPDATE_BASISGRUPPE,
	GET_ELEV,
	GET_ALL_ELEV,
	UPDATE_ELEV,
	GET_ELEVFORHOLD,
	GET_ALL_ELEVFORHOLD,
	UPDATE_ELEVFORHOLD,
	GET_ELEVMAPPE,
	GET_ALL_ELEVMAPPE,
	UPDATE_ELEVMAPPE,
	GET_KONTAKTLARERGRUPPE,
	GET_ALL_KONTAKTLARERGRUPPE,
	UPDATE_KONTAKTLARERGRUPPE,
	GET_MEDLEMSKAP,
	GET_ALL_MEDLEMSKAP,
	UPDATE_MEDLEMSKAP,
	GET_SKOLERESSURS,
	GET_ALL_SKOLERESSURS,
	UPDATE_SKOLERESSURS,
	GET_UNDERVISNINGSFORHOLD,
	GET_ALL_UNDERVISNINGSFORHOLD,
	UPDATE_UNDERVISNINGSFORHOLD
	;


    /**
     * Gets a list of all enums as string
     *
     * @return A string list of all enums
     */
    public static List<String> getActions() {
        return Arrays.asList(
                Arrays.stream(ElevActions.class.getEnumConstants()).map(Enum::name).toArray(String[]::new)
        );
    }

}

