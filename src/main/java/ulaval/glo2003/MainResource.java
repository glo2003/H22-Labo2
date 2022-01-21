package ulaval.glo2003;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("")
public class MainResource {

    @GET
    public Response getMain() {
        return Response.status(400).build();
    }

    @POST
    @Path("/test/{testId}")
    public Response postTest(@PathParam("testId") String testId, TestRequest testRequest) {
        return Response.ok(testRequest).build();
    }
}
