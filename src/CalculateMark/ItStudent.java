package CalculateMark;

public class ItStudent extends Student {

    // Constructors ...
    public ItStudent() {
        super();
    }

    public ItStudent(int id, String name, String major) {
        super(id, name, major);
    }

    public ItStudent(int id, String name, String major, double midMark, double projectMark, double finalMark) {
        super(id, name, major, midMark, projectMark, finalMark);
        super.setGrade(calculateGrade(midMark, projectMark, finalMark));
    }

    public ItStudent(int id, String name, String major, double grade) {
        super(id, name, major, grade);
    }

    // Override Methods ...
    @Override
    public void setGrade(double grade) {
        super.setGrade(grade); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getGrade() {
        return (super.getMidMark() * 0.3 + super.getProjectMark() * 0.3 + super.getFinalMark() * 0.4);
    }

    @Override
    public void setFinalMark(double finalMark) {
        super.setFinalMark(finalMark); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getFinalMark() {
        return super.getFinalMark(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setProjectMark(double projectMark) {
        super.setProjectMark(projectMark); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getProjectMark() {
        return super.getProjectMark(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setMidMark(double midMark) {
        super.setMidMark(midMark); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getMidMark() {
        return super.getMidMark(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setMajor(String major) {
        super.setMajor(major); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getMajor() {
        return super.getMajor(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setName(String name) {
        super.setName(name); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getName() {
        return super.getName(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setId(int id) {
        super.setId(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getId() {
        return super.getId(); //To change body of generated methods, choose Tools | Templates.
    }

    // Final Calculater Methods ...
    @Override
    public final double calculateGrade(double midMark, double projectMark, double finalMark) {
        return (midMark * 0.3 + projectMark * 0.3 + finalMark * 0.4);
    }

}