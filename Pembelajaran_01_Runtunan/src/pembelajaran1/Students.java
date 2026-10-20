package pembelajaran1;

public class Students {
    private Integer NPM;
    private String Fullname;
    private String ClassName;
    private Integer Semester;
    private Float GPA;

    public Integer getNPM(Integer value) {
        NPM = value;
        return NPM;
    }

    public String getFullname(String value) {
        Fullname = value;
        return Fullname;
    }

    public String getClassName(String value) {
        ClassName = value;
        return ClassName;
    }

    public Integer setSemester(Integer value) {
        Semester = value;
        return Semester;
    }

    public Float getGPA(Float value) {
        GPA = value;
        return GPA;
    }
}