public class Schools {
    private String principal;
    private String accountNo;
    private String phoneNo;

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public static void main(String[] args) {
        Schools s = new Schools();
        s.setPrincipal("Dr. Smith");
        s.setAccountNo("12345");
        s.setPhoneNo("555-1212");

        System.out.println("Principal: " + s.getPrincipal());
        System.out.println("Account: " + s.getAccountNo());
        System.out.println("Phone: " + s.getPhoneNo());
    }
}


