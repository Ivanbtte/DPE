
package db;

public class Conexion {
    
    final Conecction connection;
    final String url;
    final String user;
    final String pwd;

    private static class Conecction {

        public Conecction() {
        }
    }

    public Conexion(Conecction connection, String url, String user, String pwd) {
        this.connection = connection;
        this.url = url;
        this.user = user;
        this.pwd = pwd;
    }

    public Conecction getConnection() {
        return connection;
    }

    public void setConnection(Conecction connection) {
        this.connection = connection;
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

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public static void main(String[] args) {
         
    }
    
    
    
    
}
