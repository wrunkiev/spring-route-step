import java.util.Map;

public class Step {
    private Long id;
    private Service serviceFrom;
    private Service serviceTo;
    Map paramsServiceFrom;
    Map paramsServiceTo;

    public Long getId() {
        return id;
    }

    public Service getServiceFrom() {
        return serviceFrom;
    }

    public Service getServiceTo() {
        return serviceTo;
    }

    public Map getParamsServiceFrom() {
        return paramsServiceFrom;
    }

    public Map getParamsServiceTo() {
        return paramsServiceTo;
    }
}
