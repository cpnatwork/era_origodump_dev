package era.foss.tracer.test;

import era.foss.tracing.annotations.Requirement;

public class CpnAnnotatedForTracingC {

    @Requirement(reqid = "300000_so", reviewers = {"CPN", "Poldi"})
    public String toString() {
        return "Hello Tracer";
    }

}
