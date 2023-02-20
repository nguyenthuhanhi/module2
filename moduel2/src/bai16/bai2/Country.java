package bai16.bai2;

public class Country {
    private int id;
    private String code;
    private String name;

    public Country() {
    }

    public Country(int id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    public Country(String[] data) {
        this.id = Integer.parseInt(data[0]);
        this.code = data[1];
        this.name = data[2];

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
