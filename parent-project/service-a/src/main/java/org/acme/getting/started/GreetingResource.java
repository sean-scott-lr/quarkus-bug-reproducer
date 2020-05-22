package org.acme.getting.started;

import com.lr.core.model.Identifier;
import com.lr.svc.a.model.SvcAModel;
import org.infinispan.client.hotrod.RemoteCacheManager;
import org.infinispan.client.hotrod.RemoteCacheManagerAdmin;
import org.infinispan.commons.api.BasicCache;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @Inject
    RemoteCacheManager cacheManager;
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        SvcAModel result = getCache().get("hello");
        if( result == null ){
            result = new SvcAModel("hello");
            getCache().put("hello",result);
        }
        return result.getId().getSomeString();
    }

    private BasicCache<String, SvcAModel> getCache(){
        return cacheManager.administration().getOrCreateCache("testCache", "*-cache");
    }
}