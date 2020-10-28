package com.api.domain;

public enum Languages {
    ROMANA("Romana"), RUSA("Rusa"), ENGLEZA("Engleza"),
    URCAINEANA("Ucraineana"), GAGAUZA("Gagauza"),
    IATLIANA("Italiana"), GERMANA("Franceza"), FRANCEZA("Engleza"), SPANIOLA("Spaniola");

    private final String language;

    Languages(String value) {
        language = value;
    }

    public String getFieldDescription() {
        return language;
    }
}
