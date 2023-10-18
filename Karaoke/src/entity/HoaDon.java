/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Date;

/**
 *
 * @author ad
 */
public class HoaDon {
    private String maHD;
    private Date ngayLapHD;
    private Date gioTraPhong;

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public Date getNgayLapHD() {
        return ngayLapHD;
    }

    public void setNgayLapHD(Date ngayLapHD) {
        this.ngayLapHD = ngayLapHD;
    }

    public Date getGioTraPhong() {
        return gioTraPhong;
    }

    public void setGioTraPhong(Date gioTraPhong) {
        this.gioTraPhong = gioTraPhong;
    }

    public HoaDon(String maHD, Date ngayLapHD, Date gioTraPhong) {
        this.maHD = maHD;
        this.ngayLapHD = ngayLapHD;
        this.gioTraPhong = gioTraPhong;
    }

    public HoaDon() {
    }

    public HoaDon(String maHD) {
        this.maHD = maHD;
    }
    
}
