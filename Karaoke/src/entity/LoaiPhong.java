/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Objects;

/**
 *
 * @author Duong Ngo Manh
 */
public class LoaiPhong {
    private String maLoaiPhong;
    private String tenLoaiPhong;
    private float giaPhong;
    private int soNguoiToiDa;

    public LoaiPhong() {
    }

    public LoaiPhong(String maLoaiPhong, String tenLoaiPhong, float giaPhong, int soNguoiToiDa) {
        this.maLoaiPhong = maLoaiPhong;
        this.tenLoaiPhong = tenLoaiPhong;
        this.giaPhong = giaPhong;
        this.soNguoiToiDa = soNguoiToiDa;
    }

    public String getMaLoaiPhong() {
        return maLoaiPhong;
    }

    public String getTenLoaiPhong() {
        return tenLoaiPhong;
    }

    public float getGiaPhong() {
        return giaPhong;
    }

    public int getSoNguoiToiDa() {
        return soNguoiToiDa;
    }

    public void setMaLoaiPhong(String maLoaiPhong) {
        this.maLoaiPhong = maLoaiPhong;
    }

    public void setTenLoaiPhong(String tenLoaiPhong) {
        this.tenLoaiPhong = tenLoaiPhong;
    }

    public void setGiaPhong(float giaPhong) {
        this.giaPhong = giaPhong;
    }

    public void setSoNguoiToiDa(int soNguoiToiDa) {
        this.soNguoiToiDa = soNguoiToiDa;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.maLoaiPhong);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final LoaiPhong other = (LoaiPhong) obj;
        return Objects.equals(this.maLoaiPhong, other.maLoaiPhong);
    }

    @Override
    public String toString() {
        return "LoaiPhong{" + "maLoaiPhong=" + maLoaiPhong + ", tenLoaiPhong=" + tenLoaiPhong + ", giaPhong=" + giaPhong + ", soNguoiToiDa=" + soNguoiToiDa + '}';
    }
    
}
