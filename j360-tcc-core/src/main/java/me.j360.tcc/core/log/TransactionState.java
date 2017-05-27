package me.j360.tcc.core.log;

public enum TransactionState {

    TRYING(1), CONFIRMING(2), CANCELLING(3);

    private int id;

    TransactionState(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static TransactionState valueOf(int id) {

        switch (id) {
            case 1:
                return TRYING;
            case 2:
                return CONFIRMING;
            default:
                return CANCELLING;
        }
    }

}
