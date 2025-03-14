package Bai7;

public class GraduateStudent extends Student {
    private String researchTopic;
    private String supervisorName;

    public GraduateStudent(String name, String id, double gpa, String researchTopic, String supervisorName) {
        super(name, id, gpa);
        this.researchTopic = researchTopic;
        this.supervisorName = supervisorName;
    }

    public String getResearchTopic() {
        return researchTopic;
    }

    public void setResearchTopic(String researchTopic) {
        if (researchTopic == null || researchTopic.isEmpty()) {
            System.err.println("Đề tài nghiên cứu ko đc để trống");
        } else {
            this.researchTopic = researchTopic;
        }
    }

    public String getSupervisorName() {
        return supervisorName;
    }

    public void setSupervisorName(String supervisorName) {
        this.supervisorName = supervisorName;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Đề tài: " + researchTopic + ", Giảng viên hướng dẫn: " + supervisorName;
    }
}
