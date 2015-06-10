package com.ubiquisense.ubibot.services;
 
import java.io.IOException;
import java.io.OutputStream;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.StreamingOutput;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.jee.MongoHolder;
 
@Path("/logs")
public class LogService {
 
    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public Response findAll() {
        DB db = MongoHolder.connect().getDB("websites");
        DBCollection coll = db.getCollection("logs");
        final DBCursor cursor = coll.find();
 
        StreamingOutput output = new StreamingOutput() {
            public void write(OutputStream out) throws IOException,
                    WebApplicationException {
                com.mongodb.jee.util.JSON.serialize(cursor, out);
            }
        };
        return Response.ok(output).build();
    }
 
}