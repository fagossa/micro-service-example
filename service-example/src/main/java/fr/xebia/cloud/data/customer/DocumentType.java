package fr.xebia.cloud.data.customer;

/**
 * Created by fagossa on 15/12/2014.
 */
public enum DocumentType {
    DNI, PASSPORT, TITRE_SEJOUR, RESIDENT;

    public static DocumentType getRandomValue() {
        DocumentType value = null;
        final DocumentType[] list = values();
        final double groups = list.length;
        final double randomValue = Math.random();
        for (int i=0 ; i < groups ; i++) {
            double max = (double)(i + 1) * ((double)1 / groups);
            if (randomValue <= max) {
                value = list[i];
                break;
            }
        }
        return value;
    }
}
