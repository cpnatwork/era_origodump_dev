package era.foss.tracer.test;

import era.foss.tracing.annotations.Requirement;

public class CpnAnnotatedForTracingB {

    @Requirement(reqid = "200000_so", reviewers = {"CPN", "Poldi"})
    public String toString() {
        return "Hello Tracer";
    }

}
