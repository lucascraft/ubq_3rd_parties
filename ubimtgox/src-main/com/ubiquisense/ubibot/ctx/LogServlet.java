package com.ubiquisense.ubibot.ctx;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.util.JSON;
 
public class LogServlet extends HttpServlet {
 
    /**
	 * 
	 */
	private static final long serialVersionUID = -8592606470284881145L;

	@Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
 
        // Connect to Mongo DB
        MongoClientURI mongoURI = new MongoClientURI(
                "mongodb://localhost:27017");
        MongoClient mongo = new MongoClient(mongoURI);
        try {
 
            // Get "logs" collection from the "websites" DB.
            DB db = mongo.getDB("websites");
            DBCollection coll = db.getCollection("logs");
 
            // Find all DB object from the DB collection
            DBCursor cursor = coll.find();
 
            // HTTP response is JSON
            response.setCharacterEncoding("UTF-8");
            response.setContentType("application/json");
 
            // Write in the HTTP response, the JSON array of the cursor.
            Writer writer = response.getWriter();
            StringBuilder buf = new StringBuilder();
            JSON.serialize(cursor, buf);
            writer.write(buf.toString());
            writer.flush();
 
        } finally {
            mongo.close();
        }
    }
}