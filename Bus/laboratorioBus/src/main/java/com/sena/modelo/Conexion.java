
package com.sena.modelo;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    
    public transient Connection con;

    public boolean hayConexion() {
        return this.con != null;
    }
    private String driver;
    private String url;
    private String user = "";
    private String password = "";

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void conectar() throws SQLException, IOException {
        
        setDriver("com.mysql.cj.jdbc.Driver");
        setUrl("jdbc:mysql://localhost/sena");
        setUser("app_user");
        setPassword("app_user");
          
        if (!hayConexion()) {
            if (driver == null) {
                throw new SQLException("No se ha definido el driver de conexion");
            }
            if (url == null) {
                throw new SQLException("No se ha especificado la url para la conexion");
            }
            try {
                Class.forName(driver).newInstance();
            } catch (Exception e) {
                throw new IOException("Error! No se ha logrado cargar el driver especificado");
            }
            con = DriverManager.getConnection(url, user, password);
        }
        
        con = DriverManager.getConnection(url, user, password);
    }
    
}
