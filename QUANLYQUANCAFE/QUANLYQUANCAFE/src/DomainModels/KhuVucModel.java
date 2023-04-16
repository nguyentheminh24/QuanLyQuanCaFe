package DomainModels;

public class KhuVucModel {

    private String id;
    private String maKV;
    private String tenKV;
    private String trangThai;

    public KhuVucModel() {
    }

    public KhuVucModel(String id, String maKV, String tenKV, String trangThai) {
        this.id = id;
        this.maKV = maKV;
        this.tenKV = tenKV;
        this.trangThai = trangThai;
    }

    public KhuVucModel(String tenKV) {
        this.tenKV = tenKV;
    }

    public KhuVucModel(String maKV, String tenKV, String trangThai) {
        this.maKV = maKV;
        this.tenKV = tenKV;
        this.trangThai = trangThai;
    }

    public KhuVucModel(String tenKV, String trangThai) {
        this.tenKV = tenKV;
        this.trangThai = trangThai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaKV() {
        return maKV;
    }

    public void setMaKV(String maKV) {
        this.maKV = maKV;
    }

    public String getTenKV() {
        return tenKV;
    }

    public void setTenKV(String tenKV) {
        this.tenKV = tenKV;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "KhuVuc{" + "id=" + id + ", maKV=" + maKV + ", tenKV=" + tenKV + ", trangThai=" + trangThai + '}';
    }

}
