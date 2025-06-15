package itmo.java.basics.lab2;

public enum Size {
    SMALL(200),
    MEDIUM(300),
    LARGE(400),
    EXTRA_LARGE(600);

    private final int volumeMl;

    Size(int volumeMl) {
        this.volumeMl = volumeMl;
    }

    private int getVolumeMl() {
        return volumeMl;
    }
}
