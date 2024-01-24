package DTO;

public class Foods {
    private String name;
    private String gia;

    public Foods() {
    }

    public Foods(String name, String gia) {
        this.name = name;
        this.gia = gia;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }
}
