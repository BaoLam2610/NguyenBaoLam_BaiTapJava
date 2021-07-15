/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

import baitap3.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Bao Lam
 */
public class DatabaseController {

    private DatabaseHelper helper;

    public DatabaseController() {
        helper = new DatabaseHelper();
    }

    public ResultSet hienThiTacGia() {
        try {
            String sql = "Select * From TacGia";
            Statement sta = helper.getConnection().createStatement();
            ResultSet rs = sta.executeQuery(sql);
            return rs;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public ResultSet hienThiSach() {
        try {
            String sql = "Select * From Sach";
            Statement sta = helper.getConnection().createStatement();
            ResultSet rs = sta.executeQuery(sql);
            return rs;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public ResultSet hienThiChiTietSach() {
        try {
            String sql = "Select * From ChiTietSach";
            Statement sta = helper.getConnection().createStatement();
            ResultSet rs = sta.executeQuery(sql);
            return rs;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public ResultSet hienThiSachTG() {
        try {
            String sql = "Select * From SachTG";
            Statement sta = helper.getConnection().createStatement();
            ResultSet rs = sta.executeQuery(sql);
            return rs;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public ResultSet hienThiDocGia() {
        try {
            String sql = "Select * From DocGia";
            Statement sta = helper.getConnection().createStatement();
            ResultSet rs = sta.executeQuery(sql);
            return rs;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public ResultSet hienThiSachMuon() {
        try {
            String sql = "Select * From SachMuon";
            Statement sta = helper.getConnection().createStatement();
            ResultSet rs = sta.executeQuery(sql);
            return rs;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
