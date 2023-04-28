package it.zeneli.gestionale_logistico.rs;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/api")
public class RestApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<>();
        //classes.add(ChartResource.class);
        //classes.add(JacksonConfiguration.class);
        //classes.add(HeadersFilter.class);

        //BaseDao.initFactory();

        return classes;
    }
}
