import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


public class Controller {
    @Autowired
    private Route route;
    @Autowired
    private Service service;
    @Autowired
    private Step step;

    @RequestMapping(method = RequestMethod.GET, value = "/controller", produces = "text/plain")
    public void callByBean(){
        route.getId();
        route.getSteps();

        service.getId();
        service.getName();
        service.getParamsToCall();

        step.getId();
        step.getParamsServiceFrom();
        step.getParamsServiceTo();
        step.getServiceFrom();
        step.getServiceTo();
    }
}
