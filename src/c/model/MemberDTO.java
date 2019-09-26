package c.model;

public class MemberDTO {
    public String name;
    public String phone;
    public String email;

    public MemberDTO() {

    }
    public MemberDTO(String _name) {
        this.name = _name;
    }
    public MemberDTO(String _name, String _phone) {
        this.name = _name;
        this.phone = _phone;
    }
    public MemberDTO(String _name, String _phone, String _email) {
        this.name = _name;
        this.phone = _phone;
        this.email = _email;
    }

    public String toString() {
        return "name: " + this.name + ", phone: " + this.phone + ", email: " + email;
    }
}
