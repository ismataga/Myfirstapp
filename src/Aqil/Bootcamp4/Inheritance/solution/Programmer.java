package Aqil.Bootcamp4.Inheritance.solution;

public class Programmer extends Person {
    private String companyName;

    public void  code(){
        System.out.println("coding");
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public void learn() {
        super.learn();
    }
}
