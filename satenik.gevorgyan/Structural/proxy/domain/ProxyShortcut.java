package proxy.domain;


public class ProxyShortcut implements Application{
    private SpecificProgram program;
    private String programName;

    public ProxyShortcut(String programName) {
        this.programName = programName;
    }

    @Override
    public void run() {
        if(program == null){
            program = new SpecificProgram(this.programName);
        }
        program.run();
    }

    public SpecificProgram getProgram() {
        return program;
    }

    public void setProgram(SpecificProgram program) {
        this.program = program;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }
}
