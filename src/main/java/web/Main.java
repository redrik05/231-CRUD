package web;

import web.dao.Dao;
import web.dao.UserDao;

public class Main {
    public static void main(String[] args) {
        Dao dao = new UserDao();

        System.out.println(dao.getAllUsers());
    }
}
