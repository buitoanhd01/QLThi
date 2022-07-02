package Model;

import java.util.Objects;

/**
 *
 * @author Iroha
 */
public class AccountModelCB {
    private String username;
    private String password;
    private String ten;
    private byte[] anh;

    public AccountModelCB() {
    }

    public AccountModelCB(int accountID, String username, String password, String ten) {
        this.username = username;
        this.password = password;
        this.ten = ten;
    }
    public AccountModelCB(String tk)
            {
                this.username = tk;
            }
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + Objects.hashCode(this.username);
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
        final AccountModelCB other = (AccountModelCB) obj;
        return Objects.equals(this.username, other.username);
    }
    


    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }



    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
}
