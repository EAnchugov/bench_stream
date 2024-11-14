package com.gmail.alexejkrawez.help;

public enum Subject {

    ALGEBRA ("алгебра"),
    GEOMETRY ("геометрия"),
    CHEMISTRY ("химия"),
    GEOGRAPHY ("география"),
    HISTORY ("история"),
    LITERATURE ("литература"),
    BIOLOGY ("биология");

    private String subject;

    Subject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Subjects{" +
                "subject='" + subject + '\'' +
                '}';
    }
}
