package pe.edu.cibertec.gchstruts2.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import java.util.Date;

public class AuditoriaInterceptor 
    implements Interceptor
{

    @Override
    public void destroy() {
        System.out.println("En el Destroy");
    }

    @Override
    public void init() {
        System.out.println("En el Init");
    }

    @Override
    public String intercept(ActionInvocation ai) 
            throws Exception {
        String clase = ai.getAction().getClass().getName();
        System.out.println("La clase "+clase+" inicia en "+
                new Date());
        long inicio = System.currentTimeMillis();
        
        // EJECUTA EL ACTION !!!!!!!!!!!!!!!!!!!
        String result = ai.invoke();
        
        System.out.println("La clase "+clase+" finaliza en "+
                new Date());
        long ultimo = System.currentTimeMillis();
        System.out.println("Se demoró: "+
                (ultimo-inicio)+" ms.");
        
        return result;
    }
    
}
