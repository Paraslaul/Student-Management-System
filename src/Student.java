public class Student {
    private int sid;
    private String sname;
    private String sphone;
    private String scity;

    public Student(int sid, String sname, String sphone, String scity){
        super();
        this.sname = sname;
        this.sid = sid;
        this.sphone = sphone;
        this.scity = scity;
    }
    public Student(String sname, String sphone, String scity){
        super();
        this.sname = sname;
        this.sphone = sphone;
        this.scity = scity;
    }

    public int getSid() {
        return sid;
    }

    public String getScity() {
        return scity;
    }

    public String getSname() {
        return sname;
    }

    public String getSphone() {
        return sphone;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public void setScity(String scity) {
        this.scity = scity;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public void setSphone(String sphone) {
        this.sphone = sphone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", sphone='" + sphone + '\'' +
                ", scity='" + scity + '\'' +
                '}';
    }
    public Student(){

    }
}
