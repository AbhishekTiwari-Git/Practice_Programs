package org.example;

public class MyPojo {

    String name, companyName;
    String[] modules;
    int emplID;

    MyPojo(String name, String companyName,String[] modules, int emplID){
        this.name = name;
        this.companyName = companyName;
        this.modules = modules;
        this.emplID = emplID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String[] getModules() {
        return modules;
    }

    public void setModules(String[] modules) {
        this.modules = modules;
    }

    public int getEmplID() {
        return emplID;
    }

    public void setEmplID(int emplID) {
        this.emplID = emplID;
    }
}
