package controller;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by l on 12/4/2016.
 */
public class Servlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
            String firstLine = request.getParameter("firstsentence");
            String secondLine = request.getParameter("secondsentence");
            double similarity = new WordProcessor().getSimilarity(firstLine,secondLine);
            //System.out.println("Cosine similarity of Two Contents are: "+similarity);
            PrintWriter out = response.getWriter();
            out.println("The Cosine Similarity of two documents are " +similarity);

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
