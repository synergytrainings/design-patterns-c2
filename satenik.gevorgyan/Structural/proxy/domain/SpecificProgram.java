package proxy.domain;


public class SpecificProgram implements Application {
    private String realPath = "realpath";
    private String programName;

    public SpecificProgram(String programName) {
        this.programName = programName;
    }

    @Override
    public void run() {
        System.out.println("Running the programm" + programName);
    }
}
