package com.wpe.unittest.listased;

public class DokumentSed {
    private long sprawa;
    private long id;
    private String nazwa;

    public DokumentSed() {
    }

    public DokumentSed(long sprawa, long id, String nazwa) {
        this.sprawa = sprawa;
        this.id = id;
        this.nazwa = nazwa;
    }

    public DokumentSed(long sprawa) {
        this.sprawa = sprawa;
        this.nazwa=String.valueOf(sprawa);
    }

    @Override
    public String toString() {
        return "DokumentSed{" +
                "sprawa=" + sprawa +
                ", id=" + id +
                ", nazwa='" + nazwa + '\'' +
                '}';
    }
}
