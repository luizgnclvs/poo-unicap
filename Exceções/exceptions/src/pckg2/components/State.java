package pckg2.components;

import pckg2.exceptions.NonexistentElementException;

public enum State {
    AC("Acre"), AL("Alagoas"), AP("Amapá"), AM("Amazonas"),
    BA("Bahia"), CE("Ceará"), ES("Espírito Santo"), GO("Goiás"),
    MA("Maranhão"), MT("Mato Grosso"), MS("Mato Grosso do Sul"), MG("Minas Gerais"),
    PA("Pará"), PB("Paraíba"), PR("Paraná"), PE("Pernambuco"),
    PI("Piauí"), RJ("Rio de Janeiro"), RN("Rio Grande do Norte"), RS("Rio Grande do Sul"),
    RO("Rondônia"), RR("Roraima"), SC("Santa Catarina"), SP("São Paulo"),
    SE("Sergipe"), TO("Tocantins"), DF("Distrito Federal");

    private final String fullName;

    private State (String fullName) {
        this.fullName = fullName;
    }

    public String getFullName () {
        return this.fullName;
    }

    public static State valueOfFullName (String fullName) throws NonexistentElementException {
        for (State state : values()) {
            if (state.fullName.equals(fullName)) {
                return state;
            }
        }

        throw new NonexistentElementException("Não existe nenhuma opção com o nome inserido.");
    }
}
