public class Schools {
    public String principal;
    private String accountNo;
    public String bankName;
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

    public String getBankName(){
        return bankName;
    }
    public void setBankName(String bankName){
        this.bankName= bankName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public static void main(String[] args) {
        Schools s = new Schools();
        s.setPrincipal("Mr. Abel");
        s.setAccountNo("2096930863");
        s.setBankName("united bank of africa");
        s.setPhoneNo("+234-90564-24816");

        System.out.println("Principal: " + s.getPrincipal());
        System.out.println("AccountNo: " + s.getAccountNo());
        System.out.println("BankName:  " + s.getBankName());
        System.out.println("PhoneNo: " + s.getPhoneNo());
    }
}


