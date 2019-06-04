import static spark.Spark.*;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import java.util.HashMap;
import java.util.Map;

public class App{
    public static void main(String[] args) {
        staticFileLocation("/public");
        String layout = "templates/layout.vtl";

        get("/", (request, response) ->{
            Map<String,Object> model = new HashMap<String, Object>();
            model.put("template", "templates/index.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        get("/about", (request,response)->{
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("template", "templates/about.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        get("/fundi", (request,response)->{
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("template", "templates/fundi.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        get("/house-cleaning", (request,response)->{
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("template", "templates/house-cleaning.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        get("/moving", (request,response)->{
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("template", "templates/moving.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        get("/gardening", (request,response)->{
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("template", "templates/gardening.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        get("/workers-form", (request,response)->{
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("template", "templates/workers-form.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        get("/clients-form", (request,response)->{
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("template", "templates/clients-form.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        post("/workers-form", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("template", "templates/worker-map.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        post("/clients-form", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("template", "templates/client-map.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        get("/client-map", (request,response)->{
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("template", "templates/client-map.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        get("/worker-map", (request,response)->{
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("template", "templates/worker-map.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());
    }
}