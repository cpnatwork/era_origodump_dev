package era.foss.tracer.test;

import era.foss.tracing.annotations.Requirement;

public class CpnAnnotatedForTracingA {

    @Requirement(reqid = "100000_so", reviewers = {"CPN", "Poldi"})
    public String toString() {
        return "Hello Tracer";
    }

}
