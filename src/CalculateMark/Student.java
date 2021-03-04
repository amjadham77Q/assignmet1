package CalculateMark;

public abstract class Student {

    // Data field ...    
    private int id;
    private String name;
    private String major;
    private double grade;
    private double midMark;
    private double projectMark;
    private double finalMark;

    // Constructors ...
    public Student() {
        this.id = 0;
        this.name = null;
        this.major = null;
        this.grade = 0f;
        this.midMark = 0f;
        this.projectMark = 0f;
        this.finalMark = 0f;
    }

    public Student(int id, String name, String major) {
        this.id = id;
        this.name = toUpperFirstLetter(name);
        this.major = toUpperFirstLetter(major);
        this.grade = 0f;
        this.midMark = 0f;
        this.projectMark = 0f;
        this.finalMark = 0f;
    }

    public Student(int id, String name, String major, double grade) {
        this.id = id;
        this.name = toUpperFirstLetter(name);
        this.major = toUpperFirstLetter(major);
        this.grade = grade;
        this.midMark = 0f;
        this.projectMark = 0f;
        this.finalMark = 0f;
    }

    public Student(int id, String name, String major, double midMark, double projectMark, double finalMark) {
        this.id = id;
        this.name = toUpperFirstLetter(name);
        this.major = toUpperFirstLetter(major);
        this.midMark = midMark;
        this.projectMark = projectMark;
        this.finalMark = finalMark;
        this.grade = 0f;
    }

    // Final Formating Methods ...
    public final String toUpperFirstLetter(String name){
        
        String firstLetter = name.substring(0, 1);
        String remainingLetters = name.substring(1, name.length());

        firstLetter = firstLetter.toUpperCase();

        String newName;
        newName = firstLetter + remainingLetters;
        
        return (newName);
    }
    
    // Abstract Methods ... 
    public abstract double calculateGrade(double midMark, double projectMark, double finalMark);
    
    // Setter & Getter Methods ...
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = toUpperFirstLetter(name);
    }

    /**
     * @return the major
     */
    public String getMajor() {
        return major;
    }

    /**
     * @param major the major to set
     */
    public void setMajor(String major) {
        this.major = toUpperFirstLetter(major);
    }

    /**
     * @return the grade
     */
    public double getGrade() {
        return grade;
    }

    /**
     * @param grade the grade to set
     */
    public void setGrade(double grade) {
        this.grade = grade;
    }

    /**
     * @return the midMark
     */
    public double getMidMark() {
        return midMark;
    }

    /**
     * @param midMark the midMark to set
     */
    public void setMidMark(double midMark) {
        this.midMark = midMark;
    }

    /**
     * @return the projectMark
     */
    public double getProjectMark() {
        return projectMark;
    }

    /**
     * @param projectMark the projectMark to set
     */
    public void setProjectMark(double projectMark) {
        this.projectMark = projectMark;
    }

    /**
     * @return the finalMark
     */
    public double getFinalMark() {
        return finalMark;
    }

    /**
     * @param finalMark the finalMark to set
     */
    public void setFinalMark(double finalMark) {
        this.finalMark = finalMark;
    }

}
